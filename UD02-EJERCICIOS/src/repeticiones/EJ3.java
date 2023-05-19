package repeticiones;

public class EJ3 {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 100; contador++) {
			if (contador%2==0) {
				System.out.println(contador+" es divisible entre 2."); 	
			}else if (contador%3==0) {
				System.out.println(contador+" es divisible entre 3.");
			}else {
				System.out.println(contador+" no es divisible ni entre 2 ni entre 3.");
			}
		}

	}

}