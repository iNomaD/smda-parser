package etu.wollen.cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//ñòðîêà òàáëèöû xls (àáñòðàêòíûé êëàññ)
abstract class Txrow {
	private int size;
	private String[] fld;
	
	public Txrow(int size){
		this.size = size;
		fld = new String[size];
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return fld[i];
	}
	
	public void set(int i, String str){
		if(i < 0 || i >= size){
			System.out.println("Field index out of range");
			return;
		}
		fld[i] = str;
	}
}

//ñòðîêà 1 òàáëèöû
class T1row extends Txrow{
	/*
	 * 0 = íîìåð ï/ï
	 * 1 = ðåã íîìåð
	 * 2 = ôèî
	 * 3 = íîìåð ýïèçîäà
	 * 4 = êîä ìåä óñëóãè
	 * 5 = óñëóãà
	 * 6 = íàèìåíîâàíèå òåñòà
	 * 7 = ïîíÿòèå (ðåçóëüòàò)
	 * 8 = åäèíèöà èçìåðåíèÿ
	 * 9 = äàòà âûïîëíåíèÿ
	 * 10 = âðåìÿ âûïîëíåíèÿ
	 */
	public final static int size = 11;
	public T1row(){
		super(11);
	}
}

//ñòðîêà 2 òàáëèöû
class T2row extends Txrow{
	/*
	 * 0 = íîìåð ï/ï
	 * 1 = ðåã íîìåð
	 * 2 = ôèî
	 * 3 = íîìåð ìåä êàðòû
	 * 4 = ñòàòóñ
	 * 5 = äàòà âûïîëíåíèÿ
	 * 6 = äàííûå
	 */
	public final static int size = 7;
	public T2row(){
		super(7);
	}
}


public class TableParser {

	private DBConnector db = null;
	private ArrayList<T1row> tab1 = null;
	private static ArrayList<T2row> tab2 = null;
	
	final static String newline = "<BR>";
	
	public TableParser(DBConnector db){
		this.db = db;
		tab1 = new ArrayList<T1row>();
		tab2 = new ArrayList<T2row>();
	}
	
	public void clearBD(){
		db.deleteBD();
	}
	
	public void upload(){
		db.upload(tab1, tab2);
	}
	
	public void parse(String table1, String table2) throws Exception{
		BufferedReader br = null;
		try {
			//÷èòàåì ïåðâóþ òàáëèöó
			br = new BufferedReader(new FileReader(table1));
		    String line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 11){
		    		if(len == 8){ //åñëè ïðîäîëæåíèå 7 ñòîëáöà íà äðóãîé ñòðîêå
			    		T1row row = tab1.get(tab1.size()-1);
			    		row.set(7, row.get(7)+newline+parts[7]);
		    		}
		    		else{  //åñëè òàì âîîáùå íè÷åãî íå ðàñïàðñèòü íà ñòðîêå
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{ // åñëè âñ¸ íîðìàëüíî
		    		T1row row = new T1row();
		    		for(int i=0; i<11; ++i){
		    			row.set(i, parts[i]);
		    		}
		    		tab1.add(row);
		    	}
		        line = br.readLine();
		    }
		    br.close();
		    
		    //÷èòàåì âòîðóþ òàáëèöó
			br = new BufferedReader(new FileReader(table2));
		    line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 7){ 
		    		if(len == 1){ //åñëè áûëè êðèâûå ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]);
		    		}
		    		else if(len == 2){ ////åñëè áûëè êðèâûå ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]+newline+parts[1]);		
		    		}
		    		else{ // åñëè âîîáùå íè÷åãî íå ðàñïàðñèòü íà ñòðîêå
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{
		    		//åñëè ïðîäîëæåíèå 6 ñòîëáöà íà äðóãîé ñòðîêå
		    		if(parts[0].equals("") && parts[1].equals("") && !parts[6].equals("")){
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[6]);
		    		}
		    		else{ // åñëè âñ¸ íîðìàëüíî
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
		    
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
		    br.close();
		}
	}
}
