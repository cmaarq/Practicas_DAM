package EJERCICIOS;

public class EJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Marginado";
		
		short vitalidad=594;
		
		short stamina=93;
		
		short nivel=6;
		
		int almas=0;
		
		byte frascosEstus=5;
		
		String arma="Garrote";
		
		System.out.println(nombre+" tiene "+vitalidad+" de vitalidad y "+stamina+" de stamina, y porta el arma "+arma+".");
		
		short staminaAtaqueEnSalto=45;
		
		short dañoCaida=150;
		
		String enemigo="Hueco";
				
		short dañoEnemigo=108;
		
		int dañoTotal=dañoCaida+dañoEnemigo;
		
		System.out.println(nombre+" realiza un ataque en salto y se daña por la caída y resulta herido por un "+enemigo+", quedándose con "+(vitalidad-=dañoTotal)+" de vitalidad y "+(stamina-=staminaAtaqueEnSalto)+" de stamina.");
		
		frascosEstus-=1;
		
		short vitalidadFrascoEstus=250;
				
		vitalidad=(short)(vitalidad+vitalidadFrascoEstus);
		
		System.out.println(nombre+" toma un frasco Estus, quedándose con "+frascosEstus+", y recupera "+vitalidadFrascoEstus+" de vitalidad, quedándose con "+vitalidad+".");
		
		
		
		
		
		

	}

}
