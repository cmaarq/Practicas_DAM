package EJ04;

import java.util.Scanner;

import EJ01.Contador;

public class Principal_Electrodomestico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Electrodomestico elec[] = new Electrodomestico[10];

		Contador cont = new Contador(6);

		// Precio de la lavadora es de 330.
		elec[1] = new Lavadora(200, "azul", 'B', 25, 30);
		// Precio de la televisión es de 349.
		elec[2] = new Television(100, "blanco", 'B', 20, 41, true);
		// Precio por defecto de las televisiones de 240.
		elec[3] = new Television();
		elec[4] = new Television();
		//Precio por defecto de las lavadoras es de 240.
		elec[5] = new Lavadora();
		elec[6] = new Lavadora();

		int opcion;

		do {

			System.out.println("1.-Introduzca un electrodomestico");
			System.out.println("2.-Mostrar el precio final");
			System.out.println("3.-Salir");

			System.out.print("Introduzca la opcion que quiere usar: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:

				elec[cont.getCont()] = new Electrodomestico();

				System.out.print("Introduzca el precio del producto: ");
				elec[cont.getCont()].setPrecio(sc.nextDouble());
				System.out.print("Introduzca el color del producto: ");
				elec[cont.getCont()].setColor(sc.next());
				System.out.print("Introduzca el tipo de consumo energético del producto: ");
				elec[cont.getCont()].setConsumoEnergetico(sc.next().charAt(0));
				System.out.print("Introduzca el peso del producto: ");
				elec[cont.getCont()].setPeso(sc.nextDouble());

				System.out.println("El producto se ha introducido correctamente");

				break;

			case 2:

				double preciolavadora = 0;
				double preciotelevision = 0;
				double precioelectrodomestico = 0;
				double preciofinal = 0;

				for (int i = 0; i < elec.length; i++) {
					Electrodomestico electrodomestico = elec[i];

					if (electrodomestico instanceof Lavadora) {

						preciolavadora += electrodomestico.precioFinal();
					} else if (electrodomestico instanceof Television) {

						preciotelevision += electrodomestico.precioFinal();
					} else if (electrodomestico instanceof Electrodomestico) {
						precioelectrodomestico += electrodomestico.precioFinal();
					}

					preciofinal = preciolavadora + preciotelevision + precioelectrodomestico;
				}

				System.out.println();
				System.out.println("El precio de todas las lavadoras es: " + preciolavadora);
				System.out.println("El precio de todos los televisores es: " + preciotelevision);
				System.out.println("El precio de los demás electrodomésticos es: " + precioelectrodomestico);
				System.out.println("El precio total de todo es: " + preciofinal);
				System.out.println();

				break;

			}

		} while (opcion != 3);

	}

}
