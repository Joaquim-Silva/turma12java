package Exercicioslista5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int c=3,l=3;
		
		int matriz[][] = new int[l][c];
		int vetor []= new int [l];
		int mult;
		System.out.print("Matriz");
		for(l=0;l<3;l++) {
			 System.out.print("\n");
			for(c=0;c<3;c++) {
				matriz[l][c] = (int) (Math.random()*9);
				 System.out.print(" "+matriz[l][c]+"\n");
				
			}
		}
		System.out.print("\n");
		System.out.print("\nVetor");
		for(l=0;l<3;l++) {
			vetor[l] = (int) (Math.random()*9);
			System.out.print(vetor[l]+"\n");
		}
		
		System.out.print("\n");
		System.out.print("\nResultado");
		
		for(l=0;l<3;l++) {
			 System.out.print("\n");
			for(c=0;c<3;c++) {
				mult = vetor[l]*matriz[l][c];
				System.out.print(""+mult+"\n");
			}
				
			}
		

	}

}
