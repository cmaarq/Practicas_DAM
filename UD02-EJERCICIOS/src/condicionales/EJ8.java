package condicionales;

import java.util.Scanner;

public class EJ8 {

	public static void main(String[] args) {
		
		int yo=0;
		
		while (true) {
		
		int num = (int) (Math.random()*3+1);
		
		Scanner juego = new Scanner(System.in);
		
		System.out.println("Para jugar:\n1:Piedra.\n2:Papel.\n3:Tijeras.");
		
		yo = juego.nextInt();
		
		System.out.println("Yo he sacado "+yo+" y el rival ha sacado "+num+".");
		
		if (yo == num) {
			if (yo == 1) {
				System.out.println("Empate. Ambos jugadores han sacado piedra.");
			}else if (yo == 2) {
				System.out.println("Empate. Ambos jugadores han sacado papel.");
			}else {
				System.out.println("Empate. Ambos jugadores han sacado tijeras.");
			}
		
		}
		
		if (yo == 1 && num == 3) {
			System.out.println("Gano. Piedra gana a tijeras.");
		}else if (yo == 2 && num == 1) {
			System.out.println("Gano. Papel gana a piedra.");
		}else if (yo == 3 && num == 2) {
			System.out.println("Gano. Tijeras gana a papel.");
		}else if (yo == 3 && num == 1) {
			System.out.println("Pierdo. Tijeras pierde contra piedra.");
		}else if (yo == 1 && num == 2) {
			System.out.println("Pierdo. Piedra pierde contra papel.");
		}else {
			System.out.println("Pierdo. Papel pierde contra tijeras.");
		}
		
		}

	}
	
}
