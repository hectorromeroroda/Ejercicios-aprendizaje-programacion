/** Donat un caràcter pel teclat indicar si aquest està en majúscules o
minúscules, si no es cap d’aquest mostrar un missatge d’error.**/

import java.util.Scanner;

public class Exercici30 {
	public static void main(String[] args) {

		char caracter;
		int numero_ascii_caracter;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa nos dice si un caracter ha sido escrito en mayuscula o minuscula. ");
		System.out.println("Introduzca una caracter en mayuscula o minuscula: ");
		caracter=teclado.next().charAt(0);
		teclado.nextLine();
		teclado.close();
		
		numero_ascii_caracter=(int)caracter;
		
		if ((numero_ascii_caracter<=122) && (numero_ascii_caracter>=97)){
			System.out.println("El caracter introducido es una letra minuscula. ");
			}else{
				if ((numero_ascii_caracter<=90) && (numero_ascii_caracter>=65)){
					System.out.println("El caracter introducido es una letra mayuscula. ");
					}else{
						System.out.println("Error, el caracter introducido no es una letra. ");

					}
				}
	}	
}	

		
	


