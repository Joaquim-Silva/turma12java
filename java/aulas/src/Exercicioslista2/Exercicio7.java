package Exercicioslista2;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double area,altura,base;
		
		System.out.print("Digite a altura do triangulo: ");
		altura  = read.nextDouble();
		
		System.out.print("Digite a base do triangulo: ");
		base = read.nextDouble();
		
		  area=((base*altura)/2);
		  
		  
		  if (base>0 && altura>0)
			{
				System.out.printf(" A aréa do Triangulo é %.2f.", area);
			}
		
			
		  
			else {
				System.out.print(" O calculo não pode ser efetudado com numeros negativos.");
			}
		
		
		
	}
	
}
