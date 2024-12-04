package secao7;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesDeString {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		System.out.println("-" + text.toUpperCase() + "-");
		System.out.println("-" + text.toLowerCase() + "-");
		System.out.println("-" + text.trim() + "-");
		System.out.println("-" + text.replace(" ", "") + "-");
		System.out.println("-" + text.trim().substring(5) + "-");
		System.out.println("-" + text.trim().substring(5,6) + "-");
		System.out.println("-" + text.indexOf("io"));
		System.out.println("-" + text.lastIndexOf("ri"));
		
		sc.close();
		
		
	}

}
