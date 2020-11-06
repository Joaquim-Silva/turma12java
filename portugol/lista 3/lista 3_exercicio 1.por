programa
{
	
	funcao inicio()
	{
		/*
		 *
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20
		 * de seus habitantes, coletando dados sobre o salário e número de filhos.
		 * A prefeitura deseja saber:
			a) média do salário da população;
			b) média do número de filhos;
			c) maior salário;
			d) percentual de pessoas com salário até R$100,00.
		 */
		
		 //variaveis
		 real salario=0.0, mediaSalarios=0.0, maiorSalario=0.0, totalSalario=0.0
		 inteiro filhos=0, totalFilhos=0
		 real mediaFilhos=0.0
		 inteiro x=0;
		 inteiro QUANTIDADE = 0
		 inteiro menor100 = 0
		 real percentual = 0
		 
		 escreva("Digite a quantidade de entrevistados agora:")
		 leia(QUANTIDADE)
		
		 para (x =1 ; x <=QUANTIDADE; x++)
		 {
		 	escreva("Digite o salario do entrevistado: ")
		 	leia(salario)
		 	se (salario <100)
		 	{
		 		menor100 = menor100+1
		 			
		 	}
               
		 	
		 	totalSalario = totalSalario + salario
		 	escreva("Digite o numero de filhos:")
		 	leia(filhos)
		 	
		 	enquanto (filhos < 0){
		 		escreva("Filhos não podem ser negativos - tente de novo: ")
		 		leia(filhos)
		 	}
		 	
		 	totalFilhos = totalFilhos+filhos
		 	se (maiorSalario < salario)
		 	{
		 		maiorSalario = salario
		 	}
		 	
		 }
		 escreva("QUANTIDADE DE ENTREVISTADOS: ", QUANTIDADE)
		 mediaSalarios=totalSalario / QUANTIDADE
		 mediaFilhos = totalFilhos / QUANTIDADE
		 percentual = menor100 *100/ QUANTIDADE
		 escreva("\nMedia de salarios: ", mediaSalarios)
		 escreva("\nTotal de filhos :", totalFilhos)
		 escreva("\nMedia de filhos :", mediaFilhos)
		 escreva("\nMaior Salario: ", maiorSalario)
		 escreva("\nPessoas que recebem menos que 100: ", percentual) // transforme em percentual
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */