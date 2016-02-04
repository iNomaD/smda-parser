package etu.wollen.cache;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.intersys.objects.CacheException;
import com.intersys.objects.Database;

import smda.Analysis;
import smda.Doctor;
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
	
	private void connect(){
		dbcon = connector.connect();
	}
	
	private void save(){
		connector.save();
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
	
	private Epicrisis diaryExists(String diaryData, Date mDate, List<Epicrisis> diaryList) throws CacheException{
		for(Epicrisis d : diaryList){
			if(d.getData().equals(diaryData)){
				if(d.getmDate().equals(mDate)){
					return d;
				}
			}
		}
		return null;
	}
	
	private Doctor doctorExists(String name, List<Doctor> docList) throws CacheException{
		for(Doctor d : docList){
			if(d.getName().equals(name)){
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
	
	private List<Doctor> getAllDoctors() throws CacheException{
		List<Doctor> docs = new ArrayList<Doctor>();
		Iterator k = dbcon.openByQuery("SELECT smda.Doctor.%ID FROM smda.Doctor");
		while (k.hasNext()) {
			docs.add(((Doctor) k.next()));
		}

		return docs;
	}
	
	private Patient createPatient(List<Patient> pats, String FIO, String regNumber, String medCardNumber) throws CacheException{
		Patient pat = patientExists(regNumber, pats);
		if(pat == null){
			pat = new Patient(dbcon);
			pats.add(pat);
			pat.setFIO(FIO);
			pat.setRegNumber(regNumber);
			if(medCardNumber != null) pat.setMedCardNumber(medCardNumber);
		}
		else{
			if(pat.getFIO().equals("") || pat.getFIO().equals("???")){
				pat.setFIO(FIO);
			}
			if(pat.getMedCardNumber().equals("") || pat.getMedCardNumber().equals("???")){
				pat.setMedCardNumber(medCardNumber);
			}
		}
		return pat;
	}
	
	private Doctor createDoctor(List<Doctor> docs, String doctor) throws CacheException{
		Doctor doc = doctorExists(doctor, docs);
		if(doc == null){
			doc = new Doctor(dbcon);
			doc.setName(doctor);
			docs.add(doc);
		}
		return doc;
	}
	
	private Episode createEpisode(List<Episode> eps, String epNumber, Date startDate, Date endDate, Doctor doc) throws CacheException{
		Episode ep = episodeExists(epNumber, eps);
		if(ep == null){
			ep = new Episode(dbcon);
			eps.add(ep);
			ep.setEpisodeNumber(epNumber);
			if(doc != null) ep.setDoctor(doc);
			if(startDate != null) ep.setStartDate(startDate);
			if(endDate != null) ep.setEndDate(endDate);
		}
		return ep;
	}
	
	private Analysis createAnalysis(List<Analysis> ans, String serviceCode, String serviceName, Date date, Time time) throws CacheException{
		Analysis an = analysisExists(serviceCode, ans);
		if(an == null){
			an = new Analysis(dbcon);
			ans.add(an);
			an.setServiceCode(serviceCode);
			an.setServiceName(serviceName);
			if(date != null) an.setmDate(date);
			if(time != null) an.setmTime(time);
		}
		return an;
	}
	
	private Test createTest(List<Test> tl, String anName, String result, String mesUn, Patient patient) throws CacheException{
		Test tst = testExists(anName, tl);
		if(tst == null){
			//Organoliptic
			if(mesUn.equals("???")){
				OrganolepticCriterium test = new OrganolepticCriterium(dbcon);
				test.setNameOfTest(anName);
				test.setPatient(patient);
				test.setTypeOfTest("Organoleptic");
				test.setResult(result);
				tl.add(test);
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
				tl.add(test);
				return test;
			}
		}
		return tst;
	}
	
	private Epicrisis createEpicrisis(List<Epicrisis> diaries, String data, String status, Date mDate, Episode episode) throws CacheException{
		Epicrisis diary = diaryExists(data, mDate, diaries);
		if(diary == null){
			diary = new Epicrisis(dbcon);
			diaries.add(diary);
			diary.setData(data);
			diary.setStatus(status);
			if(mDate != null) diary.setmDate(mDate);
			if(episode != null) diary.setEpisode(episode);
		}
		return diary;
	}
	
	public void uploadT1(ArrayList<T1row> tab1){
		//connect
		connect();
		
		try {
			//load all patients from database
			List<Patient> pats = getAllPatients();
			
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
				
				Patient patient = createPatient(pats, fio, regNumber, "");
				Episode episode = createEpisode(patient.getEpisodes().asList(), epNumber, null, null, null);
				Analysis analysis = createAnalysis(episode.getAnalyses().asList(), serviceCode, serviceName, date, time);
				createTest(analysis.getTests().asList(), anName, result, mesUn, patient);
			}
			
			//save
			save();
			System.out.println("upload T1 table - OK");
		
		}
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
			return;
		}
	}
	
	public void uploadT2(ArrayList<T2row> tab2){
		//connect
		connect();
		
		try{
			//load all patients from database
			List<Patient> pats = getAllPatients();
			
			// processing 2nd table
			for(int i=0; i<tab2.size(); ++i){
				T2row row = tab2.get(i);
				String regNumber = row.get(1);
				String fio = row.get(2);
				String medCardNumber = row.get(3);
				String status = row.get(4);
				Date mDate = parseDate(row.get(5));
				String data = row.get(6);
				
				Patient patient = createPatient(pats, fio, regNumber, medCardNumber);
				createEpicrisis(patient.getEpicrises().asList(), data, status, mDate, null);
			}
			
			//save
			save();
			System.out.println("upload T2 table - OK");
		}
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
			return;
		}
	}
	
	public void uploadT3(ArrayList<T3row> tab){
		//connect
		connect();
		
		try{
			//load all patients from database
			List<Patient> pats = getAllPatients();
			List<Doctor> docs = getAllDoctors();
			
			//processing the table
			for(int i=0; i<tab.size(); ++i){
				T3row row = tab.get(i);
				String regNumber = row.get(1);
				String fio = row.get(2) + " " + row.get(3) + " " + row.get(4);
				String epNumber = row.get(5);
				Date endDate = parseDate(row.get(6));
				String status = row.get(8);
				Date mDate = parseDate(row.get(9));
				String data = row.get(10);
				String doctor = row.get(11);
				
				Patient patient = createPatient(pats, fio, regNumber, "");
				Doctor doc = createDoctor(docs, doctor);
				Episode episode = createEpisode(patient.getEpisodes().asList(), epNumber, null, endDate, doc);
				createEpicrisis(patient.getEpicrises().asList(), data, status, mDate, episode);
			}
			
			//save
			save();
			System.out.println("upload T3 table - OK");
		}
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
			return;
		}
	}
}
