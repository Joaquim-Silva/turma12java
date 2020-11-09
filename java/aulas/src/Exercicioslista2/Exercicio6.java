package Exercicioslista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade do nadador[a]: ");
		idade = read.nextInt();
		
		if (idade<=0) {
			System.out.print("Idade invalida");
		}
		
				else if(idade <5)
		{
			System.out.print("Não podemos atender nessa idade.");
		}
		
		else if(idade <=7) 
		{
			System.out.print("Infantil A = 5 a 7 anos");
		}
		else if(idade <=11) 
		{
			System.out.print("Infantil B = 8 a 11 anos");
		}
		else if(idade <=13) 
		{
			System.out.print("Juvenil A = 12 a 13 anos");
		}
		else if(idade <=17) 
		{
			System.out.print(" Juvenil B = 14 a 17 anos");
		}
		else {
			System.out.print("Tem mais de 18 anos é da categoria Adulto.");
		}

	}

}
