package bucles2;

public class EJ11 {

	public static void main(String[] args) {
		String frase;
		int opcion = 0;
		int mayus = 1;
		int minis = 2;
		int letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		
		System.out.println("1.Cambiar la frase a mayúsculas.");
		System.out.println("2.Cambiar la frase a minísculas.");
		letra = sc.nextInt();
		
		switch (letra) {
		case 1:
			System.out.println(frase.toUpperCase());
			break;
		case 2:
			System.out.println(frase.toLowerCase());
			break;
		default:
			System.out.println("Error 32.");
			break;
		}

	}

}
