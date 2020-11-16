package Exercicioslista6;

public class cliente {
	
	
	public String nome;
	public String cpf;
	public String endereco;
	
	
	public cliente() 
	{
		
	}
	
	
	public cliente(String nome, String cpf,String endereco) 
	{
		this.nome = nome;
		this.cpf =cpf;
		this.endereco =endereco;
	}
	
	 public String getDadosCompleto()
     {
   	  String DadosCompleto = nome+" "+cpf+" "+endereco;
   	  return DadosCompleto;
   
     }

}


