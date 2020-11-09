package Exercicioslista2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double n;
		
		Scanner read =new Scanner(System.in);
		
		System.out.print("Digite um número: ");
	    n= read.nextDouble();
	    
	    	    
	       if(n>=100) 
	    {
	    	System.out.printf("O valor é igual ou maior que 100, o valor é %.0f ",n);	
	    }
	    else
	    {
	    	n=0;
	    	System.out.printf("O valor é menor que 100, então é igual a %.0f",n);
	    }
	}

}
