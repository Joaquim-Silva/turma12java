package Exercicioslista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n1,n2,n3,n4,r1,r2,r3,r4;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = read.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = read.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = read.nextInt();
		System.out.print("Digite o Quarto numero: ");
		n4 = read.nextInt();
		
		r1=(int) Math.pow(n1,2);
		r2=(int) Math.pow(n2,2);
		r3=(int) Math.pow(n3,2);
		r4=(int) Math.pow(n4,2);
		
		if (r1>=1000) {
			System.out.print("\nO primeiro numero é maior ou igual a 1000 é: "+r1);
			
		}
		
		else if(r2>=1000) {
			System.out.print("\nO segundo numero é maior ou igual a 1000 é: "+r2);
			
		}
		
		else if(r3>=1000) {
			System.out.print("\nO terceiro numero é maior ou igual a 1000 é: "+r3);
			
		}
		else if(r4>=1000) {
			System.out.print("\nO quarto numero é maior ou igual a 1000 é: "+r4);
			
			
		}
		
		else {
			System.out.print("Valores são menores que 1000.");
		
		}
		
				
		
	
	
	}
	

}
