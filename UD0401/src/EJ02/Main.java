package EJ02;

public class Main {

	public static void main(String[] args) {
		
		Direccion direccion = new Direccion("Calle Obispo Rocamora, 16", "Orihuela", 03300, "España");
		
		Estudiante estudiante = new Estudiante("Paco", "García", "48484848A", direccion, 14);
		
		Profesor profesor = new Profesor("Miguel", "Hernández", "12345678A", direccion, "Despacho 1");

		estudiante.identificate();
		profesor.identificate();
		System.out.println(estudiante.toString());
		System.out.println(profesor.toString());

	}

}