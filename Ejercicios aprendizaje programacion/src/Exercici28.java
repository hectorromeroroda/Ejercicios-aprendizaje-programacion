//El mateix exercici 27 pero amb 3 oportunitats per encertar.

import java.util.Scanner;
import java.util.Random;

public class Exercici28 {
	public static void main(String[] args) {
		
		float valor_usuario;
		float valor_random;
		int contador=3;
		Scanner teclado = new Scanner(System.in); 
		Random random = new Random();

		System.out.println("Intente adivinar el valor del 1 al 10 que a pensado el ordenador. (Dispone de 3 oportunidades)");
		
		valor_random= (int)(random.nextFloat()*10+1);   //Aqui se inventa el numero a adivinar.

		System.out.println("Introduzca un valor del 1 al 10:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		
		if (valor_usuario==valor_random){
			System.out.println("Ha adivinado el numero!!!");
		}else{
			contador=(contador-1);
			System.out.println("Ha fallado, le quedan " + contador + " intentos");
		}
		
		System.out.println("Introduzca otro valor del 1 al 10:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		
		if (valor_usuario==valor_random){
			System.out.println("Ha adivinado el numero!!!");
		}else{
			contador=(contador-1);
			System.out.println("Ha fallado, le queda " + contador + " intentos");
		}

		System.out.println("Introduzca otro valor del 1 al 10:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (valor_usuario==valor_random){
			System.out.println("Ha adivinado el numero!!!");
		}else{
			System.out.println("Ha fallado, el numero a adivinar era: " +  valor_random + ", mas suerte la proxima vez!");
		}
		
	}
}




