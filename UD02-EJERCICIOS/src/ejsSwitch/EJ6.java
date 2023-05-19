package ejsSwitch;

import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		
		int operacion;
		
		System.out.println("Seleccione la figura geométrica de la que desea calcular el área:\n1. Rectángulo.\n2. Círculo.\n3. Triángulo.");
		
		Scanner calcarea = new Scanner (System.in);
		
		operacion = calcarea.nextInt();
		
		switch (operacion) {
		case 1:
			System.out.println("Introduce la base del rectángulo.");
			double baseRect = calcarea.nextDouble();
			System.out.println("Introduce la altura del rectángulo.");
			double alturaRect = calcarea.nextDouble();
			int areaRect = (int) (baseRect * alturaRect);
			System.out.println("La base es "+baseRect+" y la altura es "+alturaRect+", por lo tanto el área del rectángulo es: "+areaRect+".");
			break;
		
		case 2:
			System.out.println("Introduce el radio del cículo.");
			double radio = calcarea.nextDouble();
			float areaCirc = (float) (Math.PI * Math.pow(radio,2));
			System.out.println("El radio es "+radio+", por lo tanto el área del círculo es: "+areaCirc+".");
			break;
		
		case 3:
			System.out.println("Introduce la base del triángulo.");
			double baseTri = calcarea.nextDouble();
			System.out.println("Introduce la altura del triángulo.");
			double alturaTri = calcarea.nextDouble();
			int areaTri = (int) ((baseTri * alturaTri) / 2);
			System.out.println("La base es "+baseTri+" y la altura es "+alturaTri+", por lo tanto el área del triángulo es: "+areaTri+".");
			
		}

	}
	
}
