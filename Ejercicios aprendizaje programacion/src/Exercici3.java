//Introduir un import i calcular què ha de pagar si li fem 20% de descompte.


import java.util.Scanner;

public class Exercici3 {
	
	public static final  double DESCUENTO=0.8;
	
	public static void main(String[] args) {
		
		double importe = 0.0;
		double total =0.0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Este programa calcula un descuento del 20% sobre el importe ingresado");
		System.out.println ("Escriba el importe:");
		importe= teclado.nextFloat();
		teclado.nextLine();
		total= (importe*DESCUENTO);
		System.out.println ("El importe final con el 20% de descuento es: "+ total);
		teclado.close();	
		
	}
}