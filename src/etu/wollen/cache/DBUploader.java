package etu.wollen.cache;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.intersys.objects.CacheException;
import com.intersys.objects.Database;

import smda.Analysis;
import smda.Epicrisis;
import smda.Episode;
import smda.NumericCriterium;
import smda.OrganolepticCriterium;
import smda.Patient;
import smda.Test;

public class DBUploader {
	private DBConnector connector;
	private Database dbcon;
	
	public DBUploader(DBConnector connector){
		this.connector = connector;
	}
	
	private Patient patientExists(String regNumber, List<Patient> patList) throws CacheException{
		for(Patient p : patList){
			if(p.getRegNumber().equals(regNumber)){
				return p;
			}
		}
		return null;
	}
	
	private Episode episodeExists(String epNumber, List<Episode> epList) throws CacheException{
		for(Episode ep : epList){
			if(ep.getEpisodeNumber().equals(epNumber)){
				return ep;
			}
		}
		return null;
	}
	
	private Analysis analysisExists(String servCode, List<Analysis> anList) throws CacheException{
		for(Analysis an : anList){
			if(an.getServiceCode().equals(servCode)){
				return an;
			}
		}
		return null;
	}
	
	private Test testExists(String anName, List<Test> testList) throws CacheException{
		for(Test test : testList){
			if(test != null && test.getNameOfTest().equals(anName)){
				return test;
			}
		}
		return null;
	}
	
	private Epicrisis diaryExists(String diaryData, List<Epicrisis> diaryList) throws CacheException{
		for(Epicrisis d : diaryList){
			if(d.getData().equals(diaryData)){
				return d;
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
	
	private List<Patient> getAllPatients() throws CacheException{
		List<Patient> pats = new ArrayList<Patient>();
		Iterator k = dbcon.openByQuery("SELECT smda.Patient.%ID FROM smda.Patient");
		while (k.hasNext()) {
			pats.add(((Patient) k.next()));
		}

		return pats;
	}
	
	private Test createTest(String anName, String result, String mesUn, Patient patient) throws CacheException{
		//Organoliptic
		if(mesUn.equals("???")){
			OrganolepticCriterium test = new OrganolepticCriterium(dbcon);
			test.setNameOfTest(anName);
			test.setPatient(patient);
			test.setTypeOfTest("Organoleptic");
			test.setResult(result);
			return test;
		}
		//Numeric
		else{
			NumericCriterium test = new NumericCriterium(dbcon);
			test.setNameOfTest(anName);
			test.setPatient(patient);
			test.setTypeOfTest("Numeric");
			try{
				test.setNumericResult(Double.parseDouble(result));
			}
			catch(NumberFormatException e){
				//can not parse
			}
			test.setMesurementUnits(mesUn);
			return test;
		}
	}
	
	public void uploadT3(ArrayList<T3row> tab){
		
	}
	
	public void upload(ArrayList<T1row> tab1, ArrayList<T2row> tab2){
		//connect
		dbcon = connector.connect();
		
		//load all patients from database
		List<Patient> pats;
		try {
			pats = getAllPatients();
		} catch (CacheException e) {
			e.printStackTrace();
			System.out.println("Error while loading database. Exit.");
			return;
		}
		
		try {
			//processing 1st table
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
					//patient exists
					Episode ep = episodeExists(epNumber, patient.getEpisodes().asList());
					if(ep != null){
						//episode exists
						Analysis an = analysisExists(serviceCode, ep.getAnalyses().asList());
						if(an != null){
							//analysis exists
							Test test = testExists(anName, an.getTests().asList());
							if(test == null){
								//test doesn't exist
								//new test
								Test test1 = createTest(anName, result, mesUn, patient);
								an.getTests().asList().add(test1);
							}
						}
						else{
							//new analysis
							Analysis an1 = new Analysis(dbcon);
							an1.setServiceCode(serviceCode);
							an1.setServiceName(serviceName);
							an1.setmDate(date);
							an1.setmTime(time);
							ep.getAnalyses().asList().add(an1);
							
							//new test
							Test test = createTest(anName, result, mesUn, patient);
							an1.getTests().asList().add(test);
						}
					}
					else{
						//new episode
						ep = new Episode(dbcon);
						patient.getEpisodes().asList().add(ep);
						ep.setEpisodeNumber(epNumber);
						
						//new analysis
						Analysis an1 = new Analysis(dbcon);
						an1.setServiceCode(serviceCode);
						an1.setServiceName(serviceName);
						an1.setmDate(date);
						an1.setmTime(time);
						ep.getAnalyses().asList().add(an1);
						
						//new test
						Test test = createTest(anName, result, mesUn, patient);
						an1.getTests().asList().add(test);
					}
				}
				else{
					//new patient
					patient = new Patient(dbcon);
					pats.add(patient);
					patient.setFIO(fio);
					patient.setMedCardNumber("");
					patient.setRegNumber(regNumber);
					
					//new episode
					Episode ep = new Episode(dbcon);
					patient.getEpisodes().asList().add(ep);
					ep.setEpisodeNumber(epNumber);
					
					//new analysis
					Analysis an1 = new Analysis(dbcon);
					an1.setServiceCode(serviceCode);
					an1.setServiceName(serviceName);
					an1.setmDate(date);
					an1.setmTime(time);
					ep.getAnalyses().asList().add(an1);
					
					//new test
					Test test = createTest(anName, result, mesUn, patient);
					an1.getTests().asList().add(test);
				}
			}
			System.out.println("upload 1 table - OK");
			
			// processing 2nd table
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
						//new entry if doesn't exist
						Epicrisis diary = new Epicrisis(dbcon);
						diary.setData(data);
						diary.setmDate(mDate);
						diary.setStatus(status);
						patient.getEpicrises().asList().add(diary);
					}
					
				}
				else{
					//new patient
					patient = new Patient(dbcon);
					pats.add(patient);
					patient.setFIO(fio);
					patient.setMedCardNumber(medCardNumber);
					patient.setRegNumber(regNumber);
					
					//new diary
					Epicrisis diary = new Epicrisis(dbcon);
					diary.setData(data);
					diary.setmDate(mDate);
					diary.setStatus(status);
					patient.getEpicrises().asList().add(diary);
				}
			}
			System.out.println("upload 2 table - OK");
		}
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
			return;
		}
		
		connector.save();
	}
}
