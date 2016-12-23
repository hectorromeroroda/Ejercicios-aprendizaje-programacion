/*Elaborar un programa que determini en una variable MIN el més petit
dels valors de 3 variables A,B,C*/

import java.util.Scanner;

public class Exercici19 {
	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float min;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa determina que valor es el mas pequeño de los 3 introducidos por el usuario, y lo guarda en una variable llamada MIN");
		System.out.println("Introduzca el primer numero:");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el segundo numero:");
		b=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el tercer número:");
		c=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
	
		if (a<=b&&a<=c){
			min=a;
		}else{
			if ((b<=a&&b<=c)){
				min=b;
			}else{
				min=c;
				}
			}
		System.out.println(min + " es el valor mas pequeño");

	}
}
