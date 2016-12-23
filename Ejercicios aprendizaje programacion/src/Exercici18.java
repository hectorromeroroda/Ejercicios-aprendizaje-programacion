//Introduir 4 números i dir si la suma dels dos primers és més gran, igual o més petit que la suma dels 2 següents.

import java.util.Scanner;

public class Exercici18 {
	public static void main(String[] args) {
		
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float resultado_suma1y2;
		float resultado_suma3y4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce 4 numeros, el programa dirá si la suma de los dos primeros es mas grande, igual o mas pequeña ");
		System.out.println("que la suma de los dos ultimos numeros.\n");
		System.out.println("Introduzca el primer número:");
		numero1=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el segundo número:");
		numero2=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el tercer número:");
		numero3=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el quarto número:");
		numero4=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();

		
		resultado_suma1y2=(numero1+numero2);
		resultado_suma3y4=(numero3+numero4);
		
		if (resultado_suma1y2<resultado_suma3y4){
			System.out.println(resultado_suma1y2 + " es menor que " + resultado_suma3y4);
		}else{
			if ((resultado_suma1y2>resultado_suma3y4)){
				System.out.println(resultado_suma1y2 + " es mayor que " + resultado_suma3y4);
			}else{
				System.out.println("El resultado es el mismo");
				}
			}
	}
}
