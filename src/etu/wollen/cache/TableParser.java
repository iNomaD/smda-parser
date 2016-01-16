package etu.wollen.cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//строка таблицы xls (абстрактный класс)
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

//строка 1 таблицы
class T1row extends Txrow{
	/*
	 * 0 = номер п/п
	 * 1 = рег номер
	 * 2 = фио
	 * 3 = номер эпизода
	 * 4 = код мед услуги
	 * 5 = услуга
	 * 6 = наименование теста
	 * 7 = понятие (результат)
	 * 8 = единица измерения
	 * 9 = дата выполнения
	 * 10 = время выполнения
	 */
	public final static int size = 11;
	public T1row(){
		super(11);
	}
}

//строка 2 таблицы
class T2row extends Txrow{
	/*
	 * 0 = номер п/п
	 * 1 = рег номер
	 * 2 = фио
	 * 3 = номер мед карты
	 * 4 = статус
	 * 5 = дата выполнения
	 * 6 = данные
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
			//читаем первую таблицу
			br = new BufferedReader(new FileReader(table1));
		    String line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 11){
		    		if(len == 8){ //если продолжение 7 столбца на другой строке
			    		T1row row = tab1.get(tab1.size()-1);
			    		row.set(7, row.get(7)+newline+parts[7]);
		    		}
		    		else{  //если там вообще ничего не распарсить на строке
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{ // если всё нормально
		    		T1row row = new T1row();
		    		for(int i=0; i<11; ++i){
		    			row.set(i, parts[i]);
		    		}
		    		tab1.add(row);
		    	}
		        line = br.readLine();
		    }
		    br.close();
		    
		    //читаем вторую таблицу
			br = new BufferedReader(new FileReader(table2));
		    line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 7){ 
		    		if(len == 1){ //если были кривые ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]);
		    		}
		    		else if(len == 2){ ////если были кривые ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]+newline+parts[1]);		
		    		}
		    		else{ // если вообще ничего не распарсить на строке
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{
		    		//если продолжение 6 столбца на другой строке
		    		if(parts[0].equals("") && parts[1].equals("") && !parts[6].equals("")){
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[6]);
		    		}
		    		else{ // если всё нормально
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
