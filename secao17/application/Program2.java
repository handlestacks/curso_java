package secao17.application;

import java.util.Scanner;

import secao17.services.PrintServiceGeneric;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintServiceGeneric<Integer> ps = new PrintServiceGeneric<>();
		
		System.out.print("How many values? ");
		
		int n = sc.nextInt();
		
		// ps.addValue("Roger"); NÃO PERMITE
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}		
		
		ps.first();
		Integer first = ps.first();
		System.out.println("First: " + first);
		
		for(Object obj : ps.getList()) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
