programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um numero inteiro Positivo ou negativo: ")
		leia(numero)

		se(numero <0){
		escreva(" O numero digitado é negativo")
		}
			senao se( numero >=0)
			{
				
                   	se((numero %2)==0){
			        escreva(" O numero Digitado é positivo e par!")
				}
				senao 
				{
			        escreva("o numero digitado é positivo e impar!!")
				}
		     	senao se (numero==0)
				{
				escreva("Voce digitou o zero que é neutro.")	
				}
	}
			
			}




}





/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */