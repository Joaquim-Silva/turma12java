package Exercicioslista1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int durasegundo;
		int horas;
		int minutos, segundos;
		
		
		System.out.print("escreva a duração do evento: ");
		durasegundo = leia.nextInt();
		
		
		horas = durasegundo /3600;
		minutos = (durasegundo % 3600)/60;
		segundos = (durasegundo % 3600)%60;
		
		System.out.printf("O Total em horas é  %d horas, %d minutos e %d segundos.",horas,minutos,segundos);

		 
	}
	
	

}
