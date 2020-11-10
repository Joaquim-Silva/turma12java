package exemplos;

import java.util.Scanner;

public class exemploslista3 {

	public static void main(String[] args) {
		 Scanner read = new Scanner(System.in);
		int x,soma=0;
		
		for(x=1;x<10;x++) {
			System.out.printf("\n %d",x);
			soma =soma +x;
		}
		 
		System.out.printf("Soma Total: %d",soma);
		 
		 

	}

}
