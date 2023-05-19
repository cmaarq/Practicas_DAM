package repaso;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
/*Generar las secuencia:
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/
		
		int numero;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para realizar la secuencia.");
		numero = sc.nextInt();

		for (int j = numero; j > 0; j--) {
			for (int i = 0; i < numero; i++) {
				System.out.print(numero + " ");
			}
			System.out.println();
			numero--;
		}

	}
	
}
