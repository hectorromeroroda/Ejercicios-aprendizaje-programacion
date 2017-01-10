//Comptar el nombre d’enters negatius d’una sèrie d’enters que anem llegint i que finalitza amb el número zero.

import java.util.Scanner;

public class exercici64 {
	public static void main(String[] args) {
	
		int numero;
		int contador=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Aquest programa diu el numero d'enters negatius, ingresats per l'usuari, fins que no s'entri un 0.");
		System.out.println("Introdueixi els valors:");
		
		while (!teclado.hasNextInt()){
			teclado.nextLine();	
		}
		numero=teclado.nextInt();
		teclado.nextLine();	
		
		while(numero != 0) {
			if (numero<0){
				contador++;
			}
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			numero=teclado.nextInt();
			teclado.nextLine();	
			
		}
		teclado.close();
		System.out.println("Aquesta serie conté: " + contador + " enter/s negatius");	
	}
}








