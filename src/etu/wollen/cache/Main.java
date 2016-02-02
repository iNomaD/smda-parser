package etu.wollen.cache;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		//data for connection
		String url = "jdbc:Cache://localhost:1972/DENIS";
		String username = "denis";
		String password = "root";
		
		//create and start parser
		DBConnector dbc = new DBConnector(url, username, password);
		DBUploader dbu = new DBUploader(dbc);
		
		ArrayList<T1row> tab1 = new ArrayList<T1row>();
		ArrayList<T2row> tab2 = new ArrayList<T2row>();
		ArrayList<T3row> tab3 = new ArrayList<T3row>();
		ArrayList<T3row> tab4 = new ArrayList<T3row>();
		ArrayList<T3row> tab5 = new ArrayList<T3row>();
		
		String table1 = "data/table1.csv";
		String table2 = "data/table2.csv";
		String table3 = "data/qword-20160129132205664.xml";
		String table4 = "data/qword-20160129132836268.xml";
		String table5 = "data/qword-20160129133552531.xml";
		try{
			//clear BD
			dbc.deleteBD();
			
			//parse tables
			CSVParser csv = new CSVParser();
			csv.parse(table1, table2, tab1, tab2);
			
			XMLParser xml = new XMLParser();
			xml.parse(table3, tab3);
			
			//upload data
			dbu.upload(tab1, tab2);
			dbu.uploadT3(tab3);
			
			/* show 2nd table
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
