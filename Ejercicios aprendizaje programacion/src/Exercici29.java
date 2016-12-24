/** El mateix que el 28 pero en cada número introduït indicar si es més gran
o més petit del número que ha indicat l’usuari.**/
import java.util.Scanner;
import java.util.Random;

public class Exercici29 {
	public static void main(String[] args) {
		
		float valor_usuario;
		float valor_random;
		int contador=3;
		Scanner teclado = new Scanner(System.in); 
		Random random = new Random();


		System.out.println("Intente adivinar el valor del 1 al 10 que a pensado el Pc (Dispone de 3 oportunidades)");
		
		valor_random= (int)(random.nextFloat()*10+1);   //Aqui se inventa el numero a adivinar.

		//PRIMER INTENTO----------------------------------------------------------------------------------------
		System.out.println("Introduzca un valor del 1 al 10:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		if (valor_usuario==valor_random){
			System.out.println("Ha adivinado el numero!!!");
		}else{
			contador=(contador-1);
			if (valor_usuario<valor_random){
				System.out.println("Ha fallado, el numero a adivinar es mas grande");
			}else{
					System.out.println("Ha fallado, el numero a adivinar es mas pequeño");
				}
			System.out.println("Le quedan " + contador + " intentos");
			
			//SEGUNDO INTENTO--------------------------------------------------------------------------------------
			System.out.println("Introduzca otro valor del 1 al 10:");
			valor_usuario=teclado.nextFloat();
			teclado.nextLine();
			if (valor_usuario==valor_random){
				System.out.println("Ha adivinado el numero!!!");
			}else{
				contador=(contador-1);
				if (valor_usuario<valor_random){
					System.out.println("Ha fallado, el numero a adivinar es mas grande");
				}else{
					System.out.println("Ha fallado, el numero a adivinar es mas pequeño");
					}
				System.out.println("Le quedan " + contador + " intentos");

				//TERCER INTENTO--------------------------------------------------------------------------------------
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
		
	}
}




