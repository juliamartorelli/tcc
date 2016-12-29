package xml;

import java.io.File;

public class ReadFile {
	public String nameAuthor;
	public String idAuthor;
	public String lastNameAuthor;
	
	public ReadFile(){}
	
	public ReadFile(String nameAuthor, String idAuthor, String lastNameAuthor){
		this.nameAuthor = nameAuthor;
		this.idAuthor = idAuthor;
		this.lastNameAuthor = lastNameAuthor;
	}
	
	public void accessDirectory(final File folder) {
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	accessDirectory(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
		
		
	}
	
	
}
