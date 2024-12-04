import java.util.Scanner;

public class Party {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Vai pra casa jogar Free Fire.");
		} else if(idade < 59) {
			System.out.println("Boa festa!");
		} else {
			System.out.println("Vai pra casa assistir novela.");
		}
		
		sc.close();
		
	}

}
