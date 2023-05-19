package ejsSwitch;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
	
	int numero = 0;
	
	Scanner numeros = new Scanner (System.in);
	System.out.println("Introduzca un número entre 32 y 126.");
	numero = numeros.nextInt();
	char caracter = ((char) numero);
	
	if (numero < 32 || numero > 126) {
		System.out.println("El número que ha introducido es: "+numero);
		System.out.println("El número que ha introducido es inválido.");
	
	}else {
		System.out.println("El número que ha introducido es: "+numero);
		System.out.println("El carácter en código ASCII es: "+caracter);
		}

	}

}

	
	
