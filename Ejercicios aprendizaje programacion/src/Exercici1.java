//Calcular l’àrea d’ un cercle. Fórmula : pi*r2.

import java.util.Scanner;

public class Exercici1 {
	
	public static final double PI=3.141516;
	
	public static void main(String[] args) {
		
	float radi;
	Scanner teclado = new Scanner(System.in);

	System.out.println ("Este programa calcula el area de un circulo, dado un radio por el usuario");
	System.out.println ("Escriba el valor del radio del circulo: ");
	radi=teclado.nextFloat();
	teclado.nextLine();
	System.out.println ("El area del circulo es " + PI*(radi*radi));
	teclado.close();
	
	}
}
