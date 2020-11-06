package Exercicioslista1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		int dias,diasr,idade, mes;
		
		
		System.out.print("Digite sua idade: ");
		idade = (int) leia.nextDouble();
		
		System.out.print("Digite o mês : ");
		mes = (int) leia.nextDouble();
		
		System.out.print("Digie o dia: ");
		dias = (int) leia.nextDouble();
		
		diasr =(dias+(idade*365)+(mes*30));
		
		System.out.print("Sua idade em dias é: "+ diasr);
		
		
		
		
		
		
		
	}

}
