package repaso;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
/* Programa que lea un número n luego desplegar la tabla de multiplicar de ese número. Realizar el programa:
	a) utilizando for
	b) Utilizando while
	c) utilizando do while
 */
		
		int opcion;
		int forx;
		int whilex;
		int dowhilex;
		int cont = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca qué funcion quiere utilizar\n1 - Función for.\n2 - Función while.\n3 - Funcion do while.");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduzca un número para mostrar su tabla de multiplicar.");
			forx = sc.nextInt();

			for (int i = 1; i <= 10; i++) {
				int resul = forx * i;
				System.out.println(resul);
			}
			break;
		case 2:
			System.out.println("Introduzca un número para mostrar su tabla de multiplicar.");
			whilex = sc.nextInt();
			while (cont < 10) {
				cont += 1;
				System.out.println(cont * whilex);
			}
			break;
		case 3:
			System.out.println("Introduzca un número para mostrar su tabla de multiplicar.");
			dowhilex = sc.nextInt();
			do {
				cont += 1;
				System.out.println(cont * dowhilex);
			} while (cont < 10);
			break;
		}

	}
}
