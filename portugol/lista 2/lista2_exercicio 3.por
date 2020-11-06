programa calculo_maior
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//4 numeros
		//calcular o quadrado de cada um
		// se o resultado for maior ou  igua a 1000 mostrar e finalizar
		//caso contrario imprimir os valor e seus recepctivos quadrados 

		inteiro n1,n2,n3,n4,r1,r2,r3,r4

		escreva("Digite o primeiro numero: ")
		leia(n1)
		escreva("Digite o segundo numero: ")
		leia(n2)
		escreva("Digite o terceiro numero: ")
		leia(n3)
		escreva("Digite o quarto numero: ")
		leia(n4)

          r1 = mat.potencia(n1,2)
          r2 = mat.potencia(n2,2)
          r3 = mat.potencia(n3,2)
          r4 = mat.potencia(n4,2)

          se (r1 >=1000)
          {
          	escreva("\nO primeiro numero é maior ou igual a 1000 é: ",r1)
          }
          se (r2 >=1000)
          {
          	escreva("\nO Segundo numero é maior ou igual a 1000 é: ",r2)
          } 
          se (r3 >=1000)
          {
          	escreva("\nO Terceiro numero é maior ou igual a 1000 é: ",r3)
          }
          se (r4 >=1000)
          {
          	escreva("\nO Quarto numero é maior ou igual a 1000 é: ",r4)
          }


		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */