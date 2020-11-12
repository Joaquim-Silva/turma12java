
public class exercicio3lista4 {
	
	public static void main(String[] args){
		
	//n1,n2,m1,m2 -linha 4 - coluna 6
		final int LINHA = 4;// const portugol é o final em java
		final int COLUNA = 6;
		
		int n1[][]= new int [LINHA][COLUNA];
		int n2 [][]= new int [LINHA][COLUNA];
		int m1 [][]= new int [LINHA][COLUNA];
		int m2 [][]= new int [LINHA][COLUNA];
		
		for (int linha=0;linha<LINHA; linha++) {
			for(int coluna=0;coluna<COLUNA;coluna++) {
				n1[linha][coluna] = (int) (Math.random() * 10);
				n2[linha][coluna] = (int) (Math.random() * 10);
				m1[linha][coluna] =n1[linha][coluna] +n2[linha][coluna];
				m2[linha][coluna] =n1[linha][coluna] -n2[linha][coluna];
			}
			
		}
		for (int linha=0;linha<LINHA; linha++) {
			for(int coluna=0;coluna<COLUNA;coluna++) {
			
				System.out.print(n1[linha][coluna]+"\t");
			}
			System.out.println();
		}
			}
	}


