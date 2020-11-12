package Exercicioslista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int linha = 4;
		int coluna =6;
		int n1[][]= new int [linha][coluna];
		int n2 [][]= new int [linha][coluna];
		int m1 [][]= new int [linha][coluna];
		int m2 [][]= new int [linha][coluna];
		int x=0;
		int y=0;
		
		for(x=0;x<linha;x++) {
			for(y=0;y<coluna;y++) {
				System.out.print("\nValores para n1: ");
				n1[x][y] = (int) (Math.random() * 10);

				
			}
		}
		
		
			for(x=0;x<linha;x++) {
				for(y=0;y<coluna;y++) {
					System.out.print("\nValores para n1: ");
					n2[x][y] = 	(int) (Math.random() * 10);
					
				}
		}
		
			
		
			for(x=0;x<linha;x++) {
				for(y=0;y<coluna;y++) {
			m1[x][y] = n1[x][y] + n2[x][y];
				
	}
	

				
}
			
			System.out.print("A soma das matrizes N1 e N2 é: " +m1[x][y]);
	
		
}
}

	

