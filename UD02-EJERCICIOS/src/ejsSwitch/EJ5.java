package ejsSwitch;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		
	int operacion;
	
	
	System.out.println("Seleccione la operación que desea realizar:\n1: Suma.\n2: Resta.\n3: Multiplicación.\n4: División.");
	
	Scanner calculadora = new Scanner(System.in);
	
	operacion = calculadora.nextInt();
	
	switch (operacion) {
	
	case 1:
		System.out.println("Introduce el primer número.");
		double num1 = calculadora.nextInt();
		System.out.println("Introduce el segundo número.");
		double num2 = calculadora.nextInt();
		double resultado1 = num1 + num2;
		System.out.println("El resultado de la suma de ambos números es: "+resultado1+".");
		break;
		
	case 2:
		System.out.println("Introduce el primer número.");
		double num3 = calculadora.nextInt();
		System.out.println("Introduce el segundo número.");
		double num4 = calculadora.nextInt();
		double resultado2 = num3 - num4;
		System.out.println("El resultado de la resta de ambos números es: "+resultado2+".");
		break;
		
	case 3:
		System.out.println("Introduce el primer número.");
		double num5 = calculadora.nextInt();
		System.out.println("Introduce el segundo número.");
		double num6 = calculadora.nextInt();
		double resultado3 = num5 * num6;
		System.out.println("El resultado de la multiplicación de ambos números es: "+resultado3+".");
		break;
		
	case 4:
		System.out.println("Introduce el primer número.");
		double num7 = calculadora.nextInt();
		System.out.println("Introduce el segundo número.");
		double num8 = calculadora.nextInt();
		double resultado4 = num7 / num8;
		System.out.println("El resultado de la división de ambos números es: "+resultado4+".");
		break;
		
	}
	
	}

}

