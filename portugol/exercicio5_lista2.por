programa
{
	
	funcao inicio()
	{
		//3 variaveis
		//0,5 até 0,25
		//  1 grupo 0,3 intimadas e suspoensa atividades
		//1 e 2 grupo 0,4 intimadas e suspoensa atividades
		//0,5 todos os grupos seram notificados a paralização das atividades


		real grupo1,grupo2,grupo3
		
		escreva("O valor do indice de poluição começa em 0.05.")

         escreva("\nDigite o valor do indice de poluição da empresa do grupo 1: ")
         leia(grupo1)
         escreva("Digite o valor do indice de poluição da empresa do grupo 2: ")
         leia(grupo2)
         escreva("Digite o valor do indice de poluição da empresa do grupo 3: ")
         leia(grupo3)

         se(grupo1 >= 0.05 e grupo1 <= 0.25)
         {
         	escreva("\nA empresa está em um nivel aceitavel de poluição: ",grupo1)
         }
        se(grupo1 >=0.3 e grupo1 <=0.4){
        	escreva("\n A poluição do grupo 1 está muito elevado as atividades serão suspensas: ",grupo1)
        }
         se(grupo2 >= 0.05 e grupo2 <= 0.25)
         {
         	escreva("\nA empresa está em um nivel aceitavel de poluição: ",grupo2)
         }
        se(grupo2 >=0.3 e grupo2 <=0.4){
        	escreva("\n A poluição do grupo 2 está muito elevado  ela sera intimada as atividades serão suspensas: ",grupo2)
        }
         
        se(grupo2 >=0.5){
        	escreva("\n A poluição do grupo 2 está muito elevado ela será notificada e as atividades serão suspensas: ",grupo2)
        }
        se(grupo1 >=0.5){
        	escreva("\n A poluição do grupo 1 está muito elevado ela será notificada e as atividades serão suspensas: ",grupo1)
        }
        se(grupo3 >=0.5){
        	escreva("\n A poluição do grupo 3 está muito elevado ela será notificada e as atividades serão suspensas: ",grupo3)
        }
        se(grupo2 >= 0.05 e grupo1 <= 0.25)
         {
         	escreva("\nA empresa está em um nivel aceitavel de poluição: ",grupo2)
         }
         se(grupo3 >= 0.05 e grupo1 <= 0.25)
         {
         	escreva("\nA empresa está em um nivel aceitavel de poluição: ",grupo3)
         }
         
        
        
        
        
        
         {
          	
          }
          
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */