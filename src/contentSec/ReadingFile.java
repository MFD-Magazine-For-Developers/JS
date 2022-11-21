package contentSec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	
	public String read(String fileInput) {
		
		File file = new File(fileInput);

		BufferedReader br;
		String result = "";
		
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = "";
			
			while((line = br.readLine()) != null) {
				result += line + "\n";
			}
		}catch(Exception e) {}
		
		result = "<html><pre>" + result + "</pre></html>";

		
		return result;
	}
}
