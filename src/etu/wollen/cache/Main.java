package etu.wollen.cache;

public class Main {
	public static void main(String args[]) {
		//данные для подключения
		String url = "jdbc:Cache://localhost:1972/DENIS";
		String username = "denis";
		String password = "root";
		
		//создание и запуск парсера
		TableParser parser = new TableParser(new DBConnector(url, username, password));
		String table1 = "table1.csv";
		String table2 = "table2.csv";
		try{
			parser.clearBD();
			parser.parse(table1, table2);
			//parser.upload();
			
			/* ВЫВЕСТИ ВТОРУЮ ТАБЛИЦУ ПОСЛЕ ТОГО КАК РАСПАРСИЛИ
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
