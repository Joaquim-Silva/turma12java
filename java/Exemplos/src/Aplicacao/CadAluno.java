package Aplicacao;

import java.util.Scanner;

import Entidades.Pessoas;

public class CadAluno {

	public static void main(String[] args) {
		Pessoas aluno = new Pessoas();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("SISTEMA DE CADASTRO DE ALUNOS POR MATERIA");
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = leia.next();
		System.out.print("Digite M- masculino, F-feminino ou 0-outros: ");
		aluno.genero = leia.next().toUpperCase().charAt(0);}
	

}
