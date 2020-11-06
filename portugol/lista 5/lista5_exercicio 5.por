programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real valor[5] 
		inteiro codigo, x =0

		
         
			
           para(x=0;x<5;x++){
           escreva("Digite o valor: ")
		leia(valor[x])
           }

		 escreva("Codigo 0 ou 1 ou 2: ")
			leia(codigo)

          				

		se(codigo ==0){
			escreva("Programa finalizado")
					}
					
		
        senao se (codigo ==1){
        	         para(x=0;x<5;x++){
        	         	
        	         	  escreva(valor[x])
        	         	  escreva("\n")
        	         }
        }
		  
		senao se (codigo ==2){
			para(x=4;x>=0;x--){
				
				escreva(valor[x])	
				escreva("\n")
				
			}
			
		}
		senao{
			escreva("Opção invalida")
			
		}
		
		
				
			}
		
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */