package Exercicioslista2;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); 
		
		double grupo1,grupo2,grupo3;
		
		System.out.print("O valor do indice de poluição em 0.05");
		
		System.out.print("\nDigite o valor do indice de poluição da empresa grupo 1: ");
		grupo1 = read.nextDouble();
		System.out.print("\nDigite o valor do indice de poluição da empresa grupo 2: ");
		grupo2 = read.nextDouble();
		System.out.print("\nDigite o valor do indice de poluição da empresa grupo 3: ");
		grupo3 = read.nextDouble();
		
		if(grupo1>= 0.05 && grupo1 <= 0.25) {
			System.out.print("\nA empresa está em um nivel aceitavel de poluição: "+grupo1);
			
		}
		
		if(grupo1>=0.3 && grupo1 <=0.4) {
			
			System.out.print("\n A poluição do grupo 1 está muito elevado as atividades serão suspensas: "+grupo1);
		}
		
		if(grupo2>= 0.05 && grupo2 <= 0.25) {
			System.out.print("\nA empresa está em um nivel aceitavel de poluição: "+grupo2);
			
		}
		
		if(grupo2>=0.3 && grupo2 <=0.4) {
			
			System.out.print("\n A poluição do grupo 2 está muito elevado  ela será intimada as atividades serão suspensas:  "+grupo2);
		}
		
		if(grupo2 >=0.5){
			System.out.print("\n A poluição do grupo 2 está muito elevado ela será notificada e as atividades serão suspensas: "+grupo2);

		}
		
		if(grupo1 >=0.5){
			System.out.print("\n A poluição do grupo 1 está muito elevado ela será notificada e as atividades serão suspensas: "+grupo1);

		}
		if(grupo3 >=0.5){
			System.out.print("\n A poluição do grupo 3 está muito elevado ela será notificada e as atividades serão suspensas: "+grupo2);
		}
		
		if(grupo3>= 0.05 && grupo3 <= 0.25) {
			System.out.print("\nA empresa está em um nivel aceitavel de poluição: "+grupo3);
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
