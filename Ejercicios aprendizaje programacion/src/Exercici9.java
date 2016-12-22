//Realitzar un algorisme perque calculi l’àrea d’una rodona.

import java.util.Scanner;

public class Exercici9 {
	
	public static final double PI=3.1416;
	
	public static void main(String[] args) {
		
		double radio;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula el area de un circulo, dado un radio");
		System.out.println ("Introduzca el radio del circulo, en METROS:");
		radio=teclado.nextFloat();
		teclado.nextLine();
		resultado=(PI*radio*radio);
		System.out.println("El area del circulo es: " + resultado + " M2");
		System.out.println("El area del circulo es: " + String.format("%1$.3f",resultado)  + " M2"); // Reduce los decimales del resultado a 3.
		teclado.close();
		
	}
}