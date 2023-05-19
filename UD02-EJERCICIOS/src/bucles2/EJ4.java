package bucles2;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		String nombre;
		int edad;
		float salario = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre:");
		nombre = sc.next();
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		if (edad > 18) {
			System.out.println("Ingrese su salario:");
			salario = sc.nextFloat();
		}
		if (edad >= 16 && edad <= 18) {
			System.out.println("Se llama " + nombre + " y usted tiene " + edad + ". No tiene salario.");
		} else if (edad >= 19 && edad <= 50) {
			float porcentaje = salario * 0.05f;
			float nomina = salario + porcentaje;
			System.out.println("Se llama " + nombre + " y usted tiene " + edad + ". Su salario es " + salario+ ", pero con el 5% es: " + nomina+".");
		} else if (edad >= 51 && edad <= 60) {
			float porcentaje = salario * 0.10f;
			float nomina = salario + porcentaje;
			System.out.println("Se llama " + nombre + " y usted tiene " + edad + ". Su salario es " + salario + ", pero con el 10% es: " + nomina+".");
		} else if (edad >= 60) {
			float porcentaje = salario * 0.15f;
			float nomina = salario + porcentaje;
			System.out.println("Se llama " + nombre + " y usted tiene " + edad + ". Su salario es " + salario + ", pero con el 15% es: " + nomina+".");
		}else {
			System.out.println("Usted no tiene edad para trabajar.Por favor vaya a jugar a las canicas.");
		}
	}

}

