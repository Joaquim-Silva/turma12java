programa
{
	
	funcao inicio()
	{
		inteiro n1
		inteiro n2
		inteiro soma
		inteiro tentativa=0

		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)

		

		enquanto (n1<0)
		{
		  		escreva( "\nO valor inserido é negativo, favor insira outro numéro")
		  		escreva("\nDigite um valor positivo primeiro numero:")
		  		leia(n1)
		  		tentativa =tentativa +1
		  		se (tentativa ==3)
		  		{
		  			escreva("\nfim das tentativas")
		  			pare
		  		}

		  		
		  		
		
		enquanto  (n2<0)
		{
			escreva( "\nO valor inserido é negativo, favor insira outro numéro")
		  		escreva("\nDigite um valor positivo segundo numero:")
		  		leia(n2)
		  		tentativa =tentativa +1
		  		se (tentativa ==3)
		  		{
		  			escreva("\nfim das tentativas")
		  			pare
		  		}
		  		
		
		  	  			  			
		  		
		
		}  		
		
		soma=n1+n2
				
		enquanto (n1 >0 e n2 >0)
		{
		escreva("\n A soma dos valores é :"+soma)
			leia(soma)
		
		}
		
		}
		
	}
	}
			

		

		







/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 988; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */