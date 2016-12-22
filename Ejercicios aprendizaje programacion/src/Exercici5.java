//Introduir un import i un descompte en tant per cent. Calcular l’import net.

import java.util.Scanner;

public class Exercici5 {
	public static void main(String[] args) {
		
		double importe;
		double descuento;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula un valor con el descuento aplicado, que ha ingresado el usuario");
		System.out.println ("Ingrese un importe:");
		importe= teclado.nextDouble();
		teclado.nextLine();
		System.out.println ("Ingrese el % de descuento deseado:");
		descuento= teclado.nextDouble();
		teclado.nextLine();
		teclado.close();
		resultado=importe-((descuento*importe)/100);	
		System.out.println ("El resultado es: " + resultado);
		
	}
}