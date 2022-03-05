package pooVehiculoAereo;

public class AvionPasajeros extends vehiculoAereo {


	private int precioVehiculo;
	private String color;
	private int pesototal;
	private boolean tobogan, comida;
	
	    public AvionPasajeros() {
	    super();
	    capacidadCarga= 180;
	    numeroTripulantes = 90;
	    pesoCarroceria = 400;
	}
	    
	    public void  establececolor(String colorAvionCarga) {
			color=colorAvionCarga;
		}

		public void configuratobogan(String tobogan) {
			if(tobogan.equalsIgnoreCase("si")) {
				this.tobogan=true;
			}else {
				this.tobogan=false;
			}
		}
		
		public void configuracomida(String comida) {
			if(comida.equalsIgnoreCase("si")) {
				this.comida=true;
			}else {
				this.comida=false;
			}
		}

		
	public String dimePesoAvionCarga() { 
			
			pesototal= pesoCarroceria;
			
			if(tobogan==true) {
				
				pesototal= pesototal+80;
			}
		 if(comida==true) {
			 pesototal=pesototal +70;
		 }
		 
		return "El peso del avion de pasajeros es "+pesototal;
		}


	  public String dimePrecioAvionPasajeros() { 
		
		precioVehiculo= (pesototal+numeroTripulantes+capacidadCarga)*2;
		
		if(tobogan==true) {
			
			precioVehiculo= precioVehiculo + 120;
		}
	 if(comida==true) {
		 precioVehiculo= precioVehiculo +70;
	 }
	 
	return "El precio del avion de pasajeros es "+precioVehiculo;
	}
	    
	    
	//getter
	public String dimedatosgenerales()
	{
		return "La capacidad de carga es: "+capacidadCarga+" toneladas y el numero de tripulantes  es "+numeroTripulantes+"";
	}
	
	public  String dimecolor()
	{
		return "El color del avion de pasajeros es "+color;
	}
	

	public String dimetobogan() {
		if(tobogan==true) {
			return "El avion de pasajeros tiene tobogan de emergencia";
			
		}else {
			return "El avion de pasajeros no tiene tobogan de emergencia";
		}
	}
	

	public String dimecomida() {
		if(comida==true) {
			return "El avion de pasajeros tiene comida";
			
		}else {
			return "El avion de pasajeros no tiene comida";
		}
	}
}
