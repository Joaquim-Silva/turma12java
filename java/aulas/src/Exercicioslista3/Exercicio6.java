package Exercicioslista3;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
		
		int n= 0;
		int resultado =0;
		
		System.out.print("Digite o número: ");
		n = read.nextInt();
		
		do
		{
			resultado = resultado+n;
			
			
			n=n-1;
		}
		 while(n>=0);
		
		System.out.print("O resultado é "+resultado);
		 

}

}