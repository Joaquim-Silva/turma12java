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
		
		System.out.printf("Seu nome � %s",nome);
		System.out.printf("Sua idade � %d",idade);
		
		if(idade>=18) {
			System.out.printf("\nVoc� � maior de idade...");
		}
		else if (idade >=1 && idade<18)
		{
			System.out.printf("\nVoc� � menor de idade...");
		}
		else {
			System.out.printf("\nVoc� � enrou um idade invalida....");
		}
		
		}

}
