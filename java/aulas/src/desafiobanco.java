import java.util.Scanner;

public class desafiobanco {
public static void main(String[] agrs) {
	
Scanner read = new Scanner(System.in);

String numeroConta;
double Saldo[] = new double[10];
String CNPJ;
double Emprestimo = 15000.00;
double credito[] = new double[10] ;
double debito[] = new double[10] ; 
int x = 0, i = 0,c=0,d=0;
char[] codigo =new char [2];
char codigo1,codigo2,codigo3;
int contador=1;

 if(tipoDeConta==4) {
	System.out.print("Digite o numero da sua conta empresarial:\n");
	numeroConta = read.next();
	System.out.print("Digite o seu CNPJ: \n");
	CNPJ = read.next();
	System.out.print("Bem vindo a Generation Bank\n");
	System.out.print("Olá Você gostaria de um emprestimo? Digite  S-im e N-ão\n");
	codigo1 =read.next().toUpperCase().charAt(0);

	for(i = 0; i <10; i++) {
		 
		    if(codigo1 =='S') {
		    System.out.printf("Seu saldo no momento é R$ %.2f.",Saldo[x]);
		    System.out.print("\nNo momento você tem o valor de R$ 15.000,00 disponivel para emprestimo!\n");
		    System.out.print("Digite o valor:\n");
		    credito[c] = read.nextDouble();		 
		    Saldo[x] = credito[c];
		    Emprestimo = Emprestimo - Saldo[x];
		          if(Saldo[x]>=Emprestimo) {
		        	 
		        	 
		        	  System.out.printf("Digite um valor dentro do limite\n");
		        	  credito[c]=read.nextDouble();
		        	  Emprestimo =15000-credito[c];
		        	  Saldo[x]=credito[c];
		        	  
		          }
		    
		   
		    System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
		    System.out.printf("\nNo momento você tem o valor de R$ %.2f disponivel para emprestimo\n!",Emprestimo);
		    
		    
		    System.out.print("\nGostaria de fazer alguma movimentação na sua conta? ");
		    System.out.print("Digite 1 Sim e 2-Não\n");
		    codigo[x] =read.next().toUpperCase().charAt(0);
		        
	
		    	if(codigo[x]=='1')  {
		    		
		    		for(i=0;i<10;i++) {
		    			
		    			System.out.printf("\nMovimentação "+ contador++);
		   	           System.out.print("\nDigite 1-Credito ou 2-debito: ");
			           codigo3 =read.next().toUpperCase().charAt(0);
			        	  if( codigo3 == '1') {
			          	System.out.print("\nDigite o valor: ");
			        	credito[c]=read.nextDouble();
			        	
						Saldo[x] = Saldo[x] +credito[c];
						
			        			        	
			        	System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
			                                 }
			             else if(codigo3=='2') {
			        	System.out.print("\nDigite o valor: ");
			        	debito[d]=read.nextDouble();
			        	Saldo[x] = Saldo[x]-debito[d];
			        	
			        	System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
			        	
			        
			        	  }
			        		    		        
			        	else {
			        	System.out.print("Opção invalida!!\n");
				    	System.out.print("\nDigite 1-Credito ou 2-Debito: ");
				    	codigo3 =read.next().toUpperCase().charAt(0);
			                	}
			        	 
		    	}
		    		System.out.println(" ");
		    	}
		    	
		    	 
		    	 
		    	
		   
		    
		    }
		    else if(codigo1=='2') {
		    	 System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
		    }
		    else {
		    	System.out.print("Opção invalida!!\n");
	    	System.out.print("Digite S-im ou N-ão?");
	    	codigo1 =read.next().toUpperCase().charAt(0);
		    }
		 
		    System.out.print("Conta: "+numeroConta+"\t CNPJ: "+CNPJ+"\n");
		    System.out.printf("Seu Saldo no momento é R$ %.2f.",Saldo[x]);
	
				   
			   }
		    }
	}
}


	    
	    

	   




	    

	    
	    

		
	    


	    
	    
	    

		


		

	


