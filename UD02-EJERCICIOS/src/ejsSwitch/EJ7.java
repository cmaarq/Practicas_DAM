package ejsSwitch;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		
		int yo=0;
		int rival = (int)(Math.random()*3+1);
		
		while (true) {
		
		int num = (int) (Math.random()*3+1);
		
		Scanner juego = new Scanner(System.in);
		
		System.out.println("Para jugar:\n1:Piedra.\n2:Papel.\n3:Tijeras.");
		
		yo = juego.nextInt();
		
		System.out.println("Yo he sacado "+yo+" y el rival ha sacado "+num+".");
		
		switch (yo) {
		case 1: 
			switch (rival) {
			case 1:
				System.out.println("Empate. Ambos jugadores han sacado piedra.");
				break;
			case 2:
				System.out.println("Pierdo. Piedra pierde contra papel.");
				break;
			case 3:
				System.out.println("Gano. Piedra gana a tijeras.");
				break;
			}break;
			
		case 2:	
			switch (rival) {
			case 1:
				System.out.println("Gano. Papel gana a piedra.");
				break;
			case 2:
				System.out.println("Empate. Ambos jugadores han sacado papel.");
				break;
			case 3:
				System.out.println("Pierdo. Papel pierde contra tijeras.");
				break;
			}break;
		
		case 3:
			switch (rival) {
			case 1:
				System.out.println("Pierdo. Tijeras pierde contra piedra.");
				break;
			case 2:
				System.out.println("Gano. Tijeras gana a papel.");
				break;
			case 3:
				System.out.println("Empate. Ambos jugadores han sacado tijeras.");
				break;
			}break;
		}
		}
	}
}