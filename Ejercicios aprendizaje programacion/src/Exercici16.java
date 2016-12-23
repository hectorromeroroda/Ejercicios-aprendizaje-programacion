//Introduir dos números per teclat i indicar quin és més gran dels dos.

import java.util.Scanner;

public class Exercici16 {
	public static void main(String[] args) {
		
		float numero1;
		float numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa dice que numero es mayor, entre los 2 ingresados por el usuario.");
		System.out.println("Introduzca el primer número:");
		numero1=teclado.nextFloat();
		teclado.hasNextLine();
		System.out.println("Introduzca el segundo número:");
		numero2=teclado.nextFloat();
		teclado.hasNextLine();
		teclado.close();

		if (numero1<numero2){
			System.out.println(numero2 + " es mayor que " + numero1);
		}else{
			if (numero1>numero2){
				System.out.println(numero1 + " es mayor que " + numero2);
			}else{
				System.out.println("Los dos numeros son el mismo");	
				}
			}
	}
}
