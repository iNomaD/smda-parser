package etu.wollen.cache;

import smda.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.intersys.classes.ListOfObjects;
import com.intersys.classes.ListOfObjectsWithClassName;
import com.intersys.classes.RelationshipObject;
import com.intersys.jdbc.SysList;
import com.intersys.objects.CacheDatabase;
import com.intersys.objects.CacheException;
import com.intersys.objects.Database;
import com.intersys.objects.Id;
import com.intersys.objects.Oid;
import com.intersys.objects.SList;
import com.intersys.objects.SysListHolder;

public class DBConnector {
	
	private Database dbcon;
	
	private Patient patientExists(String regNumber, List<Patient> patList){
		for(Patient p : patList){
			try {
				if(p.getRegNumber().equals(regNumber)){
					return p;
				}
			} catch (CacheException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private Episode episodeExists(String epNumber, List<Episode> epList){
		for(Episode ep : epList){
			try {
				if(ep.getEpisodeNumber().equals(epNumber)){
					return ep;
				}
			} catch (CacheException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private Analysis analysisExists(String servCode, List<Analysis> anList){
		for(Analysis an : anList){
			try {
				if(an.getServiceCode().equals(servCode)){
					return an;
				}
			} catch (CacheException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private Test testExists(String anName, List<Test> testList){
		for(Test test : testList){
			try{
				if(test.getNameOfTest().equals(anName)){
					return test;
				}
			} catch(CacheException e){
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private Epicrisis diaryExists(String diaryData, List<Epicrisis> diaryList){
		for(Epicrisis d : diaryList){
			try {
				if(d.getData().equals(diaryData)){
					return d;
				}
			} catch (CacheException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public Date parseDate(String date){
		// 29.10.2015 -> 2015-10-29
		String par[] = date.split("\\.");
		if(par.length==3){
			return java.sql.Date.valueOf(par[2]+"-"+par[1]+"-"+par[0]);
		}
		return java.sql.Date.valueOf("1900-01-01");
	}
	
	private Time parseTime(String time){
		// 11:43 -> 11:43:00
		return java.sql.Time.valueOf(time+":00");
	}
	
	private List<Patient> getAllPatients(){
		List<Patient> pats = new ArrayList<Patient>();
		try {
			Iterator k = dbcon.openByQuery("SELECT smda.Patient.%ID FROM smda.Patient");
			while (k.hasNext()) {
				pats.add(((Patient) k.next()));
			}
		} catch (CacheException e) {
			e.printStackTrace();
			return null;
		}
		return pats;
	}
	
	public void upload(ArrayList<T1row> tab1, ArrayList<T2row> tab2){
		connect();
		
		//загружаем всех пациентов из базы данных
		List<Patient> pats = getAllPatients();
		if(pats == null) {
			System.out.println("Error while loading database. Exit.");
		}
		
		try {
			//обрабатываем 1 таблицу
			for(int i=0; i<tab1.size(); ++i){
				T1row row = tab1.get(i);
				String regNumber = row.get(1);
				String fio = row.get(2);
				String epNumber = row.get(3);
				String serviceCode = row.get(4);
				String serviceName = row.get(5);
				String anName = row.get(6);
				String result = row.get(7);
				String mesUn = row.get(8);
				Date date = parseDate(row.get(9));
				Time time = parseTime(row.get(10));
				Patient patient = patientExists(regNumber, pats);
				if(patient != null){
					//пациент уже существует
					Episode ep = episodeExists(epNumber, patient.getEpisodes().asList());
					if(ep != null){
						//эпизод уже существует
						Analysis an = analysisExists(serviceCode, ep.getAnalyses().asList());
						if(an != null){
							//анализ уже существует
							Test test = testExists(anName, an.getlistOfTests());
							if(test == null){
								//тест ещё не существует
								//новый тест
								Test test1 = new Test(dbcon);
								test1.setNameOfTest(anName);
								test1.setResult(result);
								test1.setMesurementUnits(mesUn);
								an.getlistOfTests().add(test1);
							}
						}
						else{
							//новый анализ
							Analysis an1 = new Analysis(dbcon);
							an1.setServiceCode(serviceCode);
							an1.setServiceName(serviceName);
							an1.setmDate(date);
							an1.setmTime(time);
							ep.getAnalyses().asList().add(an1);
							
							//новый тест
							Test test = new Test(dbcon);
							test.setNameOfTest(anName);
							test.setResult(result);
							test.setMesurementUnits(mesUn);
							an1.getlistOfTests().add(test);
						}
					}
					else{
						//новый эпизод
						ep = new Episode(dbcon);
						patient.getEpisodes().asList().add(ep);
						ep.setEpisodeNumber(epNumber);
						
						//новый анализ
						Analysis an1 = new Analysis(dbcon);
						an1.setServiceCode(serviceCode);
						an1.setServiceName(serviceName);
						an1.setmDate(date);
						an1.setmTime(time);
						ep.getAnalyses().asList().add(an1);
						
						//новый тест
						Test test = new Test(dbcon);
						test.setNameOfTest(anName);
						test.setResult(result);
						test.setMesurementUnits(mesUn);
						an1.getlistOfTests().add(test);
					}
				}
				else{
					//новый пациент
					patient = new Patient(dbcon);
					pats.add(patient);
					patient.setFIO(fio);
					patient.setMedCardNumber("");
					patient.setRegNumber(regNumber);
					
					//новый эпизод
					Episode ep = new Episode(dbcon);
					patient.getEpisodes().asList().add(ep);
					ep.setEpisodeNumber(epNumber);
					
					//новый анализ
					Analysis an1 = new Analysis(dbcon);
					an1.setServiceCode(serviceCode);
					an1.setServiceName(serviceName);
					an1.setmDate(date);
					an1.setmTime(time);
					ep.getAnalyses().asList().add(an1);
					
					//новый тест
					Test test = new Test(dbcon);
					test.setNameOfTest(anName);
					test.setResult(result);
					test.setMesurementUnits(mesUn);
					an1.getlistOfTests().add(test);
				}
			}
			System.out.println("1 table - OK");
			
			// обрабатываем 2 таблицу
			for(int i=0; i<tab2.size(); ++i){
				T2row row = tab2.get(i);
				String regNumber = row.get(1);
				String fio = row.get(2);
				String medCardNumber = row.get(3);
				String status = row.get(4);
				Date mDate = parseDate(row.get(5));
				String data = row.get(6);
				
				Patient patient = patientExists(regNumber, pats);
				if(patient != null){
					patient.setFIO(fio);
					if(patient.getMedCardNumber().equals("") || patient.getMedCardNumber().equals("???")){
						patient.setMedCardNumber(medCardNumber);
					}
					
					Epicrisis d = diaryExists(data, patient.getEpicrises().asList());
					if(d == null){
						//новая запись, если такой ещё не существует
						Epicrisis diary = new Epicrisis(dbcon);
						diary.setData(data);
						diary.setmDate(mDate);
						diary.setStatus(status);
						patient.getEpicrises().asList().add(diary);
					}
					
				}
				else{
					//новый пациент
					patient = new Patient(dbcon);
					pats.add(patient);
					patient.setFIO(fio);
					patient.setMedCardNumber(medCardNumber);
					patient.setRegNumber(regNumber);
					
					//новая запись
					Epicrisis diary = new Epicrisis(dbcon);
					diary.setData(data);
					diary.setmDate(mDate);
					diary.setStatus(status);
					patient.getEpicrises().asList().add(diary);
				}
			}
			System.out.println("2 table - OK");
		}
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
		}
		
		save();
	}
	
	public void connect() {
		try {
			// Connect to the Cache' database
			
			String url = "jdbc:Cache://localhost:1972/DENIS";
			String username = "denis";
			String password = "root";
			dbcon = CacheDatabase.getDatabase(url, username, password);
			
			
			//remote access
			/*
			String url = "jdbc:Cache://localhost:1972/DENIS";
			String username = "denis";
			String password = "root";
			dbcon = CacheDatabase.getDatabase(url, username, password);*/
		}
		// Handle exceptions
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
		}
	}
	
	public void save(){
		try {
			dbcon.saveAllObjects();
			System.out.println("save OK");
		} catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
		}
	}
	
	public void deleteBD(){
		/*
		try {
			dbcon.openByQuery("DELETE FROM smda.Diary");
			System.out.println("DELETE BD OK");
		} catch (CacheException e) {
			e.printStackTrace();
			System.out.println("Error while loading database. Exit.");
			return;
		}
		*/
	}
}
