programa Data_Aniversario
{
	
	funcao inicio()
	{
		//varaiveis 
		inteiro totaldias
		inteiro anos
		inteiro meses
		inteiro dias
         //entrada
		escreva("Quantos dias de vida você tem:")
		leia(totaldias)
         //processamento
          anos =totaldias/365
         meses = ((totaldias % 365) /12)
         dias = (totaldias % 365)%30)
          escreva("********")
          escreva("\nAno:"+anos)
          escreva("\nMes:"+meses)
          escreva("\nDia:"+dias)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */