programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, altura, resultado


		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

resultado = peso /mat.potencia(altura,2)

		se (resultado<18.5){
			escreva(" Você está abaixo do peso.")
		}
		senao se (resultado>=18.5 e resultado<25){
			escreva(" Você está com peso normal.")
		}
		senao se (resultado>=25 e resultado<30){
			escreva(" Você está acima do peso.")
		}
		senao se (resultado>=30)
		escreva("Você está Obeso")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */