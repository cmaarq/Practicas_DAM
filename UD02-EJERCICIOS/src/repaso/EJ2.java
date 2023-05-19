package repaso;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
/* Dado un valor n y otro valor y, desplegar en pantalla números correlativos desde 1 hasta n, reemplazando por un * cada vez 
	que corresponda desplegar un número múltiplo de y.
*/
		
		int n;
		int y;
		String cont = "*";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un valor para n.");
		n = sc.nextInt();
		System.out.println("Introduzca un valor para y.");
		y = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % y == 0) {
				System.out.println(cont);
			} else {
				System.out.println(i);
			}

			}
	
		}
}
