package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

public class ReadXMLFile {
	
	public ArrayList<File> al = new ArrayList<File>();
	
	public ArrayList<File> accessDirectory(final File folder) {
		for (final File fileEntry : folder.listFiles()) {
	        try {
	        	al.add(fileEntry);
	        } catch (Exception e) {
				  System.out.println("erro: " + e);
	        }
	    }	
		return al;
	}
	
	public void readTheFiles(File fXmlFile){
	    try {    	    		
	    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    	Document doc = dBuilder.parse(fXmlFile);

	    // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	    	doc.getDocumentElement().normalize();

	    	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	    	NodeList nList = doc.getElementsByTagName("PRODUCAO-BIBLIOGRAFICA");

	    	System.out.println("----------------------------");

	    	for (int temp = 0; temp < nList.getLength(); temp++) {

	    		Node nNode = nList.item(temp);

	    		System.out.println("\nCurrent Element :" + nNode.getNodeName());

	    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	    			Element eElement = (Element) nNode;

	    			System.out.println("Produções Bibliográficas: " + eElement.getAttribute("TRABALHOS-EM-EVENTOS"));
	    			/*System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
	    			System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
	    			System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
	    			System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());*/

	    		}
	    	}
	        } catch (Exception e) {
	    	e.printStackTrace();
	        }
	}
}
