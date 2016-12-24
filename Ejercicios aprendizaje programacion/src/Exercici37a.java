/**
A -Introduir un import en euros enter i indicar el número mínim de bitllets i monedes que li correspon.
Bitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1. (165€ son 1 de 100, 1 de 50, 1 de 10 i 1 de 5)
**/

import java.util.Scanner;

public class Exercici37a {
	public static final int BILLETE500=500;
	public static final int BILLETE200=200;
	public static final int BILLETE100=100;
	public static final int BILLETE50=50;
	public static final int BILLETE20=20;
	public static final int BILLETE10=10;
	public static final int BILLETE5=5;
	public static final int MONEDA2=2;
	public static final int MONEDA1=1;

	public static void main(String[] args) {
		
		int euros;
		int contador=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le dice la descomposicion en billetes de 500, 200, 100,50,20,10 y 5 euros y monedas de 2 y 1 euro, de un valor dado");	
		System.out.println("Escriba un valor entero de euros para descomponer:");
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		euros=teclado.nextInt();
		teclado.close();
		
		while (euros>=BILLETE500){
			euros= (euros-BILLETE500); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 500€");
		contador=0;
		
		while (euros>=BILLETE200){
			euros= (euros-BILLETE200); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 200€");
		contador=0;
		
		while (euros>=BILLETE100){
			euros= (euros-BILLETE100); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 100€");
		contador=0;
		
		while (euros>=BILLETE50){
			euros= (euros-BILLETE50); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 50€");
		contador=0;

		while (euros>=BILLETE20){
			euros= (euros-BILLETE20); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 20€");
		contador=0;
		
		while (euros>=BILLETE10){
			euros= (euros-BILLETE10); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 10€");
		contador=0;
	
		while (euros>=BILLETE5){
			euros= (euros-BILLETE5); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 5€");
		contador=0;
		
		while (euros>=MONEDA2){
			euros= (euros-MONEDA2); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 2€");
		contador=0;
		
		while (euros>=MONEDA1){
			euros= (euros-MONEDA1); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 1€");
		contador=0;
			
	}
}


