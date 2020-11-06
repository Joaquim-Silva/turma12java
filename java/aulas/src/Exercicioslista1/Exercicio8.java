package Exercicioslista1;

import java.util.Scanner;

public class Exercicio8 {

	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		 double valorcarro,desconto,valorliquido,porcentagem;
		 
		 System.out.print("Digite o valor do Veiculo : ");
			valorcarro = read.nextDouble();
			
			porcentagem = 73;
			 desconto = valorcarro*(porcentagem/100);
			  valorliquido = valorcarro-desconto;
			 
			  
			  System.out.printf(" O Carro no valor de %.2f terao desconto de 73 porcento e ficara R$%.2f reais",valorcarro,valorliquido);
			
			
			
			

	}

}
