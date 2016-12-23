/**Elaborar un programa que determini en una variable MIN el més petit
dels valors de 4 variables A,B,C,D**/

import java.util.Scanner;

public class Exercici20 {

	public static void main(String[] args) {
			
		float a;
		float b;
		float c;
		float d;
		float min;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa determina que valor es el mas pequeño de los 4 introducidos por el usuario, y lo guarda en una variable llamada MIN");
		System.out.println("Introduzca el primer numero");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el segundo numero");
		b=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el tercer número");
		c=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el cuarto número");
		d=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
	
		min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		System.out.println("El valor mas pequeño es: " + min);

	}	
}
