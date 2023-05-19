package condicionales;

public class EJ6 {

	public static void main(String[] args) {
		
		int rojo = (int) (Math.random()*255);
		int verde = (int) (Math.random()*255);
		int azul = (int) (Math.random()*255);
		
		if (rojo>verde && rojo>azul){
		System.out.println("El color aleatorio es más rojizo.");
		}else if (verde>rojo && verde>azul) {
		System.out.println("El color aleatorio es más verdoso.");
		}else if (azul>rojo && azul>verde) {
		System.out.println("El color es más azulado.");
		}else {
		System.out.println("El color es gris.");
		}
	}
}