//Realitzar un algorisme perque calculi l’àrea d’un triangle.

import java.util.Scanner;

public class Exercici8 {

	public static void main(String[] args) {
		
		float base;
		float altura;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula el aerea de un triangulo, dada una base y una altura");
		System.out.println ("Introduce el valor de la base del triangulo, en METROS:");
		base=teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("Introduce el valor de la altura del triangulo, en METROS:");
		altura=teclado.nextFloat();
		teclado.nextLine();
		resultado=(base*altura)/2;
		System.out.println ("El area del triangulo es: " + resultado + " M2");
		teclado.close();
		
	}
}
