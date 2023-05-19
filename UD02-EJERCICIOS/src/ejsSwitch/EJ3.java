package ejsSwitch;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		
	Scanner caracteres = new Scanner (System.in);
	System.out.println("Introduzca un carácter.");
	char caracter = caracteres.next().charAt(0);
	int numero = ((char) caracter);
	System.out.println("El carácter que ha introducido es: "+caracter);
	System.out.println("El número de este en la tabla de código ASCII es: "+numero);
			}


	}

