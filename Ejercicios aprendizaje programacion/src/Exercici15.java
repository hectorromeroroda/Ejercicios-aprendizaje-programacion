//Introduir un número i visualitzar si és positiu, negatiu o neutre

import java.util.Scanner;

public class Exercici15 {
	
	public static void main(String[] args) {
		
		float numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa dice si un numero es negativo, positivo o neutro");
		System.out.println("Introduzca un valor:");
		numero=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();

		if (numero<0){
			System.out.println("El valor es negativo");
		}else{
			if (numero>0){
				System.out.println("El valor es positivo");
			}else{
				System.out.println("El valor es neutro");
				}
			}
		
	  }
	}

