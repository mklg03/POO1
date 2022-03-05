package pooVehiculoAereo;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class vehiculoAereo {
	
	  int capacidadCarga;
	  int numeroTripulantes;
	  int pesoCarroceria;
      int precioVehiculo;
     
     
	
	public static void main(String[] args) {
	
	String sel=JOptionPane.showInputDialog("\n1: Avion de carga"
    		+ "\n 2: Avion de pasajeros"
    		+ "\n 3: Avioneta"
    		+ "\n 4: Helicoptero");
    switch(Integer.valueOf(sel)){
    case 1:
    	AvionCarga av = new AvionCarga();
        av.establececolor(JOptionPane.showInputDialog("Introduce el color del avion de carga"));
    	av.configuramascarillaOxigeno(JOptionPane.showInputDialog("¿El avion de carga tiene mascarillas de oxigeno?"));
    	av.configuraparacaidas(JOptionPane.showInputDialog("¿El avion de carga tiene paracaidas?"));
        System.out.println(av.dimedatosgenerales());
        
		System.out.println(av.dimecolor());
		System.out.println(av.dimePesoAvionCarga());
		System.out.println(av.dimemascarillaOxigeno());
		System.out.println(av.dimeparacaidas());
		System.out.println(av.dimePrecioAvionCarga());
		
		break;
    	
    	
    case 2:
      	AvionPasajeros ap = new AvionPasajeros();
    	ap.establececolor(JOptionPane.showInputDialog("Introduce el color del avion de pasajeros"));
		ap.configuratobogan(JOptionPane.showInputDialog("¿El avion tiene tobogan inflable?"));
    	ap.configuracomida(JOptionPane.showInputDialog("¿El avion tiene comida?"));
        System.out.println(ap.dimedatosgenerales());
      
		System.out.println(ap.dimecolor());
		System.out.println(ap.dimePesoAvionCarga());
		System.out.println(ap.dimecomida());
		System.out.println(ap.dimetobogan());
		System.out.println(ap.dimePrecioAvionPasajeros());
    	
    	
    	break;
    	
    	
    case 3:

      	Avioneta avi = new Avioneta();
    	avi.establececolor(JOptionPane.showInputDialog("Introduce el color de la avioneta"));
		avi.configuramascarillaOxigeno(JOptionPane.showInputDialog("¿La avioneta tiene mascarillas de oxigeno?"));
    	avi.configuraparacaidas(JOptionPane.showInputDialog("¿El coche tiene paracaidas?"));
        System.out.println(avi.dimedatosgenerales());
        
		System.out.println(avi.dimecolor());
		System.out.println(avi.dimePesoAvioneta());
		System.out.println(avi.dimemascarillaOxigeno());
		System.out.println(avi.dimeasientosCuero());
		System.out.println(avi.dimePrecioAvioneta());
		
		break;
    	
    case 4:
  
      	Helicoptero he = new Helicoptero();
    	he.establececolor(JOptionPane.showInputDialog("Introduce el color del helicoptero"));
		he.configuramascarillaOxigeno(JOptionPane.showInputDialog( "¿El helicoptero tiene mascarillas de oxigeno?"));
    	he.configuraparacaidas(JOptionPane.showInputDialog("¿El helicoptero tiene paracaidas?"));
        System.out.println(he.dimedatosgenerales());
        
		System.out.println(he.dimecolor());
		System.out.println(he.dimePesoAvionCarga());
		System.out.println(he.dimeextintor());
		System.out.println(he.dimeparacaidas());
		System.out.println(he.dimePrecioAvionCarga());
		
		break;
    	
    default:
    	System.out.println("Esta opcion no existe");	
    	break;  	
    }
    
	}

}
