package repeticiones;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner calculo= new Scanner(System.in);
		System.out.println("introduce el valor de a.");
			a=calculo.nextInt();
		System.out.println("introduce el valor de b.");
			b=calculo.nextInt();
		System.out.println("introduce el valor de c.");
			c=calculo.nextInt();
		float discriminante=(float)(Math.pow(b,2)-4*a*c);
		float raiz2=(float)Math.sqrt(discriminante);
		float division=2*a;
		if (discriminante>0){
			float resultado1=(-b+raiz2)/division;
			System.out.println("El valor de X1 es: "+resultado1);
			float resultado2=(-b-raiz2)/division;
			System.out.println("El valor de X2 es: "+resultado2);
		}else if (discriminante==0) {
			float resultado=(-b+raiz2)/division;
			System.out.println("El resultado es: "+resultado);
		}else {
		System.out.println("Error, el discriminante es negativo.");
		}

	}
	
}
