/**L’ordinador pensa un número entre 1 i 10, l’usuari l’intenta encertar, si
es així mostrar un missatge d’enhorabona en cas contrari indicar que ha
fallat.**/

import java.util.Scanner;
import java.util.Random;

public class Exercici27 {
	public static void main(String[] args) {
		
		float valor_usuario;
		float valor_random;
		Scanner teclado = new Scanner(System.in); 
		Random random = new Random();

		System.out.println("Intente adivinar el valor del 1 al 10 que a pensado el ordenador");
		
		valor_random= (int)(random.nextFloat()*10+1);   //Aqui se inventa el numero a adivinar.
		
		System.out.println("Introduzca un valor del 1 al 10:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if(valor_usuario>10 || valor_usuario<1){
			System.out.println("Error, el numero a adivinar esta entre el 1 y el 10");
		}else{
			if (valor_usuario==valor_random){
				System.out.println("Ha adivinado el numero!!!");
			}else{
				System.out.println("Ha fallado, el valor que tenia que adivinar era: " + valor_random);
				System.out.println("Mas suerte la proxima vez!");
			}
		}
			
	}
}


