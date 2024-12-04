import java.util.Locale;
import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media, nota1, nota2, nota3, nota4;
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextInt();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextInt();
		System.out.print("Digite a quarta nota: ");
		
		System.out.printf("");
		
		sc.close();
		
	}

}
