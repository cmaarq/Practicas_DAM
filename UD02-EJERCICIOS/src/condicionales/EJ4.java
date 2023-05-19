package condicionales;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		
		int ejeX=0, ejeY=0;
		
		final int arriba=1;
		final int abajo=2;
		final int izquierda=3;
		final int derecha=4;
		
		System.out.println("Para moverse pulsar las teclas:");
		System.out.println("1:ARRIBA");
		System.out.println("2:ABAJO");
		System.out.println("3:IZQUIERDA");
		System.out.println("4:DERECHA");
		
		int movimiento;
		
		
		Scanner direccion = new Scanner(System.in);
		
		while(true) {
			
			movimiento=direccion.nextInt();

			if (movimiento == arriba) {
				ejeY++;
			}else if (movimiento == abajo) {
				ejeY--;
			}else if (movimiento == izquierda) {
				ejeX--;
			}else if (movimiento == derecha) {
				ejeX++;
			}else System.out.println("Inválido.");
			
			System.out.println("Tu posicion es "+ejeX+" en el eje X y "+ejeY+" en el eje Y.");
		
	}

	}
}
