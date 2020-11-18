package Exercicioslista7;

public class Adminstador extends Pessoa {

	private Adminstador(String nome, String endereco, String telefone, double ajusteCusto) {
		super(nome, endereco, telefone);
		AjusteCusto = ajusteCusto;
	}

	public double getAjusteCusto() {
		return AjusteCusto;
	}

	public void setAjusteCusto(double ajusteCusto) {
		AjusteCusto = ajusteCusto;
	}

	private double AjusteCusto;
	
	
	
}
