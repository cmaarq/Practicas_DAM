package EJ03;

import java.util.Scanner;

import EJ02.Cuenta;

public class Principal_Libro {

	public static void main(String[] args) {
		int opcion;

		Scanner sc = new Scanner(System.in);

		Libro libro1 = new Libro();
		
		do {

			System.out.println("Seleccione una opción:");
			System.out.println("1. Insertar libro.");
			System.out.println("2. Mostrar libro.");
			System.out.println("3. Realizar préstamo.");
			System.out.println("4. Realizar devolución.");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("Escribe el título:");
				libro1.setTitulo(sc.nextLine());

				System.out.println("Escribe el autor:");
				libro1.setAutor (sc.nextLine());

				System.out.println("Escribe el número de ejemplares que hay disponibles:");
				libro1.setEjemplares(sc.nextInt());

				break;

			case 2:

				System.out.println("El libro es: " + libro1.toString());

				break;

			case 3:
				
				if(libro1.prestamo()) {
					System.out.println("Préstamo realizado.");
				}else {
					System.out.println("No se ha podido realizar el préstamo.");
				}
				System.out.println("Quedan " + libro1.getEjemplares() + " disponibles.");

				break;

			case 4:

				if (libro1.devolucion()) {
					System.out.println("Devolución realizada.");
				} else {
					System.out.println("No se ha podido realizar la devolución.");
				}

				break;

			}

		} while (opcion != 5);

	}

}
