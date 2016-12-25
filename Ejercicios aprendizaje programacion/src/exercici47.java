//Calcular el factorial d’ un nombre demanat per teclat. Exemple: 5! = 5*4*3*2*1

import java.util.Scanner;

public class exercici47 {
	public static void main(String[] args) {
		
		int valor;
		int contador;
		long resultado=1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa calcula el factorial d’ un nombre demanat per teclat.");
		System.out.println("Introdueixi el valor:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		valor=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		if (valor>0){
			for (contador=valor;contador>0;contador--){
				resultado=resultado*contador;
			}
			System.out.println("El resultado es: " + resultado);

		}else{
			System.out.println("El valor deve ser positivo");	
		}
		
	}
}




