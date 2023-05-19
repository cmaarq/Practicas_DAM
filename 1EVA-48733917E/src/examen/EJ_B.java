package examen;

import java.util.Scanner;

public class EJ_B {

	public static void main(String[] args) {
		
		int i, j;
		
		Scanner sc0 = new Scanner (System.in);
		
		System.out.println("Introduzca un año entre 1500 y 2022.");
		int ano1 = sc0.nextInt();
		System.out.println("Introduzca otro año entre 1500 y 2022.");
		int ano2 = sc0.nextInt();
		
			for (i = ano1; i <= ano2; i++) {
				if((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
						System.out.println(i + " es año bisiesto.");
					}
			}
		
	
			for (j = ano2; j <= ano1; j++) {
				if ((j % 100 != 0 && j % 4 == 0) || j % 400 == 0) {
					System.out.println(j + " es año bisiesto.");
				}
			}
		
	}
	
}
	
