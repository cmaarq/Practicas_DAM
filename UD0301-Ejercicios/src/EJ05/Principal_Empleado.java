package EJ05;

import java.util.Scanner;

public class Principal_Empleado {

	public static void main(String[] args) {
		Repartidor repar = new Repartidor();
		Comercial comer = new Comercial();
		
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca qué tipo de trabajador es.");
		System.out.println("1. Repartidor");
		System.out.println("2. Comercial");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			
			sc.nextLine();
			System.out.println("Introduzca su nombre: ");
			repar.setNombre(sc.nextLine());
			System.out.println("Introduzca su edad: ");
			repar.setEdad(sc.nextInt());
			System.out.println("Introduzca su salario: ");
			repar.setSalario(sc.nextDouble());
			System.out.println("Introduzca el número de zona en la que trabaja: ");
			repar.setZona(sc.next());
			
			System.out.println(repar.toString());
			
			break;

		case 2:
			
			sc.nextLine();
			System.out.println("Introduzca su nombre: ");
			comer.setNombre(sc.nextLine());
			System.out.println("Introduzca su edad: ");
			comer.setEdad(sc.nextInt());
			System.out.println("Introduzca su salario: ");
			comer.setSalario(sc.nextDouble());
			System.out.println("Introduzca la cantidad de comisión que cobra: ");
			comer.setComision(sc.nextDouble());
			
			System.out.println(comer.toString());
			
		default:
			break;
		}
		
	}

}

