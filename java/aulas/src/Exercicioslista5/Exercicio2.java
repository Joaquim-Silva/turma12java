package Exercicioslista5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		double altura;
		double peso;
		double resultado =0;
		
		System.out.print("Digite o valor da altura: " );
	     altura = read.nextDouble();
	     System.out.print("Digite o valor do peso: " );
	     peso = read.nextDouble();
	     
	     resultado = peso/Math.pow(altura,2);
	     
	     if (resultado<18.5) {
	    	 System.out.print("você está acima do peso");
	    	 
	     }
	     else if (resultado>=18.5 && resultado<25) {
	     System.out.print("você está no peso Ideal");
	     }
	     
	     else if (resultado>=25 && resultado<30) {
	    	 System.out.print("você está acima do peso");
	     }
	     
	     else if(resultado>=30) {
	    	 System.out.print("você está obeso");
	     }
	     else {
	    	 System.out.print("valor invalido");
	     }
		
		
		
	}

}
