package Exercicioslista2;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); 
		
		double grupo1,grupo2,grupo3;
		
		System.out.print("O valor do indice de polui��o em 0.05");
		
		System.out.print("\nDigite o valor do indice de polui��o da empresa grupo 1: ");
		grupo1 = read.nextDouble();
		System.out.print("\nDigite o valor do indice de polui��o da empresa grupo 2: ");
		grupo2 = read.nextDouble();
		System.out.print("\nDigite o valor do indice de polui��o da empresa grupo 3: ");
		grupo3 = read.nextDouble();
		
		if(grupo1>= 0.05 && grupo1 <= 0.25) {
			System.out.print("\nA empresa est� em um nivel aceitavel de polui��o: "+grupo1);
			
		}
		
		if(grupo1>=0.3 && grupo1 <=0.4) {
			
			System.out.print("\n A polui��o do grupo 1 est� muito elevado as atividades ser�o suspensas: "+grupo1);
		}
		
		if(grupo2>= 0.05 && grupo2 <= 0.25) {
			System.out.print("\nA empresa est� em um nivel aceitavel de polui��o: "+grupo2);
			
		}
		
		if(grupo2>=0.3 && grupo2 <=0.4) {
			
			System.out.print("\n A polui��o do grupo 2 est� muito elevado  ela ser� intimada as atividades ser�o suspensas:  "+grupo2);
		}
		
		if(grupo2 >=0.5){
			System.out.print("\n A polui��o do grupo 2 est� muito elevado ela ser� notificada e as atividades ser�o suspensas: "+grupo2);

		}
		
		if(grupo1 >=0.5){
			System.out.print("\n A polui��o do grupo 1 est� muito elevado ela ser� notificada e as atividades ser�o suspensas: "+grupo1);

		}
		if(grupo3 >=0.5){
			System.out.print("\n A polui��o do grupo 3 est� muito elevado ela ser� notificada e as atividades ser�o suspensas: "+grupo2);
		}
		
		if(grupo3>= 0.05 && grupo3 <= 0.25) {
			System.out.print("\nA empresa est� em um nivel aceitavel de polui��o: "+grupo3);
		}
		
		if (grupo1 <0.05) {
			System.out.print("\nValor invalido");
		}
		if (grupo2 <0.05) {
			System.out.print("\nValor invalido");
		}
		if (grupo3 <0.05) {
			System.out.print("\nValor invalido");
		}
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
	}
	

}
