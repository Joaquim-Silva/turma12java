package Exercicioslista6;

public class Aviaoteste {
	public static void main(String[] args) {
		Aviao voo = new Aviao ();
		voo.modelo = "boing 747-8I";
		voo.tamanho = "76,3";
		voo.Altitude = 0;
		voo.AltitudeMaxima=11.000;
		
		voo.levantandovoo();
		
		
		voo.ganhandoAltitude(5000);
		System.out.println(voo.Altitude);
		voo.velocidade();
		}
	

}
