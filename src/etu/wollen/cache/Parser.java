package etu.wollen.cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//������ ������� xls (����������� �����)
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

//������ 1 �������
class T1row extends Txrow{
	/*
	 * 0 = ����� �/�
	 * 1 = ��� �����
	 * 2 = ���
	 * 3 = ����� �������
	 * 4 = ��� ��� ������
	 * 5 = ������
	 * 6 = ������������ �����
	 * 7 = ������� (���������)
	 * 8 = ������� ���������
	 * 9 = ���� ����������
	 * 10 = ����� ����������
	 */
	public final static int size = 11;
	public T1row(){
		super(11);
	}
}

//������ 2 �������
class T2row extends Txrow{
	/*
	 * 0 = ����� �/�
	 * 1 = ��� �����
	 * 2 = ���
	 * 3 = ����� ��� �����
	 * 4 = ������
	 * 5 = ���� ����������
	 * 6 = ������
	 */
	public final static int size = 7;
	public T2row(){
		super(7);
	}
}


public class Parser {

	private DBConnector db = null;
	private ArrayList<T1row> tab1 = null;
	private static ArrayList<T2row> tab2 = null;
	
	final static String newline = "<BR>";
	
	public Parser(DBConnector db){
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
			//������ ������ �������
			br = new BufferedReader(new FileReader(table1));
		    String line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 11){
		    		if(len == 8){ //���� ����������� 7 ������� �� ������ ������
			    		T1row row = tab1.get(tab1.size()-1);
			    		row.set(7, row.get(7)+newline+parts[7]);
		    		}
		    		else{  //���� ��� ������ ������ �� ���������� �� ������
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{ // ���� �� ���������
		    		T1row row = new T1row();
		    		for(int i=0; i<11; ++i){
		    			row.set(i, parts[i]);
		    		}
		    		tab1.add(row);
		    	}
		        line = br.readLine();
		    }
		    br.close();
		    
		    //������ ������ �������
			br = new BufferedReader(new FileReader(table2));
		    line = br.readLine();
		    line = br.readLine();
		    while (line != null) {
		    	String[] parts = line.split(";");
		    	int len = parts.length;
		    	if(len < 7){ 
		    		if(len == 1){ //���� ���� ������ ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]);
		    		}
		    		else if(len == 2){ ////���� ���� ������ ';'
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[0]+newline+parts[1]);		
		    		}
		    		else{ // ���� ������ ������ �� ���������� �� ������
		    			System.out.println("Can't parse: "+line);
		    		}
		    	}
		    	else{
		    		//���� ����������� 6 ������� �� ������ ������
		    		if(parts[0].equals("") && parts[1].equals("") && !parts[6].equals("")){
			    		T2row row = tab2.get(tab2.size()-1);
			    		row.set(6, row.get(6)+newline+parts[6]);
		    		}
		    		else{ // ���� �� ���������
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
	
	public static void main(String args[]) {
		Parser parser = new Parser(new DBConnector());
		String table1 = "table1.csv";
		String table2 = "table2.csv";
		try{
			parser.clearBD();
			parser.parse(table1, table2);
			parser.upload();
			
			/* ������� ������ ������� ����� ���� ��� ����������
			for(T2row row : tab2){
				String out = "";
				for(int i=0; i<T2row.size; ++i){
					out+= (new Integer(i)).toString()+": "+row.get(i)+" ";
				}
				System.out.println(out);
			}
			*/
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
