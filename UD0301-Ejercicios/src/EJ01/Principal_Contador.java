package EJ01;

public class Principal_Contador {

	public static void main(String[] args) {
		
		Contador cont1 = new Contador(20);
		
		for (int i = 0; i < 10; i++) {
			cont1.decrementar();
			System.out.println(cont1.getCont());
		}
		
		System.out.println();
		
		for (int j = 0; j < 10; j++) {
			cont1.incrementar();
			System.out.println(cont1.getCont());
		}
		
	}

}
