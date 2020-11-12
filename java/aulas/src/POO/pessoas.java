package POO;

public class pessoas {
	
	
		private String primeiroNome;
		private String ultimoNome;
		private String nomesDoMeio;
	public Pessoas (String primeiro,String meio,String ultimo)
	{
		primeiroNome=primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	}



