package pooCoche;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero, climatizador;
	
	
	//Metodo Constructor: Inicialliza valores de las características del objeto
		
	public Coche() {
		ruedas= 4;
		largo= 2000;
		ancho= 500;
		motor= 1600;
		pesoPlataforma= 500;
	}

	//getter
	
	public String dimedatosgenerales()
	{
		return " El largo del coche es: "+ largo+", el numero de ruedas es "+ruedas+", el ancho del chasis es "+ancho+", el peso del motor es "+motor+" y el peso de la plataforma  es "+pesoPlataforma+"";
	}
	 //setter
	
	public void  establececolor(String colorCoche) {
		color=colorCoche;
	}
	//getter
	
	public  String dimecolor()
	{
		return "El color del coche es "+color;
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
			return "El coche tiene asientos de cuero";
			
		}else {
			return "El coche no tiene asientos de cuero";
		}
	}
	
	//setter
	
		public void configuraclimatizador(String climatizador) {
			if(climatizador.equalsIgnoreCase("si")) {
				this.climatizador=true;
			}else {
				this.climatizador=false;
			}
		}
		//getter
		
		public String dimeclimatizador() {
			if(climatizador==true) {
				return "El coche tiene climatizador";
				
			}else {
				return "El coche no tiene climatizador";
			}
		}
	
	
	//No recomendado
	public String dimePesoCoche() { //setter y getter
		
		int pesoCarroceria= 500;
		
		pesototal= pesoPlataforma + pesoCarroceria;
		
		if(asientosCuero==true) {
			
			pesototal= pesototal+50;
		}
	 if(climatizador) {
		 pesototal=pesototal +20;
	 }
	 
	return "El peso del coche es "+pesototal;
	}
	


}
