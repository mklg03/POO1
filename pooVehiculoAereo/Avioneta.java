package pooVehiculoAereo;

public class Avioneta extends vehiculoAereo {
	

	private int precioVehiculo;
	private String color;
	private int pesototal;
	private boolean mascarillaOxigeno, asientosCuero;
	
	    public Avioneta() {
	    super();
	    capacidadCarga= 20;
	    numeroTripulantes = 4;
	    pesoCarroceria = 80;
	}
	    
	    public void  establececolor(String colorAvionCarga) {
			color=colorAvionCarga;
		}

		public void configuraparacaidas(String paracaidas) {
			if(paracaidas.equalsIgnoreCase("si")) {
				this.asientosCuero=true;
			}else {
				this.asientosCuero=false;
			}
		}
		
		public void configuramascarillaOxigeno(String mascarillaOxigeno) {
			if(mascarillaOxigeno.equalsIgnoreCase("si")) {
				this.mascarillaOxigeno=true;
			}else {
				this.mascarillaOxigeno=false;
			}
		}

		
	public String dimePesoAvioneta() { 
			
			pesototal= pesoCarroceria;
			
			if(asientosCuero==true) {
				
				pesototal= pesototal+80;
			}
		 if(mascarillaOxigeno==true) {
			 pesototal=pesototal +70;
		 }
		 
		return "El peso de la avioneta es "+pesototal;
		}


	  public String dimePrecioAvioneta() { 
		
		precioVehiculo= (pesototal+numeroTripulantes+capacidadCarga)*2;
		
		if(asientosCuero==true) {
			
			precioVehiculo= precioVehiculo + 50;
		}
	 if(mascarillaOxigeno==true) {
		 precioVehiculo= precioVehiculo +90;
	 }
	 
	return "El precio de la avioneta es "+precioVehiculo;
	}
	    
	    
	//getter
	public String dimedatosgenerales()
	{
		return "La capacidad de carga es: "+capacidadCarga+" toneladas y el numero de tripulantes  es "+numeroTripulantes+"";
	}
	
	public  String dimecolor()
	{
		return "El color de la avioneta es "+color;
	}
	

	public String dimeasientosCuero() {
		if(asientosCuero==true) {
			return "La avioneta tiene asientos de cuero";
			
		}else {
			return "La avioneta no tiene asientos de cuero";
		}
	}
	

	public String dimemascarillaOxigeno() {
		if(mascarillaOxigeno==true) {
			return "La avioneta tiene mascarillas de oxigeno";
			
		}else {
			return "La avioneta no tiene mascarillas de oxigeno";
		}
	}

}
