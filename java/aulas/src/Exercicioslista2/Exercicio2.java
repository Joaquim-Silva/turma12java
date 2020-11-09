package Exercicioslista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		
		int horas,horaTb,excesso,excessoHora, totalSalario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Escreva o numero de horas trabalhadas: ");
		horaTb=read.nextInt();
		
		
		horas = horaTb*10;
		excesso =  horaTb-50;
		
		excessoHora = excesso*20;
		
		totalSalario = 500+excessoHora;
		
		
		if( horaTb<=50) {
			
			System.out.printf("O operador compriu %d de horas, então receberá o salario de R$%d, pois não execedeu o limite de horas.",horaTb,horas);
		}
		
		else {
			System.out.printf("O operador cumpriu %d de horas, excedendo %d recebendo o valor de R$ %d de salario.",horaTb,excesso,totalSalario);

		}
		
		
		

		
		
	}

}
