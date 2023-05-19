package repeticiones;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		int numVentas;
		double suma=0;
		double precioProducto;
		Scanner ventas = new Scanner (System.in);
		System.out.println("Introduce el número de ventas que va a realizar.");
		numVentas = ventas.nextInt();
		
		for (int i=1; i<=numVentas; i++) {
			System.out.println("Introduce el precio del producto.");
			precioProducto=ventas.nextDouble();
			suma+=precioProducto;
		}
		System.out.println("La suma de las ventas da un total de "+suma);
	}

}
