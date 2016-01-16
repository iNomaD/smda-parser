package etu.wollen.cache;

public class Main {
	public static void main(String args[]) {
		TableParser parser = new TableParser(new DBConnector());
		String table1 = "table1.csv";
		String table2 = "table2.csv";
		try{
			parser.clearBD();
			parser.parse(table1, table2);
			parser.upload();
			
			/* ÂÛÂÅÑÒÈ ÂÒÎĞÓŞ ÒÀÁËÈÖÓ ÏÎÑËÅ ÒÎÃÎ ÊÀÊ ĞÀÑÏÀĞÑÈËÈ
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
