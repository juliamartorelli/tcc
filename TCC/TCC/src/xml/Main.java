package xml;

import java.io.File;

public class Main {
	
	public static final ReadFile rF = new ReadFile();
	public static final File folder = new File("/Users/Julia/Documents/TCC/");

	public static void main(String[] args) {
		rF.accessDirectory(folder);
	}

}
