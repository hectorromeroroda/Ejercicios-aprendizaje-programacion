/**Tenint en compte la següent equació x=10*a/b. Demanar per teclat el
valor de a i b per a calcular el valor de X, tenint en compte que la divisió
per cero donaria un error.**/

import java.util.Scanner;

public class Exercici22 {
	public static void main(String[] args) {

		float a;
		float b;
		float resultat;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tenint en compte la següent equació x=10*a/b. Calcula el valor de X donat un valor per A i B (no es posible dividir per 0)");
		System.out.println("Introduzca el valor de A:");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el valor de B:");
		b=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (b!=0){
			resultat=(10*(a/b));
			System.out.println("El resultado es: "+ resultat);
		}else{
			System.out.println("Error, no se puede dividir por 0");
		}
		
	}
}
