package condicionales;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		
		int num1=0, num2=0, numMayor;

		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número.");
		num1=numeros.nextInt();
		System.out.println("Introduzca el segundo número.");
		num2=numeros.nextInt();

		System.out.println("El número 1 es "+num1+".");
		System.out.println("El número 2 es "+num2+".");
		
		if(num1==num2){
			System.out.println("Ambos números son iguales.");
		
		}else if(num1>num2){
			numMayor=num1;
			System.out.println("El número 1 es mayor que el 2.");
		
		}else{
			System.out.println("El número 2 es mayor que el 1.");
			}
		
	}

}

