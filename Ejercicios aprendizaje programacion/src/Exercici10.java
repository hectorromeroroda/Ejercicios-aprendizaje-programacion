//Realitzar un algorisme que converteixi euros a pessetes.

import java.util.Scanner;

public class Exercici10 {
	
	public static final double CONVERSION=166.386;
	
	public static void main(String[] args) {
		
	float euros;
	float resultado;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Este programa hace la conversion Euro-pesetas, de un valor dado:");
	System.out.println("Escriba la cantidad de euros a convertir:");
	euros=teclado.nextFloat();
	teclado.nextLine();
	
	resultado=(float) (euros*CONVERSION);//Utilizo un 'cast' para convertirlo en un 'float'.
	System.out.println ("La equivalencia en pesetas es: " + resultado + " pesetas");
	teclado.close();
	
	}
}