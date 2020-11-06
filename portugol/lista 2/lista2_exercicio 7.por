programa area_do_triangulo
{
	
	funcao inicio()
	{
		//3 areas
		// se mairo que zero calcular a aréa do triangulo

		real area
		real base
		real altura

		escreva(" Qual a base do triangulo: ")
		leia(base)
		escreva(" Qual a altura so triangulo: ")
		leia(altura)


          area= ((base*altura)/2)


		se (altura <0)
		{
			escreva("Não podemos calcular a aréa com a altura com numero negativo.")
		}
		se (base <0)
		{
			escreva("Não podemos calular a area com a base com numero negativo.")
			}
	     se (base>0 e altura >0)
	     {
	         escreva(" A Aréa do Triangulo é ",area,".")
	     }	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */