package xml;

import java.io.File;
import java.util.ArrayList;

public class Main {
	
	public static final ReadXMLFile rF = new ReadXMLFile();
	public static final File folder = new File("/Users/Julia/Documents/TCC/");
	public static ArrayList<File> receiveArq = new ArrayList<File>();
	
	public static void main(String[] args) {
		receiveArq = rF.accessDirectory(folder);
		for(int i = 0; i <= receiveArq.size(); i++){
			rF.readTheFiles(receiveArq.get(i));			
		}
	}

}
