package POO;

import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Pessoa pessoal = new Pessoa("MARIA","ANTONIA","Oliveira");
		System.out.println(pessoal.getNomeCompleto());
		
		

	}

}
