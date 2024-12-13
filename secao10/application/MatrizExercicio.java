package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicio {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite as dimensões da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite os valores: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Qual número deseja procurar?" );
		int findNumber = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == findNumber) {
					System.out.println("Position " + i + "," + j + ":");
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
				}
			}
		}
		
		
		sc.close();
		
		
	}

}
