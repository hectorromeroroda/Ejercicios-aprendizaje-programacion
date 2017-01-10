/*
Feu un programa que ens escrigui si un número N enter que hem llegit és primer (es considera que un número
es primer només si és divisible per ell i la unitat, per tant per saber si és primer un número cal buscar si té
algun divisor des de 2 fins a la meitat d'ell mateix).
 */

import java.util.Scanner;

public class exercici67 {
	public static void main(String[] args) {
		
		int numero;
		int divisor;
		int contador;
		int contador_primos=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Aquest programa diu si un numero ingresat per l'usuari, es Primer. ");
		System.out.println("Introdueixi el numero:");
		
		while (!teclado.hasNextInt()){
			teclado.nextLine();	
		}
		numero=teclado.nextInt();
		teclado.nextLine();
		
		while ( numero<=1){
			System.out.println("Los numeros primos son mayores a 1, escriba otro numero:");
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			numero=teclado.nextInt();
			teclado.nextLine();
		}
		teclado.close();
	
			for (contador=1;contador<=numero;contador++){
				divisor=numero%contador;
				if (divisor==0){
					contador_primos++;
				}
			}
			if (contador_primos==2){
				System.out.println("El numero " + numero + " es un numero primo");
			}else{
				System.out.println("El numero " + numero + " no es un numero primo");
			}

		
	}
}










