package Classes;

public class ContaCorrente extends Conta {
	
	
	private int numeroTalao=1;

	public ContaCorrente(int numeroTalao) {
		super();
		this.numeroTalao = numeroTalao;
	}
	public void emitirTalao() {
		this.numeroTalao++;
	}
}
