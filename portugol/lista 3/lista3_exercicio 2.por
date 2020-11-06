programa
{
	
	funcao inicio()
	{
		//somar todos os numeros impares que sejam multiplos de 3 até 500

		inteiro x =0
		
		inteiro soma = 0
		 inteiro totalimpares =0
	

		escreva("o valor 500 será o limite para ver os multiplos de 3")


		para (x=1; x <=500; x++)
		{
		  se((x%2!=0)e (x%3==0)){
		  	
		  	soma = soma + x
		  	totalimpares = totalimpares + x
		  }
		}
		  escreva("\n O total da soma de valores impares é  ",totalimpares)
		}
           

		
		
	


		
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */