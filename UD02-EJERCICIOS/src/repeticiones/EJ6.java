package repeticiones;

public class EJ6 {

	public static void main(String[] args) {
		int sumaPares=0;
		int sumaImpares=0;
		for (int contador=1; contador<=100; contador++) {
		if (contador%2==0) {
			sumaPares+=contador;
		}else
			sumaImpares+=contador;
		}
		System.out.println("La suma de los números pares comprendidos entre el 1 y el 100 es igual a "+sumaPares);
		System.out.println("La suma de los números impares comprendidos entre el 1 y el 100 es igual a "+sumaImpares);
	}

}
