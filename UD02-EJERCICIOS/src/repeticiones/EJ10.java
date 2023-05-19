package repeticiones;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		int numAleatorio=(int)(Math.random()*10+1);
		int num;
		Scanner juegoAdivinar = new Scanner(System.in);
		System.out.println("Adivina el número entre 1 y 10.");
		do {
			System.out.println("Introduce un número.");
			num = juegoAdivinar.nextInt();
			if (num>numAleatorio) {
				System.out.println("El número introducido es mayor al aleatorio. Inténtelo de nuevo.");
			}else if (num<numAleatorio) {
				System.out.println("El número introducido es menor al aleatorio. Inténtelo de nuevo.");
			}else{
				System.out.println("El número introducido es el correcto.");
			break;
			}
		}while (num!=numAleatorio);

	}

}
