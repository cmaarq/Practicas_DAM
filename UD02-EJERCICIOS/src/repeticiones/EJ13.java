package repeticiones;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		String palabra;
		int inicio=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un palabra.");
		palabra=sc.next();
		for (inicio=0; inicio<palabra.length()/2; inicio++) {
			System.out.println(palabra.charAt(inicio));
		}
	}

}
