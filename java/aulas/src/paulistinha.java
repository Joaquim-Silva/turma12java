import java.util.Scanner;

public class paulistinha {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String times[] = { "COR", "PAL", "SAN", "SP" };
		int pontos[][] = new int[4][4];
		int linha = 0, coluna = 0;
		char resultado;
		int soma [] = new int [4];

		for (linha = 0; linha < 4; linha++) 
		{
			System.out.printf("RODADA "+(linha+1)+"\n");
			for (coluna = 0; coluna < 4; coluna++) 
			{
				
				System.out.printf("\n O time %s ganhou, empatou ou perdeu? ", times[coluna]);
				resultado = leia.next().toUpperCase().charAt(0);
				
				if (resultado == 'G') {
				pontos[linha][coluna] = 3;
				} else if (resultado == 'E') {
					pontos[linha][coluna] = 1;
				} else if (resultado == 'P') {
					pontos[linha][coluna]=0;
				} else
				{
					System.out.print("\nResposta inválida.");
				}
				
			}
		}
			for (linha = 0 ; linha<4;linha++)
			
			{
				System.out.printf(times[linha]+"\t");
			}
				
		
		for (linha = 0; linha < 4; linha++)
			
		{   System.out.print("\n");
		
			for (coluna = 0; coluna < 4; coluna++) 
			{
				System.out.print(pontos[linha][coluna]+"\t");
				soma[coluna] = soma[coluna] + pontos[linha];

				System.out.print(soma[coluna]);

	}
			
	}
	}
}
	


				
				

	




		
		

	

