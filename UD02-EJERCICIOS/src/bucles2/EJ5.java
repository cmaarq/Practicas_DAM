package bucles2;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		int num1, num2;

		System.out.println("Introduzca dos numeros aleatorios.");
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		num1 = numero.nextInt();

		System.out.println("Introduce el segundo numero:");
		num2 = numero.nextInt();

		if (num1>num2) {
		System.out.println(num1);
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 100 + 1);
			System.out.println(random);
		}
		System.out.println(num2);
		}
		if (num1<num2) {
			System.out.println(num1);
			for (int i = 0; i < 10; i--) {
				int random = (int) (Math.random() * 100 + 1);
				System.out.println(random);
			}
			System.out.println(num2);
			}
	}

}
