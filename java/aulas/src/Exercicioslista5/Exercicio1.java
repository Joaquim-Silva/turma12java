package Exercicioslista5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
			Scanner read = new Scanner(System.in);
			
     double  valorProduto;
     int codigo[] = new int[4];
     int x= 0;
     
     System.out.print("Digite o valor do produto: " );
     valorProduto = read.nextDouble();
     System.out.print("Escolha a forma de pagamento:\n");
     System.out.print("\n1-À vista em dinheiro ou cheque, recebe 20% de desconto");
     System.out.print("\n2-À vista no cartão de crédito, recebe 15% de desconto");
     System.out.print("\n3-Em duas vezes, preço normal de etiqueta sem juros");
     System.out.print("\n4-Em três vezes, preço normal de etiqueta mais juros de 10%");
     codigo[x] = read.nextInt();
	
	if (codigo[x]==1) {
		valorProduto= valorProduto-(valorProduto*0.20);
		System.out.printf("O cliente deve pagar R$%.2f, a vistá",valorProduto);
			}
	else if (codigo[x]==2) {
		valorProduto= valorProduto-(valorProduto*0.15);
		System.out.printf("O cliente deve pagar R$%.2f, no cartão de credito.",valorProduto);
			}
	else if(codigo[x]==3) {
		valorProduto= valorProduto;
		Double parcela;
		parcela = (Double) (valorProduto/2);
		System.out.printf("O cliente deve pagar R$%.2f, duas parcelas no valor de R$%.2f",valorProduto,parcela);
			}
	else if(codigo[x]==4) {
		valorProduto= valorProduto+(valorProduto*0.10);
		Double parcela;
		parcela = (Double) (valorProduto/3);
		System.out.printf("O cliente deve pagar R$%.2f, 3 parcelas no valor de R$%.2f",valorProduto,parcela);
	
	
            }
	else {
		System.out.print("Opção invalida");
	}
			
	
}
}
