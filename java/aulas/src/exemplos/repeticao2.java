package exemplos;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade;
		
		
		
		System.out.printf("Entre com a sua idade: ");
        idade = read.nextInt();
        
        
        while (idade>=1)
        {
        	System.out.printf("Sua idade: %d18"
        			+ "\n",idade);
        	if(idade>=18)
        	{
        		System.out.printf("Você é de maior...");
        	}
        	else
        	{
        		System.out.printf("Você é de menor...");
        	
        	     	}
        	System.out.printf("\nEntre com a sua idade: ");
        	idade = read.nextInt();
        	
        }
	}

}
