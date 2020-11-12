package Exercicioslista4;


import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	
	
	Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		Random r = new Random();
	
		
		int quadrado[][] = new int[3][3];
		int x=0,y=0;
		int somadiagonal = 0;
		
		  
		
		for(x=0;x<3;x++);{
			for(y=0;y<3;y++) {
				if(x==y);
				somadiagonal = somadiagonal + quadrado[x][y];
				
			}
		}
		
		for(x=0;x<3;x++);{
			for(y=0;y<3;y++) {
				System.out.print(quadrado[x][y]);
				System.out.print(" ");
			

	}
			System.out.print("\n");
}
		System.out.print(" a Soma das Diagonais é"+somadiagonal);
	}
}

