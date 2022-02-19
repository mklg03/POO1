package pooCoche;

import javax.swing.JOptionPane;

public class UsuCoche {
	public static void main (String[] args) {
		
		Coche Renault = new Coche();
		
		
		Renault.establececolor(JOptionPane.showInputDialog("Introduce el color del coche"));
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿El coche tiene asientos de cuero?"));
		Renault.configuraclimatizador(JOptionPane.showInputDialog("¿El coche tiene climatizador?"));


		System.out.println(Renault.dimedatosgenerales());
		System.out.println(Renault.dimecolor());
		System.out.println(Renault.dimePesoCoche());
		System.out.println(Renault.dimeAsientos());
		System.out.println(Renault.dimeclimatizador());
		
		System.out.println("******Datos del objeto Camioneta*******");
		
		Camioneta Jeep = new Camioneta();
		
		Jeep.establececolor(JOptionPane.showInputDialog("Introduce el color de la camioneta"));
		Jeep.configuraAsientos(JOptionPane.showInputDialog("¿La moto tiene asientos de cuero?"));
		Jeep.configuraclimatizador(JOptionPane.showInputDialog("¿La moto tiene climatizador?"));


		System.out.println(Jeep.dimedatosgenerales());
		System.out.println(Jeep.dimecolor());
		System.out.println(Jeep.dimePesoCamioneta());
		System.out.println(Jeep.dimeAsientos());
		System.out.println(Jeep.dimeclimatizador());
		
		System.out.println("******Datos del objeto Moto*******");
		
        Moto Vera = new Moto();
		
		Vera.establececolor(JOptionPane.showInputDialog("Introduce el color de la moto"));
		Vera.configuraAsientos(JOptionPane.showInputDialog("¿La moto tiene asiento de cuero?"));


		System.out.println(Vera.dimedatosgenerales());
		System.out.println(Vera.dimecolor());
		System.out.println(Vera.dimePesoMoto());
		System.out.println(Vera.dimeAsientos());
		
		
	}
}