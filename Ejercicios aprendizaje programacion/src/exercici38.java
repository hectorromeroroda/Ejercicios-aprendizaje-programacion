/**
Visualitzar el seg�ent s�rie tants elements com l�usuari indiqui:
1 � 1
2 � 4
3 � 9
4 � 16
. � .
n � n^ 2
**/
import java.util.Scanner;

public class exercici38 {
	public static void main(String[] args) {
		
		int resultado;
		int contador;
		int vueltas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa devuelve un valor, al elevar al cuadrado el numero de vueltas del bucle.");
		System.out.println("Introduzca el numero (entero) de vueltas del bucle:");
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		vueltas=teclado.nextInt();
		teclado.close();
	
		for (contador=1;contador<=vueltas;contador++){
			resultado=(contador*contador);
			System.out.println(contador  + " a " + resultado);
		}

	
	}
}


