/**
Si tenim tres variables A,B i C. Intercanviar els valors de la següent manera:
B pren del valor de A
C pren el valor de B
A pren el valor de C.
Només podem utilitzar una variable auxiliar.
**/

import java.util.Scanner;

public class Exercici11 {
	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float auxiliar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa intercambia el valor de las variables de la siguiente manera: B=A, C=B y A=C");
		System.out.println ("Escribe un valor para 'A':");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("Escribe un valor para 'B':");
		b=teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("Escribe un valor para 'c':");
		c=teclado.nextFloat();
		teclado.close();
		
		System.out.println ("El valor actual de 'A' es: " + a + " El valor actual de 'B' es: " + b + " El valor actual de 'C' es: " + c);
		auxiliar=b;
		b=a;
		a=c;
		c=auxiliar;
		System.out.println ("El valor actual de 'A' es: " + a + " El valor actual de 'B' es: " + b + " El valor actual de 'C' es: " + c);
	
	}
}
