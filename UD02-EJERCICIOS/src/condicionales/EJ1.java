package condicionales;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		
		int x=0, y=0, mayor;
		
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Introduzca un número comprendidos entre 20 y 30.");
		x=numeros.nextInt();
		System.out.println("Introduzca un número comprendidos entre 20 y 30.");
		y=numeros.nextInt();
		
		System.out.println("X es "+x+".");
		System.out.println("Y es "+y+".");
		
		if (x>y){
			mayor=x;
			System.out.println("X es mayor que Y.");
		}else if(y>x){
			mayor=y;
			System.out.println("Y es mayor que X.");
		}else{
			System.out.println("X es igual a Y.");
		}

	}

}
