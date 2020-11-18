package Exercicioslista7;

public class Empregadoteste {
	
	public static void main(String[] args) {
		
		Empregado Empregado = new Empregado("Diego", "rua dos bobos", "3002-4002", 1, 1000, 300);
		
		System.out.println(Empregado.getNome());
		 System.out.println(Empregado.getEndereco());
		 System.out.println(Empregado.getTelefone());
		 System.out.println("Setor: "+Empregado.getCodigoSetor());
		 System.out.println("Salario: "+Empregado.getSalarioBase());
		 System.out.println("imposto:"+Empregado.getImposto());
		 System.out.print("Resultado "+Empregado.calcularSalario());
	
	}
	}


