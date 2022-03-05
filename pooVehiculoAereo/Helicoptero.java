package pooVehiculoAereo;

public class Helicoptero extends vehiculoAereo {
	

	private int precioVehiculo;
	private String color;
	private int pesototal;
	private boolean extintor, paracaidas;
	
	    public Helicoptero() {
	    super();
	    capacidadCarga= 50;
	    numeroTripulantes = 4;
	    pesoCarroceria = 100;
	}
	    
	    public void  establececolor(String colorAvionCarga) {
			color=colorAvionCarga;
		}

		public void configuraparacaidas(String paracaidas) {
			if(paracaidas.equalsIgnoreCase("si")) {
				this.paracaidas=true;
			}else {
				this.paracaidas=false;
			}
		}
		
		public void configuramascarillaOxigeno(String extintor) {
			if(extintor.equalsIgnoreCase("si")) {
				this.extintor=true;
			}else {
				this.extintor=false;
			}
		}

		
	public String dimePesoAvionCarga() { 
			
			pesototal= pesoCarroceria;
			
			if(paracaidas==true) {
				
				pesototal= pesototal+80;
			}
		 if(extintor==true) {
			 pesototal=pesototal +70;
		 }
		 
		return "El peso del helicoptero es "+pesototal;
		}


	  public String dimePrecioAvionCarga() { 
		
		precioVehiculo= (pesototal+numeroTripulantes+capacidadCarga)*2;
		
		if(paracaidas==true) {
			
			precioVehiculo= precioVehiculo + 100;
		}
	 if(extintor==true) {
		 precioVehiculo= precioVehiculo +70;
	 }
	 
	return "El precio del helicoptero es "+precioVehiculo;
	}
	    
	    
	//getter
	public String dimedatosgenerales()
	{
		return "La capacidad de carga es: "+capacidadCarga+" toneladas y el numero de tripulantes  es "+numeroTripulantes+"";
	}
	
	public  String dimecolor()
	{
		return "El color del helicoptero es "+color;
	}
	

	public String dimeparacaidas() {
		if(paracaidas==true) {
			return "El helicoptero tiene paracaidas";
			
		}else {
			return "El helicoptero no tiene paracaidas";
		}
	}
	

	public String dimeextintor (){
		if(extintor==true) {
			return "El helicoptero tiene extintor";
			
		}else {
			return "El helicoptero no tiene extintor";
		}
	}

}
