package exemplos;
import java.util.Scanner;

public class EntradasSaidas {
	public static void main(String[] args)
	{
		Scanner leia= new Scanner(System.in);
		int a,b,soma;
		
		System.out.println("Entre com o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Entre com o valor de b: ");
		b = leia.nextInt();
		
		soma = a+b;
		System.out.println("A soma foi de "+soma);
	
		
	}
	
}
