package Exercicioslista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
      
     int M,P,E;
     
     Scanner read = new Scanner(System.in);
     
     
     System.out.print("Digite o Peso dos tomates: ");
     P = read.nextInt();
     
    
    
    if (P>=0 && P<=50) {
    	System.out.printf("O peso foi %d, não teve excessos, não pagara multa!",P);
    	
    }
    
    else if (P>50)
    {
    	E = P-50;
        
        M = 4*E;
        
        System.out.printf("O peso foi %d, tendo um excesso de %d, deverá pagar uma multa de %d!",P,E,M);
    	
    }
    
    else {
    	
    			
    	
    	System.out.printf("O peso foi 0, tendo um excesso de 0, deverá pagar uma multa de 0!");
    }
    
     
     
	}
	

}
