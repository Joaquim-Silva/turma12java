programa salario
{
	{
	
	funcao inicio()
	{
		//variaveis c e n
		//horas, salario
		//10 reais por hora
		//variavel e
		//casocontario 20

		real horas
		real horatb
		real excesso
		real excessohora
		real totalsalario

          escreva("Quantas horas ele trabalho: ")
          leia(horatb)

          horas =(horatb*10)
          excesso =(horatb - 50)
          excessohora = (excesso*20)
          totalsalario = (500 + excessohora)

         

          se (horatb <=50)
          {
          	escreva(" O operador  cumpriu ",horatb," de horas, então recebeu o salario de R$",horas," pois não excedeu o limite de horas.")
         	
          }

          senao  
          {
          	escreva("O operador cumpriu ",horatb, " de horas, excedendo ",excesso," recebendo o valor de R$",totalsalario," de salario.")
          }         	
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */