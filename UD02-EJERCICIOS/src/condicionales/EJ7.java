package condicionales;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		
		int num=0;
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("Introduzca un número.");
		num=numeros.nextInt();
		
		if (num<0) {
		System.out.println("Su número es negativo");
		}else{
		System.out.println("Su número es positivo");
		}
		
		if (num%2==0){
		System.out.println("Su número es par.");
		}else{
		System.out.println("Su número es impar.");
		}
		
		if (num%5==0){
		System.out.println("Su número es divisible entre 5.");
		}else {
		System.out.println("Sun número no es divsible entre 5.");
		}
		
	}

}


