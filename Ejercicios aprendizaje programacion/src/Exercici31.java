/**. Fer el jocs del pedra, paper i estisora. Demanar a un primer jugador que
vol estriar la seva figura, demanar al un segon jugador la seva figura i
finalment indicar quin dels dos jugadors a guanyat o si han empatat.**/

import java.util.Scanner;
import java.util.Random;

public class Exercici31 {
	public static void main(String[] args) {

		float valor_usuario;
		float valor_random;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Este programa simula el juego de Piedra-Papel-Tigeras.");
		
		valor_random= (int)(random.nextFloat()*3+0); //Aqui se inventa el numero a adivinar.

		System.out.println("Sabiendo que Tigeras equivale a 0, Piedra a 1 y Papel a 2. ");
		System.out.println("Introduzca uno de los tres valores: ");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if ((valor_usuario>=3) || (valor_usuario<0)){
			System.out.println("Valor erroneo, debe escoger entre 0, 1 o 2.");
		}else{
			System.out.println("El ordenador a sacado: " + valor_random);
			if (valor_usuario==valor_random){
				System.out.println("Habeis quedado empatados");
				}else{
					if ((valor_usuario==0)&&(valor_random==2)){
						System.out.println("Has ganado");
						}else{
							if ((valor_usuario==2)&&(valor_random==0)){
							System.out.println("Has perdido");
							}else{
								if (valor_usuario>valor_random){
									System.out.println("Has ganado");
								}else{
									System.out.println("Has perdido");

							}
						}
					}
				}
			}
	}
}

		
	

		
	

