programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
		
		inteiro quadrado [3][3] 
          inteiro x=0, y=0
          inteiro somaDiagonal =0

          para(x=0;x<3;x++){
          	para(y=0;y<3; y++){
          		quadrado[x][y]=Util.sorteia(1,9)
          		se (x==y)
          		somaDiagonal = somaDiagonal + quadrado[x][y]
          		
          	}
          	
          	
          	
          }
          para(x=0;x<3;x++)
          {
          	para(y=0;y<3;y++){
          		escreva(quadrado[x][y])
          		escreva("  ")
          	}
          	escreva("\n")
          	
          }
           escreva(" a Soma das Diagonais é "+somaDiagonal)
		
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