/*
Fer un joc en el qual l�ordinador s�inventi un n�mero entre el 1 i el 100. Per cada intent el jugador intentar�
encertar el n�mero. En el cas de que l�encerti el joc finalitzar�, en cas contrari se li haur� d�indicar al jugador
si el n�mero es m�s gran o m�s petit que el que ha d�encertar. Al final, una vegada el jugador hagi encertat el
n�mero, se li mostrar� quantes oportunitats ha necessitat per endevinar el n�mero.
 */

import java.util.Random;
import java.util.Scanner;

public class exercici68 {
	public static void main(String[] args) {
		
		int numero;
		int contador=0;
		int valor_random;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		valor_random= (int)(random.nextFloat()*100+1);

		System.out.println("Aquest programa s'inventa un numero entre 1 i el 100 i s'ha d'adivinar. ");
		System.out.println("Introdueixi el numero:");
		
		
		do {
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			numero=teclado.nextInt();
			teclado.nextLine();
		}
		while((numero<1)||(numero>100));
		
		while (numero!=valor_random){
			if(numero<valor_random){
				System.out.println("El numero introducido es mas pequenyo que el que hay que adivinar.");
			}else{
				System.out.println("El numero introducido es mas grande que el que hay que adivinar");
			}
			contador++;
			
			do{
				while (!teclado.hasNextInt()){
					teclado.nextLine();	
				}
				numero=teclado.nextInt();
				teclado.nextLine();
			}
			while ((numero<1)||(numero>100));
				
		}
		contador++;
		teclado.close();
		System.out.println("Ha acertado, ha necesitado " + contador + " intentos");

			
		
	}
}












