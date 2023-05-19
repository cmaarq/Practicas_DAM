package bucles2;

import java.util.Scanner;

public class EJ9 {

	public static void main(String[] args) {
		int num;
		int resultado = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero mayor a 1: ");
		num = sc.nextInt();

		if (num <= 1) {
			System.out.println("Error. No has introducido un valor correcto.");
		}

		for (int i = 1; i <= num; i++) {
			resultado += i;

		}
		if (num > 1) {

			System.out.println("La suma de todos los numeros del 1 hasta " + num + " es: " + resultado+".");

		}

	}

}
