import java.util.Scanner;

public class desafio2 {
	
	public static void main(String[] agrs) {
		
	Scanner read = new Scanner(System.in);
	
	String numeroConta;
	double Saldo []=new double [10];
	String CNPJ;
	double Emprestimo = 15000.00;
	double credito; 
	int x = 0;
	int[] codigo =new int [2];
	int movimento =1;
	double excesso = 0;
	boolean continua =true;
	char opcao;
	int contador=0;
	
	System.out.print("Digite o numero da sua conta: ");
	numeroConta = read.nextLine();
	System.out.print("Digite o seu CNPJ: ");
	CNPJ = read.nextLine();
	System.out.print("Gostaria de fazer um Emprestimo,Digite 1-sim e 2-N�o : \n");
	codigo[x]=read.nextInt();
	
	
	if(codigo[x] == 1) {
		System.out.printf("Conta: %s    CNPJ:%s\n",numeroConta,CNPJ);
		System.out.printf("Voc� optou por fazer um emprestimo, voc� tem  liberados R$%.2f!!\n",Emprestimo);
		
		

			
			
			
			for(x= 0;x<10;x++) {
			
			
			System.out.print("\nDigite o valor que gostaria de creditar: ");
			credito = read.nextDouble();
			
			Saldo[x] = Saldo[x]+credito;
			System.out.println("\nMovimenta��o "+movimento++);
			
			Emprestimo = Emprestimo - credito;
			if(Saldo[x]<=Emprestimo) {
				System.out.printf("\nSeu saldo no Momento � R$%.2f",Saldo[x]);
			System.out.printf("\nVoc� ainda tem o valor de  � R$%.2f, de emprestimo disponivel .",Emprestimo);	
			}
			
			
			else if(Saldo[x]>Emprestimo) {
				
				System.out.printf("\nValor limite atingido!\n");
				excesso = Emprestimo - excesso;
				System.out.printf("\n Foi Excedido %.2f este valor n�o ser� creditado na sua conta. ",excesso);
				;
			}
		}
			
			System.out.printf("Deseja continuar,sim ou n�o");
			opcao=read.next().toUpperCase().charAt(0);
						
			}while(opcao== 'S' || opcao == 's');
			
					       
	
		System.out.printf("\nVoc� atingiu o limite de 10 movimenta��es diarias!!\n");
		
				
							
	}
	
	
	  
	
	
	else if (codigo[x] ==2) {
		System.out.print("Quando precisar fa�a seu pedido de emprestimo.\n");
		Saldo[x] = Saldo[x];
		System.out.printf("Seu saldo no Momento � %.2f.\n",Saldo[x]);
		System.out.printf(" ");
		System.out.printf("\nSeu saldo no Momento � %f.\n",Saldo[x]);
		
		
		
	}
	else {
		System.out.print("Op��o invalida");
		
		
	}
	
	
	
	
	
	System.out.print("\n-------------------------------\n");
	System.out.print("Conta: "+numeroConta+"\t"+"CNPJ: "+CNPJ);
	
	System.out.print("\n-------------------------------\n");
	
	for(x=0;x<10;x++) {
		System.out.printf("\nR$ %.2f",Saldo[x],"\n");
	}
	
	}
}




	

	



