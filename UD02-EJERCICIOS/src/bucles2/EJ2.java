package bucles2;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un día de la semana.");
		String dias=sc.next();

		switch (dias) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es un día laboral.");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Es un día festivo.");
			break;

		}

	}
	
}
