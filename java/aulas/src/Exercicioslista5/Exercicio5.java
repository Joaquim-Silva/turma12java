package Exercicioslista5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		 double vetor[] =  new double[5];
		 int x=0;
		 double vetor2;
		 Scanner read = new Scanner(System.in);
		
		 for(x=0;x<5;x++) {
			 
		 x=x++;
		 
		 System.out.printf("Digite o %d valor: ",x+1);
		vetor[x]=read.nextDouble();
		 }
		 System.out.printf(" Escolha a opção: \n");
		 System.out.printf("0-finalizar programa\n");
		 System.out.printf("1-mostre o vetor em ordem direta\n");
		 System.out.printf("2- mostre em ordem inversa\n");
		 vetor2=read.nextDouble();
		 
		 if (vetor2== 0) {
			 System.out.printf("finalizar programa");
		 }
		 else if(vetor2== 1) {
			 for (x=0;x<5;x++) {
			 System.out.print(vetor[x]+"\n");
			 }
		 }
		 else if (vetor2== 2) {
			 for (x=4;x>=0;x--) {
				 System.out.print(vetor[x]+"\n");
			 }
		 }
		 else 
			 {
				 System.out.print("Opção invalida"); 
			 }
			 
		 }
	
	}


