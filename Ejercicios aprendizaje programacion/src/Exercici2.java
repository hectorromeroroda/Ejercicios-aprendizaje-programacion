//Introduir dos números i calcular la seva suma.

import java.util.Scanner;

public class Exercici2 {
	
	public static void main(String[] args) {
		
		float numero1=0;
		float numero2=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa hace la suma de 2 valores dados por el usuario");
		System.out.println ("Escriba el primer valor a sumar:");
		numero1= teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("Escriba el segundo valor a sumar:");
		numero2= teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("El resultado de " + numero1 + " + " + numero2 + " es "+ (numero1+numero2));
		teclado.close();
		
	}
}

