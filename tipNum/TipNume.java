package tipNum;

import java.util.Scanner;

public class TipNume {
	enum Dia{
		
		DOMINGO("1"), LUNES("2"), MARTES("3"), MIERCOLES("4"), JUEVES("5"), VIERNES("6"), SABADO("7");
		
		private Dia(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		public String dameAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	}

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.println("Escribe un dia: DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO");

String entradaDatos = entrada.next().toUpperCase();

Dia eldia= Enum.valueOf(Dia.class, entradaDatos);

System.out.println("El dia es: "+eldia);
System.out.println("El numero de este dia es: "+eldia.abreviatura);




}
	
	
	
}
