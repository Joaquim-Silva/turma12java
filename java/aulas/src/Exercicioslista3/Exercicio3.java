package Exercicioslista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		int n1,n2,soma,tentativa =0;
		
					Scanner read = new Scanner(System.in);
					
			System.out.print("Digite o primeiro número: ");
			n1 = read.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = read.nextInt();

			
			while (n1<0  &&  n2<0) {
				System.out.print("O valor inserido é negativo");
				System.out.print("\ntente novamente: ");
				n1 = read.nextInt();
				
				n2 = read.nextInt(); 
				if(tentativa ==3);
				{
					System.out.print("\nfim das tentativas");
				}
			
				
				
				
			}
			
			soma = n1+n2;
			System.out.print("\nA soma dos valores é :"+soma);
	}

}
