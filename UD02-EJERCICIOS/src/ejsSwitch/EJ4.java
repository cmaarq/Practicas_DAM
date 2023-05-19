package ejsSwitch;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
	
	final double iva = 0.21;
	double precio = 0;
	
	Scanner precios = new Scanner (System.in);
	System.out.println("Introduzca un precio.");
	precio = precios.nextDouble();
	System.out.println("Su precio sin IVA es de: "+precio+"€.");
	precio = (precio + (precio * iva));
	System.out.println("Su precio con IVA es de: "+precio+"€.");
	}

}
