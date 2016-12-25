/**
Fer un algorisme que escrigui el triangle de Floyd. Inicialment llegirem un número N enter que representarà el
número de files a escriure.
Exemple per N=4
1
2 3
4 5 6
7 8 9 10
**/

import java.util.Scanner;

public class exercici49 {
	public static void main(String[] args) {
		
		int filas;
		int contador;
		int contador1;
		int numero=1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa visualitza el triangle de Floyd, de N filas, on el  valor de N es entrat per l'usuari");
		System.out.println("Introdueixi el valor de N:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		filas=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		if (filas>0){
			for (contador=1;contador<=filas;contador++){
				for(contador1=1;contador1<=contador;contador1++){
					System.out.print(numero + " ");
					numero++;
				}
				System.out.println("");	
				}
		}else{
			System.out.println("El valor deve ser positivo");

		}
	}
}



