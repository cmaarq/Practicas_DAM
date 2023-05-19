package examen;

import java.util.Scanner;

public class EJ_A {

	public static void main(String[] args) {
		
		int contVoc = 0;
		int contCons = 0;
		int contMay = 0;
		int numeroDeConsonantesMayusculas = 0;
		final String A = "a";
		final String B = "b";
		final String C = "c";
		final String D = "d";
		final String E = "e";
		
		Scanner sc0 = new Scanner (System.in);
		
		System.out.println("Introduzca una frase de al menos 5 palabras.");
		String frase = sc0.nextLine();
		
		System.out.println("Elija una opción:\na. Calcular número de vocales.\nb. Calcular número de consonantes."
				+ "\nc. Calcular número de mayúsculas.\nd. Mostrar texto en mayúsculas.\ne. Finalizar aplicación.");
		Scanner sc1 = new Scanner (System.in);
		String opcion = sc1.nextLine();
		switch (opcion) {
			case A:
				int longitudVoc = frase.length();
				for (int i = 0; i < longitudVoc - 1; i += 1) {
					if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' 
							|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u');
				contVoc += 1;
				}
				
			System.out.println("El número de vocales es: " + contVoc + ".");
			break;
		
			case B:
				int longitudCons = frase.length();
				for (int i = 0; i < longitudCons - 1; i += 1) {
					if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' 
							|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
					contVoc += 1;
					else contCons += 1;
				}
				
			System.out.println("El número de consonantes es: " + contCons + ".");
			break;
			
			case C:
			    for (int i = 0; i < frase.length(); i++) {
			        if (frase.substring(i, i+1).matches("[B-DF-HJ-NP-TV-Z]")) {
			            numeroDeConsonantesMayusculas++;
			        }
	         
			    }
			    
	        System.out.println ("El número de mayúsculas es: " + numeroDeConsonantesMayusculas + ".");
	        break;
	        
			case D:
				String may = frase;
				System.out.println(may.toUpperCase());
			break;
			
			case E:
				System.out.println("Aplicación finalizada.");
				break;	
		}

	}
	
}