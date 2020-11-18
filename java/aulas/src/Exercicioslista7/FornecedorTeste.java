package Exercicioslista7;

public class FornecedorTeste {

	public static void main(String[] args) {

		Fornecedor meuFornecedor = new Fornecedor("Diego", "rua dos bobos", "32548-5417",1000, 200);
		
		 System.out.println(meuFornecedor.getNome());
		 System.out.println(meuFornecedor.getEndereco());
		 System.out.println(meuFornecedor.getTelefone());
		 
		 System.out.print(meuFornecedor.obterSaldo());
	}
}
