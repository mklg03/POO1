package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		float a=0, b=0, res=0;
		String sel=null;  
	Scanner tec=new Scanner(System.in);
	System.out.println("Ingrese el primer numero");	
	a=tec.nextInt();
	System.out.println("Ingrese el segundo numero");	
	b=tec.nextInt();
    System.out.println("Seleccione la opcion");	
    System.out.println("1: Suma"
    		+ "\n 2: Resta"
    		+ "\n 3: Multiplicacion"
    		+ "\n 4: Division");
    sel=tec.next();
 
    switch(sel) {
    case "1":
    	res=a+b;
    	System.out.println("El resultado es: " +res);
    	break;
    	
    case "2":
    	res=a-b;
    	System.out.println("El resultado es: " +res);
    	break;
    	
    case "3":

    	res=a*b;
    	System.out.println("El resultado es: " +res);
    	break;
    	
    case "4":
  
    	res=a/b;
    	System.out.println("El resultado es: " +res);
    	break;
    	
    default:
    	System.out.println("Esta opcion no existe");	
    	break;  	
    }
    
	}

}
