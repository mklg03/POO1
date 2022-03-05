package pooVehiculoAereo;

public class AvionCarga extends vehiculoAereo{
	
	private int precioVehiculo;
	private String color;
	private int pesototal;
	private boolean mascarillaOxigeno, paracaidas;
	
	    public AvionCarga() {
	    super();
	    capacidadCarga= 250;
	    numeroTripulantes = 3;
	    pesoCarroceria = 500;
	}
	    //setters
	    
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
		
		public void configuramascarillaOxigeno(String mascarillaOxigeno) {
			if(mascarillaOxigeno.equalsIgnoreCase("si")) {
				this.mascarillaOxigeno=true;
			}else {
				this.mascarillaOxigeno=false;
			}
		}

		
	public String dimePesoAvionCarga() { 
			
			pesototal= pesoCarroceria;
			
			if(paracaidas==true) {
				
				pesototal= pesototal+80;
			}
		 if(mascarillaOxigeno==true) {
			 pesototal=pesototal +70;
		 }
		 
		return "El peso del avion de carga es "+pesototal;
		}


	  public String dimePrecioAvionCarga() { 
		
		precioVehiculo= (pesototal+numeroTripulantes+capacidadCarga)*2;
		
		if(paracaidas==true) {
			
			precioVehiculo= precioVehiculo + 100;
		}
	 if(mascarillaOxigeno==true) {
		 precioVehiculo= precioVehiculo +90;
	 }
	 
	return "El precio del avion de carga es "+precioVehiculo;
	}
	    
	    
	//getter
	public String dimedatosgenerales()
	{
		return "La capacidad de carga es: "+capacidadCarga+" toneladas y el numero de tripulantes  es "+numeroTripulantes+"";
	}
	
	public  String dimecolor()
	{
		return "El color del avion de carga es "+color;
	}
	

	public String dimeparacaidas() {
		if(paracaidas==true) {
			return "El avion de carga tiene paracaidas";
			
		}else {
			return "El avion de carga no tiene paracaidas";
		}
	}
	

	public String dimemascarillaOxigeno() {
		if(mascarillaOxigeno==true) {
			return "El avion de carga tiene mascarillas de oxigeno";
			
		}else {
			return "El avion de carga no tiene mascarillas de oxigeno";
		}
	}
	


	
	
	
	
	
	
}
