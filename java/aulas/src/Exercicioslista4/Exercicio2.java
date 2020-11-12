package Exercicioslista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
		
	int jogadas [] =new int [10];
	double media = 0.0;
	int somajogadas =0;
	int maiorValor = 0;
	int contador =0;
	int x=0;
	
	for(x=0;x<10;x++) {
		System.out.print("Digite o resultado da jogada:" );
		jogadas[x] = read.nextInt();
		if(jogadas[x]>6) {
			System.out.print("só a 6 possibilidades");
			System.out.print("\nTente Novamente: ");
			jogadas[x] = read.nextInt();
		}
				}
	
	for(x=0;x<10;x++) {
	
		System.out.printf("\nResultado da jogada ",x+1,"foi: ",jogadas[x]);
		somajogadas = somajogadas +jogadas[x];
		if(jogadas[x] >= maiorValor) {
			if(jogadas[x] != maiorValor) {
				contador = 0;}
			maiorValor = jogadas[x];
			contador++;
			
		}
	}
	System.out.print("\ntotal de valores somados é " +somajogadas);
	System.out.print("nMedia aritimica: "+ (somajogadas/10));
	System.out.print("\nMaior valor:" + maiorValor );
	System.out.print("\nQuantas vezesparece: "+contador);
			
		}

	}
	


