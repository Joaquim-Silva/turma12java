programa
{
	
	funcao inicio()
	{

		inteiro n=1,v1=0,v2=0,v3=0,v4=0

		enquanto (n>0){
			escreva(" valor de um numero: ")
			leia(n)
		
		se (n>=0 e n<=25){
			v1 =v1++
		}
		senao se (n>25 e n<=50){
			v2=v2++
		}
		senao se (n>50 e n<=75){
			v3=v3++
		}
		senao se (n>75 e n<=100){
			v4=v4++
			  pare
		}
        
		}
		
		escreva("A quantidade de números entre 0 a 25 é: "+v1+"\nEntre 26 a 50 é: "+v2+"\n entre 51 a 75 é: "+v4+"\nEntre 76 e 100 é: "+v4)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */