package exemplos;
import java.util.Scanner;

public class exemploobjeto {
	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		String nomeUsuario; // muitos caracteres
		char sexoUsuario; // sempre um caracter
		int anoNascimentoUsuario;
		int idadeUsuario;
		
		System.out.print("Digite o nome do Usu�rio[a]: ");
		nomeUsuario = read.next().toUpperCase(); //toUppercase deixar maiusculo
		System.out.print("Digite F-feminino ou M-masculino ou O-outros: ");
		sexoUsuario= read.next().toUpperCase().charAt(0);// tem que converter usando o chAt
		System.out.print("Ano de nascimento: ");
		anoNascimentoUsuario = read.nextInt();
		
		
		idadeUsuario = 2020 - anoNascimentoUsuario;
		
		
		if (sexoUsuario == 'M')//&& � o e.
		{
			System.out.printf(" Oi meu amigo %s, sua idade � %d!!",nomeUsuario,idadeUsuario);
		}
		else if(sexoUsuario == 'F') 
		{
			System.out.printf(" Oi minha amiga %s, sua idade � %d!!",nomeUsuario,idadeUsuario);
		}
		else  if(sexoUsuario == 'O') {
			System.out.printf(" Oi  amigx %s, sua idade � %d!!",nomeUsuario,idadeUsuario);
		}
		else
		{
			System.out.printf("Oi %s, vc n�o informou genero. bye!!!", nomeUsuario);
		}
		
		
		//a titulo de pesquisa - como se declarar vetor
				//String nomes[] = new String[10]; // vetor vazio
				//String produtos[] = {"Camisa", "Cal�a","Blusa"}; //vetor com os dados
				//int precos[] = new int[3];
				//N�O SERVE PRA NADA NESTE CODIGO
		
		
		
			
		
	}
}
