//A partir d’un valor X , calcular el valor d’ aquest polinomi X3 + 3X2 + 7X +7

import java.util.Scanner;

public class Exercici12 {

	public static void main(String[] args) {
		
		float x;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el valor del polinomio x3+3x2+7x+7 a partir del valor dado a x");
		System.out.println("Escriba el valor para x:");
		x=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		resultado= (x*x*x)+(3*(x*x))+(7*x)+7;
		System.out.println("El valor del polinomio sabiendo que X=" + x + " es: " + resultado);
	
	}
}