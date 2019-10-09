package input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class TxtParser {
	
	public TxtParser(File file) throws FileNotFoundException{
		read(file);
	}
	
	public void read(File file) throws FileNotFoundException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		try {
			line = bufferedReader.readLine();
			while (line != null) {
				   System.out.println(line);
		 
				   StringTokenizer stringTokenizer = new StringTokenizer(line, ":");
		 
				   while (stringTokenizer.hasMoreElements()) {
					   stringTokenizer.nextElement();
					   String name = stringTokenizer.nextElement().toString();
					   
				   }
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
