package Exercicioslista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero inteiro Positivo ou Negativo: ");
		numero = read.nextInt();
		
		
		if (numero<0) 
		{
			System.out.print("O numero digitado � negativo.");
		}
		
		else if(numero>0) 
		{
			if ((numero%2)==0) {
				System.out.print("O n�mero digitado � par.");
			}
			else {
				System.out.print("O n�mero digitado � impar.");
			}
		}
		else if(numero==0) {
			System.out.print("Voce digitou o zero que � neutro.");	
		}
		

			
	

	}

}
