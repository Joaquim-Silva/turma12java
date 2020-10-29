programa calculo_expressao
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a,b,c
		inteiro r,s,d 

		

		escreva(" valor de a é:")
		leia(a)
          escreva("valor de b é:")
          leia(b)
          escreva("valor de c é:")
          leia(c)

         r = mat.potencia((a+b),2))
         s = mat.potencia((b+c),2))

         d= ((r+s)/2)

         escreva("O valor da expressao é:"+d)
         
         

         
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */