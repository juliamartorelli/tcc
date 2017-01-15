package xml;

import java.io.File;
import java.util.ArrayList;

public class Main {
	
	public static final ReadXMLFile rF = new ReadXMLFile();
	public static final File folder = new File("C:/Users/julia/Documents/arquivosTCC/");
	public static ArrayList<File> receiveArq = new ArrayList<File>();
	
	public static void main(String[] args) {
		
			receiveArq = rF.accessDirectory(folder);
			for (int i = 0; i <= receiveArq.size(); i++) {
				try {
					rF.readTheFiles(receiveArq.get(i));	
				} catch (ArrayIndexOutOfBoundsException e) {
					  System.out.println("erro: " + e);
				}
			}
	}

}
