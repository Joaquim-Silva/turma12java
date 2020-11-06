programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro linha=4
		const inteiro coluna=6
		 inteiro n1 [linha][coluna]
		 inteiro n2 [linha][coluna]
		 inteiro m1 [linha][coluna]
		 inteiro m2 [linha][coluna]
		 inteiro x=0, y=0
		

		 para(x=0;x<linha;x++){
		 	para(y=0;y<coluna;y++){
		 		//n1[x][y] = Util.sorteia(1, 9)
		 		escreva("\nvalores para n1: ")
		 		leia(n1[x][y])
		 	
		 }
		 
		 para(x=0;x<linha;x++){
		 	para(y=0;y<coluna;y++){
		 		//n2[x][y] = Util.sorteia(1, 9)
		 		escreva("valores para n2: ")
		 		leia(n2[x][y])
		 	}
		 }

           }
		para(x=0;x<linha;x++){
			para(y=0;y<coluna;y++){
				m1[x][y] = n1[x][y] + n2[x][y]
			}
		}
			
		escreva(" A soma das matrizes N1 e N2 é: ",m1[x][y])
		 		
		 	}
		 	
		 }
		 
		

	 
		 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */