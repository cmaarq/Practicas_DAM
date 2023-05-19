package entradaSalida;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		
		Scanner Formulario = new Scanner(System.in);
		String nombre;
		byte edad;
		String poblacion;
		String calle;
		String genero;
		
		System.out.println("Introduzca su nombre:");
		nombre=Formulario.nextLine();
		System.out.println("Introduzca su edad:");
		edad=Formulario.nextByte();
		System.out.println("Introduzca su población:");
		Formulario.nextLine();
		poblacion=Formulario.nextLine();
		System.out.println("Introduzca su calle:");
		calle=Formulario.nextLine();
		System.out.println("Introduzca si es hombre o mujer:");
		genero=Formulario.nextLine();
		
		System.out.println("Se llama "+nombre+", tiene "+edad+" años,vive en "+poblacion+", en la calle "+calle+" y su género es "+genero);
		
		
		
		
		
		
	}

}
