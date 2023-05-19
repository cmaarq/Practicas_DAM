package repeticiones;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		String palabra;
		int vocal=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una palabra.");
		palabra=sc.next();
		for (int i=0; i<palabra.length(); i++){
			if(palabra.charAt(i)=='a') {
				vocal++;
			}if(palabra.charAt(i)=='e') {
				vocal++;
			}if(palabra.charAt(i)=='i') {
				vocal++;
			}if(palabra.charAt(i)=='o') {
				vocal++;
			}if(palabra.charAt(i)=='u') {
				vocal++;
			}
			
		}
		
		System.out.println("El número de vocales en la palabra introucida es: "+vocal+".");

	}

}
