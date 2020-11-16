import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		double base2;
		double altura2;
		double area2;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a altura do primeiro triangulo: ");
		altura = read.nextDouble();
		System.out.print("Digite a base do primeiro triangulo: ");
		base=read.nextDouble();
		 area = base*altura/2;
		 
		 System.out.print("Digite a altura do segundo triangulo: \n");
			altura2 = read.nextDouble();
			System.out.print("Digite a base do segundo  triangulo: \n");
			base2=read.nextDouble();
			 area2 = base2*altura2/2;
			 
		if(area >area2 )	{
			System.out.print("\nArea do primero triangulo é maior com "+area);
			System.out.print("\nO primeiro triangulo tem base "+base+" e a altura "+altura);
			System.out.print("\nArea do segundo triangulo é menor com "+area2);
			System.out.print("\nO segundo triangulo tem base "+base2+" e a altura "+altura2);
		}
		else if(area2 >area) {
			System.out.print("\nArea do segundo  triangulo é maior com "+area2);
			System.out.print("\nO segundo triangulo tem base "+base2+" e a altura "+altura2);
			System.out.print("\nArea do primeiro  triangulo é menor com "+area);
			System.out.print("\nO primeiro triangulo tem base "+base+" e a altura "+altura);
		}
		else if(base<=0 || altura<=0) {
			System.out.print("Valor negativo ou 0 não podem ser usados para calculo da base");
					}
		else if(base2<=0 || altura2<=0) {
			System.out.print("Valor negativo ou 0 não podem ser usados para calculo da base");
		}
		

	}

}
