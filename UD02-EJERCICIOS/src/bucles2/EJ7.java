package bucles2;

public class EJ7 {

	public static void main(String[] args) {
		String frase = "La lluvia en Sevilla es una maravilla.";

		System.out.println("La lluvia en Sevilla es una maravilla.");

		StringBuilder sb = new StringBuilder(frase);

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a') {
				sb.setCharAt(i, 'e');
			}

		}
		System.out.println(sb);
	}

}
