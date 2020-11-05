programa
{
	
	funcao inicio()
	{
		inteiro  valores[5], x=0
	real maior =0

		para(x=0; x<5;x++){
			escreva("Digite o valor: ")
			leia(valores[x])
		}
		 limpa()
		para(x=0; x<5;x++){
			escreva("\nO valor da posição: ",valores[x])
			
          se(maior<valores[x]){
          	maior= valores[x]
		
          }
         
		
		}

	escreva("\nMaior pontuação é ",maior)
		
		
	}
	 
	 
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */