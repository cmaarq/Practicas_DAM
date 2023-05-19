package EJ02;

import java.util.Scanner;

public class Principal_Cuenta {

	public static void main(String[] args) {

		int opcion;

		Scanner sc = new Scanner(System.in);

		Cuenta cuentaOrigen = new Cuenta();
		Cuenta c2 = new Cuenta("Cesar", "1", 3.2, 1000);

		do {

			System.out.println("Seleccione una opción:");
			System.out.println("1. Crear cuenta.");
			System.out.println("2. Mostrar saldo.");
			System.out.println("3. Hacer ingreso.");
			System.out.println("4. Hacer transferencia.");
			System.out.println("5. Mostrar datos.");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("Escribe el nombre:");
				cuentaOrigen.setNombreCliente(sc.nextLine());

				System.out.println("Escribe el número de cuenta:");
				cuentaOrigen.setNumeroCuenta(sc.nextLine());

				System.out.println("Escribe el tipo de interés:");
				cuentaOrigen.setTipoInteres(sc.nextDouble());

				System.out.println("Escribe el saldo:");
				cuentaOrigen.setSaldo((sc.nextDouble()));

				break;

			case 2:

				System.out.println("El saldo de cuenta origen es: " + cuentaOrigen.getSaldo());

				break;

			case 3:
				
				double cantidad;
				System.out.println("Introduzca la cantidad que desea ingresar:");
				cantidad = sc.nextDouble();
				if(cuentaOrigen.ingreso(cantidad)) {
					System.out.println("Ingreso realizado.");
				}else {
					System.out.println("No se ha podido realizar el ingreso.");
				}
				System.out.println("Su saldo es de: " + cuentaOrigen.getSaldo());

				break;

			case 4:

				System.out.println("Introduzca la cantidad que desea transferir:");
				cantidad = sc.nextDouble();
				if (cuentaOrigen.transferencia(c2, cantidad)) {
					System.out.println("Transferencia realizada.");
				} else {
					System.out.println("No se ha podido realizar la transferencia.");
				}

				break;

			case 5:

				System.out.println(cuentaOrigen.toString());
				System.out.println(c2.toString());
				
				break;

			}

		} while (opcion != 6);

	}

}
