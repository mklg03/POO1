package pooCoche;

public class Camioneta {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private int capacidadCarga;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero, climatizador;
	
	
		
	public Camioneta() {
		ruedas= 4;
		largo= 3200;
		ancho= 800;
		motor= 1800;
		pesoPlataforma= 2000;
		capacidadCarga=500;
	}

	//getter
	
	public String dimedatosgenerales()
	{
		return " El largo de la camioneta es "+ largo+", el numero de ruedas es "+ruedas+", el ancho del chasis es "+ancho+", el peso del motor es "+motor+", el peso de la plataforma  es "+pesoPlataforma+" y la capacidad de carga es "+capacidadCarga+"";
	}
	 //setter
	
	public void  establececolor(String colorCamioneta) {
		color=colorCamioneta;
	}
	//getter
	
	public  String dimecolor()
	{
		return "El color de la camioneta es "+color;
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
			return "La camioneta tiene asientos de cuero";
			
		}else {
			return "La camineta no tiene asientos de cuero";
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
				return "La camioneta tiene climatizador";
				
			}else {
				return "La camoneta no tiene climatizador";
			}
		}
	
	
	//No recomendado
	public String dimePesoCamioneta() { //setter y getter
		
		int pesoCarroceria= 800;
		
		pesototal= pesoPlataforma + pesoCarroceria;
		
		if(asientosCuero==true) {
			
			pesototal= pesototal+50;
		}
	 if(climatizador) {
		 pesototal=pesototal +20;
	 }
	 
	return "El peso de la camioneta es "+pesototal;
	}
	

}
