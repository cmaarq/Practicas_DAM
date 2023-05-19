package repaso;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
/*Realizar un programa que lea un número, luego desplegar esa cantidad de *.
*/	
		
		int numero;
		String cont = "*";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para desplegar una cantidad de *.");
		numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.print(cont + " ");
		}

	}
	
}
