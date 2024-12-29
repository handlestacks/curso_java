package secao15.application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		for(File f : folders) {
			System.out.println(f);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		for(File f : files) {
			System.out.println(f);
		}
		
		boolean success = new File(strPath + "\\igreja").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();

	}

}
