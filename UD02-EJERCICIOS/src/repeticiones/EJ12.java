package repeticiones;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		int x=4, y=6;
		final int arriba=1, abajo=2, izquierda=3, derecha=4;
		int direccion;
		int posicion;
		Scanner movimiento= new Scanner(System.in);
		System.out.println("Estás en la posición (4,6).");
		System.out.println("Hacia que posición quiere moverse: \n1: Arriba.\n2: Abajo. \n3: Izquierda. \n4: Derecha.");
		direccion=movimiento.nextInt();
		System.out.println("Introduce el número de posiciones que quieres moverte:");
		posicion=movimiento.nextInt();
		for (int i=1; i<=posicion; i++) {
			if (direccion==arriba) {
				y++;
			}else if (direccion==abajo) {
				y--;
			}else if (direccion==izquierda) {
				x--;
			}else if (direccion==derecha) {
				x++;
			}
			System.out.println("Estás en la posición ("+x+","+y+").");
		}
		
	}

}
