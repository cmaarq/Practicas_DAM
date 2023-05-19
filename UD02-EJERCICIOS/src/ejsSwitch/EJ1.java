package ejsSwitch;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		
		final double numPI = 3.14159;
		double radio=0;
		
		Scanner radios = new Scanner(System.in);
		
		System.out.println("Introduzca el radio del círculo.");
		radio=radios.nextDouble();
		
		double area = numPI * (Math.pow(radio, 2));
		
		System.out.println("El área del círculo es: "+area);

	}

}
