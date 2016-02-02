package etu.wollen.cache;

import smda.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.intersys.classes.ListOfObjects;
import com.intersys.classes.ListOfObjectsWithClassName;
import com.intersys.classes.Persistent;
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
	private String url;
	private String username;
	private String password;
	
	public DBConnector(String url, String username, String password){
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public Database connect() {
		try {
			// Connect to the Cache' database
			dbcon = CacheDatabase.getDatabase(url, username, password);
			return dbcon;
		}
		// Handle exceptions
		catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
			return null;
		}
	}
	
	public void save(){
		try {
			//save
			dbcon.saveAllObjects();
			
			//close connection
			dbcon.close();
			
			System.out.println("save OK");
		} catch (CacheException ex) {
			System.out.println("Caught exception: " + ex.getClass().getName() + ": " + ex.getMessage());
		}
	}
	
	public void deleteBD(){
		connect();
		try {
			//kill all globals
			NumericCriterium.sys_KillExtent(dbcon);
			OrganolepticCriterium.sys_KillExtent(dbcon);
			Test.sys_KillExtent(dbcon);
			Analysis.sys_KillExtent(dbcon);
			Episode.sys_KillExtent(dbcon);
			Epicrisis.sys_KillExtent(dbcon);
			Patient.sys_KillExtent(dbcon);
			
			//close connection
			dbcon.close();
			
			System.out.println("CLEAR BD - OK");
		} catch (CacheException e) {
			e.printStackTrace();
			System.out.println("Error while manipulation database. Exit.");
			return;
		}
	}
}
