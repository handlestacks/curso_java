package secao15.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
