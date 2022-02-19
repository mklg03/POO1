package pooCoche;

public class Moto {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero;
		
	public Moto() {
		ruedas= 2;
		largo= 700;
		ancho= 200;
		motor= 400;
		pesoPlataforma= 490;

}
	//getter
	
		public String dimedatosgenerales()
		{
			return " El largo de la moto es: "+ largo+", el numero de ruedas es "+ruedas+", el ancho del chasis es "+ancho+", el peso del motor es "+motor+" y el peso de la plataforma  es "+pesoPlataforma+"";
		}
		 //setter
		
		public void  establececolor(String colorMoto) {
			color=colorMoto;
		}
		//getter
		
		public  String dimecolor()
		{
			return "El color de la moto es "+color;
		}
		
		//setter
		
		public void configuraAsientos(String asientosCuero) {
			if(asientosCuero.equalsIgnoreCase("si")) {
				this.asientosCuero=true;
			}else {
				this.asientosCuero=false;
			}
		}
		//getter
		
		public String dimeAsientos() {
			if(asientosCuero==true) {
				return "La moto tiene asiento de cuero";
				
			}else {
				return "La moto no tiene asiento de cuero";
			}
		}
		
		
		
		//No recomendado
		public String dimePesoMoto() { //setter y getter
			
			int pesoCarroceria= 500;
			
			pesototal= pesoPlataforma + pesoCarroceria;
			
			if(asientosCuero==true) {
				
				pesototal= pesototal+50;
			}
		 
		return "El peso de la moto es "+pesototal;
		}
	}
