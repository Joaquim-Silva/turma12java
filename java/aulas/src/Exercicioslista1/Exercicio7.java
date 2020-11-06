package Exercicioslista1;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner(System.in);
		 
		double a,b,c,d,e,f,x,y;
		
		System.out.print("Digite o valor de a: ");
		a = read.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = read.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = read.nextDouble();
		System.out.print("Digite o valor de d: ");
		d = read.nextDouble();
		System.out.print("Digite o valor de e: ");
		e = read.nextDouble();
		System.out.print("Digite o valor de f: ");
		f = read.nextDouble();
		
		x=((c*e) - (b*f)) / ((a*e) - (b*d));
		y=((a*f) - (c*d)) / ((a*e) - (b*d));
		
		
         c= (a*x)+(b*y);
         f =(d*x)+(e*y);
         
         System.out.printf("O valor  de x é %.2f, y vale %.2f  e o resultado de c é %.2f e f é %.2f",x,y,c,f);
        
		

}
	
}
