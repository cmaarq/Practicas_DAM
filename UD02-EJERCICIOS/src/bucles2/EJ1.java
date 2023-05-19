package bucles2;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		String password = "12345";
		String palabra;
		int intentos = 3;

		Scanner comprobar = new Scanner(System.in);
		System.out.println("Intente adivinar la contraseña.");
		System.out.println("Tiene 3 intentos.");

		do {
			System.out.println("Introduzca la contraseña.");
			palabra = comprobar.next();

			if (palabra.equals(password)) {
				System.out.println("La ha adivinado.");
				break;
			}
			intentos--;
			System.out.println("Tiene " + intentos + " intentos.");
		} while (intentos > 0);
		if (intentos == 0) {
			System.out.println("No la ha adivinado.");
		}

	}

}
