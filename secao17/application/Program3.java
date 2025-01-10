package secao17.application;

import java.util.Scanner;

import secao17.services.PrintServiceGeneric;

public class Program3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceGeneric<String> ps = new PrintServiceGeneric<>();
		
		System.out.print("How many values? ");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}		
		
		ps.first();
		String first = ps.first();
		System.out.println("First: " + first);
		
		for(Object obj : ps.getList()) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
