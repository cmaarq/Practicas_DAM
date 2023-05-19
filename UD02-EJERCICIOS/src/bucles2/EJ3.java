package bucles2;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int sumapar=0,sumaimp=0,sumapos=0,sumaneg=0, contpos=0,contneg=0,contpar=0,contimp=0, num,contmed=0;
        float med=0;
        String respuesta, s, S;
        do {
            System.out.println ("Introduce un número.");
            num = teclado.nextInt();
            med+=num;
            contmed++;
            if(num<0) {
                System.out.println ("El número es negativo.");
                sumaneg+=num;
                contneg++;
            }
            else {
                System.out.println ("El número es positivo.");
                sumapos+=num;
                contpos++;
            }
            if(num%2==0) {
                System.out.println ("El número es par.");
                sumapar+=num;
                contpar++;
            }
            else {
                System.out.println ("El número es impar.");
                sumaimp+=num;
                contimp++;
            } 
            System.out.println ("¿Quiere introducir otro número? s/n");
            respuesta=teclado.next();
        }while(respuesta.equals("s") || respuesta.equals("S"));

        med=(float)med/contmed;
        System.out.println ("La suma de los negativos es "+sumaneg+".");
        System.out.println ("La suma de los positivos es "+sumapos+".");
        System.out.println ("La suma de los pares es "+sumapar+".");
        System.out.println ("La suma de los impares es "+sumaimp+".");
        System.out.println ("La cantidad de negativos es "+contneg+".");
        System.out.println ("La cantidad de positivos es "+contpos+".");
        System.out.println ("La cantidad de pares es "+contpar+".");
        System.out.println ("La cantidad de impares es "+contimp+".");
        System.out.println ("La media de todos los numeros es "+med+".");

	}

}
