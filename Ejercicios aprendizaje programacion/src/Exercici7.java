//Intercanviar els valors de dues variables prèviament introduïdes.


import java.util.Scanner;

public class Exercici7 {
public static void main(String[] args) {
		
		float valor1;
		float valor2;
		float intercanvio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa intercambia el valor de dos variables previamente introducidas");
		System.out.println ("Escriba el primer valor:");
		valor1=teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("El valor de la primera variable es: " + valor1);
		System.out.println ("Esriba el segundo valor:");
		valor2= teclado.nextFloat();
		teclado.nextLine();
		System.out.println ("El valor de la segunda variable es: " + valor2);
		intercanvio= valor1;
		valor1=valor2;
		valor2=intercanvio;
		System.out.println ("	El valor de la primera variable AHORA es: " + valor1);
		System.out.println ("	El valor de la segunda variable AHORA es: " + valor2);
		teclado.close();
		}
}