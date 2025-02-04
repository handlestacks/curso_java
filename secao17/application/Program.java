package secao17.application;

import java.util.Scanner;

import secao17.services.PrintServiceObject;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceObject ps = new PrintServiceObject();
		
		System.out.print("How many values? ");
		
		int n = sc.nextInt();
		
		// ps.addValue("Roger");
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		
		ps.first();
		Integer first = (Integer) ps.first();
		System.out.println("First: " + first);
		
		ps.addValue("Roger");
		
		for(Object obj : ps.getList()) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
