/**Visualitzar el següent sèrie tants elements com l’usuari indiqui:
1 à 1
2 à 4
3 à 6
4 à 8
5 à 10
. à .
n à n*2**/

import java.util.Scanner;

public class Exercici36 {
	public static void main(String[] args) {
	
		int resultado=0;
		int contador=1;
		int vueltas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa devuelve un valor, al multiplicar el numero de vueltas del bucle por dos.");
		System.out.println("Introduzca el numero (entero)de vueltas del bucle:");
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		vueltas=teclado.nextInt();
		teclado.close();
		
		if (vueltas>=1){
			resultado=1;
			System.out.println(contador  + " a " + resultado);
		}
		
		for (contador=2;contador<=vueltas;contador++){
			resultado=(contador*2);
			System.out.println(contador  + " a " + resultado);

			}
	}			
}


