/**
Visualitzar un quadrat de N asteriscs, sent N un valor entrat per teclat.
Exemple per N= 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
**/

import java.util.Scanner;

public class exercici48 {
	public static void main(String[] args) {
		
		int valor;
		int contador;
		int contador1;
		char asterisco='*';
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa visualitza un quadrat de N asteriscs, sent N un valor entrat per teclat");
		System.out.println("Introdueixi el valor de N:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		valor=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		
		if (valor>0){
			for (contador=1;contador<=valor;contador++){
				for(contador1=1;contador1<=valor;contador1++){
					System.out.print(asterisco + " ");
				}
				System.out.println("");
			}
		}else{
			System.out.println("El valor deve ser positivo");
		}
	}
}






