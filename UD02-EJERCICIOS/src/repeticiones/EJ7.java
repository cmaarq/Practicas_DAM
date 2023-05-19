package repeticiones;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner numeros = new Scanner (System.in);
		System.out.println("Introduce un número entero.");
		num1 = numeros.nextInt();
		System.out.println("Introduce otro número entero.");
		num2 = numeros.nextInt();
		if (num1>num2) {
			for (int i=num1; i>=num2; i--) {
				if (num1==-1 || num2==-1) {
					System.out.println("Ha introducido -1, siendo este inválido.");
					break;
				}
				System.out.println(i);
			}
		}
		if (num1<num2) {
			for (int i=num1; i<=num2; i++) {
				if (num1==-1 || num2==-1) {
					System.out.println("Ha introducido -1, siendo este inválido.");
					break;
				}
				System.out.println(i);
			}
		}
	}

}
