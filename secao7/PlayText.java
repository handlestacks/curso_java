package secao7;

import java.util.Locale;
import java.util.Scanner;

public class PlayText {
	
	public static void main(String[] args) {
		
		/*
		 * Top demais
		 * Funções de String
		 * 
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Texto
		System.out.println("Digite o texto:");		
		String text = sc.nextLine(); // texto
		
		// Índice
		System.out.println("Digite o índice:");
		int indice = sc.nextInt();
		
		System.out.println("Uppercase: -" + text.toUpperCase() + "-"); // letras maiúsculos
		System.out.println("Lowercase: -" + text.toLowerCase() + "-"); // letras minúsculas
		System.out.println("Trim: -" + text.trim()  + "-"); // retirar espaços em branco
		System.out.println("Substring: -" + text.substring(indice) + "-"); // substring
		System.out.println("IndexOf: -" + text.indexOf("ri") + "-"); // 
		System.out.println("Last Index Of: -" + text.lastIndexOf("ri") + "-");
		System.out.println("Replace: -" + text.replace("ri","xi")); // substituição de texto
		System.out.println("Suffix: " + text.endsWith("tos"));
		
		String[] pieces = text.split(" ");
		for(int i=0; i<pieces.length; i++) {
			System.out.println("Parte " + i + ": " + pieces[i]);
		}
		
		sc.close();
		
	}

}
