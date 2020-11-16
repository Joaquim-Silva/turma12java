package Exercicioslista6;

public class Aviao {
	
	public String modelo;
	public String tamanho;
	 public double Altitude;
     public double AltitudeMaxima;
	
     
     void levantandovoo()
     {
    	 System.out.println("O avião está decolando");
     }
     void ganhandoAltitude(double Altura)
     {
    	 double NovaAltitude = this.Altitude+Altura;
    	 this.Altitude = NovaAltitude;
     }
     int velocidade()
     {
    	 if(this.Altitude<0)
    	 {
    		 return -1;
    	 }
    	 if(this.Altitude>=0 && this.Altitude<5000)
    	 {
    		 return 1;
    	 }
    	 if(this.Altitude>=5001 && this.Altitude<11000)
    	 {
    		 return 2;
    	 }
		return 0;
     
     }
}
