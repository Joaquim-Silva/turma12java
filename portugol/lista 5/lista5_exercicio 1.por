programa
{
	
	funcao inicio()
	{
		real valor1,valor2,valor3
		inteiro x
	
		
		
			
		escreva(" Digite o valor do produto; ")
		leia(valor1)

          		
          escreva("\n1- À vista em dinheiro ou cheque, recebe 20% de desconto.\n")
          escreva("\n2- À vista no cartão de crédito, recebe 15% de desconto.\n")
          escreva("\n3- Em duas vezes, preço normal de etiqueta sem juros.\n")
          escreva("\n4-Em três vezes, preço normal de etiqueta mais juros de 10%.\n")
          escreva("\nEscolha entre os 4 meios de pagamento:\n")
          leia(x)
          limpa()

       se (x==1){
      

      valor2 =valor1 * 0.80
     
     escreva(" O valor a ser pago com 20% de desconto é: "+ valor2)
       }
       se nao (x==2){
       	valor2= valor1*0.85
       	escreva(" O valor a ser pago com 15% de desconto é "+valor2)
       	
       }
        se nao (x==3){
        	valor2=valor1/2
        	escreva(" O valor a ser pago são duas parcelas de: "+valor2)
        }
        se nao (x==4)
        { 

        	valor2=valor1*1.10
        	valor3=valor2/3
        	escreva("O valor em 3 vezes ficaria: "+valor2+" totalizando:" +valor3)
        	        }

        	       senao  {
        	       	escreva("Comando invalido")
        	       }
        
       
     
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