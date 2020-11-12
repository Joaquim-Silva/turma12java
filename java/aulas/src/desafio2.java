import java.util.Scanner;

public class desafio2 {
	
	public static void main(String[] agrs) {
		
	Scanner read = new Scanner(System.in);
	
	String numeroConta;
	double Saldo = 0.00;
	String CNPJ;
	double Emprestimo = 15000.00;
	double credito; 
	int x = 0;
	int[] codigo =new int [2];
	int movimento =1;
	
	System.out.print("Digite o numero da sua conta: ");
	numeroConta = read.nextLine();
	System.out.print("Digite o seu CNPJ: ");
	CNPJ = read.nextLine();
	System.out.print("Gostaria de fazer um Emprestimo,Digite 1-sim e 2-Não : \n");
	codigo[x]=read.nextInt();
	
	
	if(codigo[x] == 1) {
		System.out.printf("Conta: %s    CNPJ:%s\n",numeroConta,CNPJ);
		System.out.printf("Você optou por fazer um emprestimo, você tem  liberados R$%.2f!!\n",Emprestimo);
		
		
		for(x=0;x<10;x++) {
			
			
		System.out.print("\nDigite o valor que gostaria de creditar: ");
		credito = read.nextDouble();
		
		Saldo = Saldo+credito;
		System.out.println("\nMovimentação "+movimento++);
		System.out.printf("\nSeu saldo no Momento é R$%.2f",Saldo);
		Emprestimo = Emprestimo - credito;
		System.out.printf("\nVocê ainda tem o valor de  é R$%.2f, de emprestimo disponivel .",Emprestimo);	
		if(Saldo>=Emprestimo) {
			
			System.out.printf("\nValor limite atingido!\n");
			
	
						}
			
		
	}
		
		System.out.printf("\nVocê atingiu o limite de 10 movimentações diarias!!\n");
		
		System.out.print("\n-------------------------------\n");
		System.out.print("Conta: "+numeroConta+"\t"+"CNPJ: "+CNPJ);
		System.out.print("\n-------------------------------\n");
	}
	
	  
	
	
	else if (codigo[x] ==2) {
		System.out.print("Quando precisar faça seu pedido de emprestimo.\n");
		Saldo = Saldo;
		System.out.printf("Seu saldo no Momento é %.2f.\n",Saldo);
		System.out.printf(" ");
		System.out.printf("\nSeu saldo no Momento é %f.\n",Saldo);
		
		
		
	}
	else {
		System.out.print("Opção invalida");
		
		
	}
	
	
	}
	

}

