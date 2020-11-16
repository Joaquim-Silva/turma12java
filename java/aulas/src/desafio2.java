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
	System.out.print("Gostaria de fazer um Emprestimo,Digite 1-sim e 2-Não : \n");
	codigo[x]=read.nextInt();
	
	
	if(codigo[x] == 1) {
		System.out.printf("Conta: %s    CNPJ:%s\n",numeroConta,CNPJ);
		System.out.printf("Você optou por fazer um emprestimo, você tem  liberados R$%.2f!!\n",Emprestimo);
		
		

			
			
			
			for(x= 0;x<10;x++) {
			
			
			System.out.print("\nDigite o valor que gostaria de creditar: ");
			credito = read.nextDouble();
			
			Saldo[x] = Saldo[x]+credito;
			System.out.println("\nMovimentação "+movimento++);
			
			Emprestimo = Emprestimo - credito;
			if(Saldo[x]<=Emprestimo) {
				System.out.printf("\nSeu saldo no Momento é R$%.2f",Saldo[x]);
			System.out.printf("\nVocê ainda tem o valor de  é R$%.2f, de emprestimo disponivel .",Emprestimo);	
			}
			
			
			else if(Saldo[x]>Emprestimo) {
				
				System.out.printf("\nValor limite atingido!\n");
				excesso = Emprestimo - excesso;
				System.out.printf("\n Foi Excedido %.2f este valor não será creditado na sua conta. ",excesso);
				;
			}
		}
			
			System.out.printf("Deseja continuar,sim ou não");
			opcao=read.next().toUpperCase().charAt(0);
						
			}while(opcao== 'S' || opcao == 's');
			
					       
	
		System.out.printf("\nVocê atingiu o limite de 10 movimentações diarias!!\n");
		
				
							
	}
	
	
	  
	
	
	else if (codigo[x] ==2) {
		System.out.print("Quando precisar faça seu pedido de emprestimo.\n");
		Saldo[x] = Saldo[x];
		System.out.printf("Seu saldo no Momento é %.2f.\n",Saldo[x]);
		System.out.printf(" ");
		System.out.printf("\nSeu saldo no Momento é %f.\n",Saldo[x]);
		
		
		
	}
	else {
		System.out.print("Opção invalida");
		
		
	}
	
	
	
	
	
	System.out.print("\n-------------------------------\n");
	System.out.print("Conta: "+numeroConta+"\t"+"CNPJ: "+CNPJ);
	
	System.out.print("\n-------------------------------\n");
	
	for(x=0;x<10;x++) {
		System.out.printf("\nR$ %.2f",Saldo[x],"\n");
	}
	
	}
}




	

	



