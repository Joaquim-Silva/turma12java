import java.util.Scanner;

public class tarefas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int[][] matriz = new int [5][31];
		int linha = 0, coluna = 0;
		String tarefas;
		int dia;
		int x = 0;
		
		
		System.out.print("Digite o  dia do mes: ");
		dia = read.nextInt();
		
		
		for(linha=0;linha<5;linha++) {
			System.out.printf("Digite a %d tarefa: ",(x+1));
			tarefas = read.next();
			for(coluna=0;coluna<31;coluna++) {
			
										
			}
		
		}
		for(linha=0;linha<5;linha++)	{
			for(coluna=0;coluna<31;coluna++) {
				
				System.out.print(matriz[linha]+"\t");
				System.out.print(matriz[coluna]+"\t");
				
			}
		}
				
	}
			
}
