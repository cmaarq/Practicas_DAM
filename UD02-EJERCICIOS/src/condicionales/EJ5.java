package condicionales;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		
		double compra=5249.24;
		double compra2=2000;
		double ahorros;
		
		Scanner dinero = new Scanner(System.in);
		
		System.out.println("¿Cuánto dinero tiene ahorrado?");
		ahorros=dinero.nextDouble();
			
		ahorros-=compra;
		
		if (ahorros<0){
			System.out.println("Usted ha gastado "+compra+"€ y está en números rojos: "+ahorros+"€.");
		} else if (ahorros<1000){
			System.out.println("Usted ha gastado "+compra+"€ y tiene en la cuenta menos de 1000€, tiene: "+ahorros+"€.");	
		} else {
			System.out.println("Usted ha gastado "+compra+"€ y le quedan en la cuenta "+ahorros+"€.");
		}
		
		ahorros-=compra2;
		
		if (ahorros<0){
			System.out.println("Usted ha gastado "+compra2+"€ y está en números rojos: "+ahorros+"€.");
		} else if (ahorros<1000){
			System.out.println("Usted ha gastado "+compra2+"€ y tiene en la cuenta menos de 1000€, tiene: "+ahorros+"€.");	
		} else {
			System.out.println("Usted ha gastado "+compra2+"€ y le quedan en la cuenta "+ahorros+"€.");
		}

	}
}
