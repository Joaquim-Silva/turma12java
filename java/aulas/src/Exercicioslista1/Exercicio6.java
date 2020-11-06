package Exercicioslista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
	 double x1,x2,y1,y2,d;
	 
	 System.out.print("Digite o valor de x1: ");
		x1 = read.nextDouble();
	 System.out.print("Digite o valor de x2: ");
		x2 = read.nextDouble();
	 System.out.print("Digite o valor de y1: ");
		y1 = read.nextDouble();
	 System.out.print("Digite o valor de y2: ");
		y2 = read.nextDouble();
		//Math.sqrt(2)
		
		d = Math.sqrt( Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		
		
		System.out.printf(" O Valor do calculo de D é %.2f ",(d));
		
		
		
		

}
}
