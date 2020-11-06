programa calculo_desconto
{
	
	
	funcao inicio()
	{
	
		real valorcarro
		real desconto
		real valorliquido
		real porcentagem
	
		
		

		escreva("O valor do carro é:" )
		leia(valorcarro)

          

          porcentagem = 73
          
          desconto = valorcarro*(porcentagem/100)
          
		

		valorliquido = valorcarro - desconto

		
		

       

         escreva(" O carro no valor de "+valorcarro+" com os descontos de 28% e 45% o valor que ficaria para consumidor o valor "+valorliquido)
         
		escreva("\n desconto de:"+desconto)
		
	
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */