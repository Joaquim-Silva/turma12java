package Exercicioslista1;

import java.util.Scanner;


public class Exercicio2 {
	public static void main(String [] args) {
				Scanner leia = new Scanner(System.in);
		
		int totaldias,anos,meses,dias;
		
		System.out.println("Escreva o total de dias: ");
		totaldias = leia.nextInt();
		
		anos = totaldias/365;
		meses =(totaldias % 365 )/30;
		dias = (totaldias % 365) % 30;
		
		System.out.printf(" Você tem   %d anos, %d mes e %d dias.", anos,meses,dias);
				
		
		
	}

}
