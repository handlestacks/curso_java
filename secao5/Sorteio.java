package secao5;

import java.util.Locale;

public class Sorteio {
	
	public static void main(String[] args) {
				
		int x;
		x = (int) Math.round(Math.random() * 20);
		
		System.out.print(x);
		
		switch(x) {
			case 1:
				System.out.print(" Um");
				break;
			case 2:
				System.out.print(" Dois");
				break;
			case 3:
				System.out.print(" Três");
				break;
			case 4:
				System.out.print(" Quatro");
				break;
			case 5:
				System.out.print(" Cinco");
				break;
			case 6:
				System.out.print(" Seis");
				break;
			case 7:
				System.out.print(" Sete");
				break;
			case 8:
				System.out.print(" Oito");
				break;
			case 9:
				System.out.print(" Nove");
				break;
			case 10:
				System.out.print(" Dez");
				break;
			default:
				System.out.print(" Por acaso caiu aqui?");
		}
		
	}

}
