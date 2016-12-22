//Introduir els anys d’ una persona i obtenir l’ equivalent en dies i segons.

import java.util.Scanner;

public class Exercici6 {
	
	public static final short DIASANYO=365;
	public static final long SEGUNDOSANYO=3153600;
	
	public static void main(String[] args) {
		
		short edad;
		long resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula los dias y los segundos de una edad ingresada");
		System.out.println ("Ingrese su edad:");
		edad=teclado.nextShort();
		teclado.nextLine();
		resultado=DIASANYO*edad;
		System.out.println ("Equivale a: " + resultado + " dias");
		resultado=SEGUNDOSANYO*edad;
		System.out.println ("Equivale a: " + resultado + " segundos");
		teclado.close();
		}

}
