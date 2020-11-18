package Exercicioslista7;

public class Fornecedor  extends Pessoa {

	
	
	Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		ValorDivida = valorDivida;
	}
	public Fornecedor() {
		
	}
	private double valorCredito;
	private double ValorDivida;
	
	

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	
	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return  this.valorCredito - this.ValorDivida;
	}

}
