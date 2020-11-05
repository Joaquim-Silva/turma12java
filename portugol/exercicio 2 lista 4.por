programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro limite =5
		inteiro somaLancamentos =0
		inteiro lancamentos [limite]
		inteiro x= 0
		inteiro maiorValor =0
		inteiro contadorMaior =0
		para (x=0; x<limite; x++)
		{
					lancamentos[x] = Util.sorteia(1,6)
					escreva("\nValor na posição ",x+1," : ",lancamentos[x])
					somaLancamentos =somaLancamentos + lancamentos[x]
					se(lancamentos[x]>= maiorValor){
						se(lancamentos[x] != maiorValor){
							contadorMaior = 0
							
						}
						maiorValor = lancamentos[x]
						contadorMaior++
						
					}
					
		}
		escreva("\ntotal de valores somados:", somaLancamentos)
		escreva("\nMedia aritimatica: ", (somaLancamentos/limite))
		escreva("\nMaior valor ",maiorValor)
		escreva("\nQuantas vezes aparece: ",contadorMaior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 814; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */