package exemplos;

import java.util.*;



public class exemplolista2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		String nome;
		
						
		System.out.print("Entre com a sua idade");
		idade= read.nextInt();
	    read.nextLine();
		System.out.print("Entre com seu nome: ");
		nome= read.nextLine();
		
		System.out.printf("Seu nome é %s",nome);
		System.out.printf("Sua idade é %d",idade);
		
		if(idade>=18) {
			System.out.printf("\nVocê é maior de idade...");
		}
		else if (idade >=1 && idade<18)
		{
			System.out.printf("\nVocê é menor de idade...");
		}
		else {
			System.out.printf("\nVocê é enrou um idade invalida....");
		}
		
		}

}
