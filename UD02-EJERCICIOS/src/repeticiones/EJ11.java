package repeticiones;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		String palabra;
		int inicio=0;
		boolean revisar=true;
		Scanner comprobacion = new Scanner(System.in);
		System.out.println("Introduce una palabra:");
		palabra = comprobacion.next();
		int fin = palabra.length()-1;
		while (inicio>fin) {
			if (palabra.charAt(inicio)==palabra.charAt(fin)) {
				revisar=false;
			}
		inicio++;
		fin--;
		}
		if (revisar) {
			System.out.println("Es capicúa.");
		}else {
		System.out.println("No es capicúa.");
		}

	}
	
}
