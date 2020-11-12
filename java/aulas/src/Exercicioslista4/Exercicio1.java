package Exercicioslista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int valores [] =new int [5];
		int x = 0;
		int maior = 0;
		
		
		for(x=0;x<5;x++) {
			System.out.print("Digite o valor:" );
			valores[x] = read.nextInt();
			
		}
		
		
		for(x=0;x<5;x++) {
			System.out.print("\n valor da posição: "+ valores[x]);
			
			if(maior<valores[x]) {
				maior =valores[x];
			}
		}
		System.out.print("\nMaior pontuação é "+maior);

}
	
}
