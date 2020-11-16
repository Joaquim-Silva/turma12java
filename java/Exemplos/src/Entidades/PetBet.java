package Entidades;

import java.util.Scanner;

public class PetBet {

	public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);	//leia objeto do tipo Scanner
       Pessoas cliente = new Pessoas("ed", "ed");     // instanciar - criar objeto do tipo pessoa
       Cachorro dog1 = new Cachorro("Pintcher");
       
       
       System.out.println(cliente.nome);
       System.out.println(cliente.sobrenome);
       System.out.println("Digite o sobrenome");
       cliente.sobrenome = read.nextLine();
       System.out.println(cliente.nome);
       System.out.println(cliente.sobrenome);
       
	}

}
