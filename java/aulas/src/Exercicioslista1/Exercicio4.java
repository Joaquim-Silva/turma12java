package Exercicioslista1;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String []args) {
		
		Scanner read = new Scanner(System.in);
		
		int a,b,c; 
		double  r,s,d;
		
		System.out.print("Digite um número: ");
		a = read.nextInt();
		System.out.print("Digite um número: ");
		b = read.nextInt();
		System.out.print("Digite um número: ");
		c = read.nextInt();
		
		
		r =((a*a)+(b*b));
		s= ((b*b)+(c*c));
		
		d=(r+s)/2;
		
		System.out.print("O valor de d é "+d);
		
		
		
		
		
	}

}
