package Exercicioslista2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double n;
		
		Scanner read =new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
	    n= read.nextDouble();
	    
	    	    
	       if(n>=100) 
	    {
	    	System.out.printf("O valor � igual ou maior que 100, o valor � %.0f ",n);	
	    }
	    else
	    {
	    	n=0;
	    	System.out.printf("O valor � menor que 100, ent�o � igual a %.0f",n);
	    }
	}

}
