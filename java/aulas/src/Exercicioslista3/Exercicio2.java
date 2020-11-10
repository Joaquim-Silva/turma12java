package Exercicioslista3;

public class Exercicio2 {

	public static void main(String[] args) {
	 
		
		int x = 1;
		
		
		
		
		int totalImpares =0;
		
		
		System.out.print("O valor 500 será o limite para ver os multiplos de 3");
		
		
		for (x=3;x<=500;x++)
		
		{
			if(((x%3)==0) && ((x%2)==1)) {
				totalImpares = totalImpares + x;
			}
		}
		System.out.print("O total é "+totalImpares);
	}

}
