package etu.wollen.cache;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
	public void parse(String table, ArrayList<T3row> tab) throws Exception{
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		f.setValidating(false);
		try{
			//opening document
			DocumentBuilder builder = f.newDocumentBuilder();
			Document doc = builder.parse(new File(table));
			
			//get all rows
			NodeList rows = doc.getElementsByTagName("OXy");
			for(int i=0; i<rows.getLength(); ++i){
				Element node = (Element)rows.item(i);
				T3row row = new T3row();
				row.set(0, node.getElementsByTagName("Zs0c0").item(0).getTextContent());
				row.set(1, node.getElementsByTagName("Zs0c1").item(0).getTextContent());
				row.set(2, node.getElementsByTagName("Zs0c2").item(0).getTextContent());
				row.set(3, node.getElementsByTagName("Zs0c3").item(0).getTextContent());
				row.set(4, node.getElementsByTagName("Zs0c4").item(0).getTextContent());
				row.set(5, node.getElementsByTagName("Zs0c5").item(0).getTextContent());
				row.set(6, node.getElementsByTagName("Zs0c6").item(0).getTextContent());
				row.set(7, node.getElementsByTagName("Zs0c7").item(0).getTextContent());
				row.set(8, node.getElementsByTagName("Zs0c8").item(0).getTextContent());
				row.set(9, node.getElementsByTagName("Zs0c9").item(0).getTextContent());
				row.set(10, node.getElementsByTagName("Zs0c10").item(0).getTextContent());
				row.set(11, node.getElementsByTagName("Zs0c11").item(0).getTextContent());
				tab.add(row);
			}
			System.out.println("Parse table "+table+" - OK");
		}
		catch(Exception e){
			throw new Exception("Problem with parsing "+table, e);
		}
	}
}
