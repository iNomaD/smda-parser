package etu.wollen.cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVParser {
	final static String newline = "<BR>";
	
	public void parse(String table1, String table2, ArrayList<T1row> tab1, ArrayList<T2row> tab2) throws Exception{
		
		BufferedReader br = null;
		try {
			//read 1st table
			br = new BufferedReader(new FileReader(table1));
		    String line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 11){
		    		if(len == 8){ //if 7th column continues at the next row
			    		T1row row = tab1.get(tab1.size()-1);
			    		row.set(7, row.get(7)+newline+parts[7]);
		    		}
		    		else{  //if can't parse this row
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{ // if ok
		    		T1row row = new T1row();
		    		for(int i=0; i<11; ++i){
		    			row.set(i, parts[i]);
		    		}
		    		tab1.add(row);
		    	}
		        line = br.readLine();
		    }
		    br.close();
		    
		    //read 2nd table
			br = new BufferedReader(new FileReader(table2));
		    line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 7){ 
		    		if(len == 1){ //if were wrong ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]);
		    		}
		    		else if(len == 2){ //if were wrong ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]+newline+parts[1]);		
		    		}
		    		else{ //if can't parse this row
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{
		    		//if 6th column continues at the next row
		    		if(parts[0].equals("") && parts[1].equals("") && !parts[6].equals("")){
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[6]);
		    		}
		    		else{ // if ok
			    		T2row row = new T2row();
			    		for(int i=0; i<7; ++i){
			    			row.set(i, parts[i]);
			    		}
			    		tab2.add(row);
		    		}
		    	}
		        line = br.readLine();
		    }
		    br.close();
		    System.out.println("Parse tables - OK");
		}
		catch(Exception e){
			throw new Exception("Problem parsing xlsx", e);
		}
		finally {
		    br.close();
		}
	}
}
