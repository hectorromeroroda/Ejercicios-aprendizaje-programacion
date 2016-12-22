//Introduir un import en dòlars i calcular el seu canvi en euros.

import java.util.Scanner;

public class Exercici4 {
	
	public static void main(String[] args) {
			
		double importe=0.0;
		double resultado=0.0;
		double equivalencia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula la equivalencia en euros, del valor ingresado");
		System.out.println ("Ingrese la equivalencia actual dolar-euro:");
		equivalencia= teclado.nextDouble();
		teclado.nextLine();
		System.out.println ("Ingrese una cantidad en dolares:");
		importe= teclado.nextDouble();
		teclado.nextLine();
		resultado= importe*equivalencia;	
		System.out.println("La equivalencia en euros es:" + resultado + "€");
		teclado.close();
	
	}
}
