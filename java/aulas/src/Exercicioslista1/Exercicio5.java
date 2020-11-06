package Exercicioslista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		
		double N1,N2,N3,R;
		
		System.out.print("Digite a primeira nota: ");
		N1 = read.nextDouble();
		System.out.print("Digite a segunda nota: ");
		N2 = read.nextDouble();
		System.out.print("Digite a terceira nota: ");
		N3 = read.nextDouble();
		
		 R = (2*N1)+(3*N2)+(5*N3)/(2+3+5);
		 
		 System.out.print(" A media ponderada deste aluno é "+R);
		
	}

}
