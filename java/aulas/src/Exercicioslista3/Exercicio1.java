package Exercicioslista3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double salario =0;
		double mediaSalario =0;
		double maiorSalario = 0;
		double totalSalario = 0;
		double mediaFilhos = 0;
		int filhos=0, totalFilhos=0;
		int x=0;
		
		int quantidade = 0;
		int menor100=0;
		double percentual = 0;
		
		
		System.out.printf("Digite o numero de entrevistados: ");
        quantidade = read.nextInt();
        
        
        for(x=1;x<=quantidade;x++)
        {
        	System.out.printf("Digite o salario do entrevistado: ");
        	salario=read.nextInt();
        	if(salario<100) {
        		 menor100 = menor100+1;
        	}
        	
        	
        	totalSalario=totalSalario+salario;
        	System.out.printf("Digite o número de filhos: ");
        	filhos=read.nextInt();
        	
        	while (filhos<0) {
        		System.out.printf("Filhos não pode ser negativo - tente novamente.");
        		filhos=read.nextInt();
        	}
        	
        	totalFilhos =totalFilhos +filhos;
        	
        	if (maiorSalario<salario) {
        		maiorSalario = salario;
        	
        	}
        	
        	
        }
        
        mediaSalario =totalSalario / quantidade;
        mediaFilhos = totalFilhos / quantidade;
        percentual =(menor100*100)/quantidade;
        
        
        System.out.printf(" Foram entrevistados %d o total de filhos calculado foi %d, A media de filho é %.0f, o maior Salario é %.2f e pro fim o percentual de pessoas que recebem menos de 100 reais de salario é %.2f porcento",quantidade,totalFilhos,mediaFilhos,maiorSalario,percentual);
  
		
		
				

	}

}
