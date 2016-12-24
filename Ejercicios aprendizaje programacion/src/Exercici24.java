/**Fer un algorisme que serveixi tant per calcular l’àrea d’un rectangle com
el perímetre d’un rectangle. Se li demanarà a l’usuari el valor dels dos
costats i quina operació vol realitzar(A-àrea i P-perímetre) mostrant el
resultat segons l’opció indicada per l’usuari.**/

import java.util.Scanner;

public class Exercici24 {
	public static void main(String[] args) {
		
		float lado1;
		float lado2;
		float resultado;
		char opcion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el area o el perimetro de un rectangulo dados los valores de los lados por el usuario");
		System.out.println("Introduzca valor del primer lado:");
		lado1=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca valor del segundo lado:");
		lado2=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Presione 'A' si quiere calcular el area, o 'P' para calcular el perimetro:");
		opcion=teclado.next().charAt(0);
		teclado.nextLine();
		teclado.close();
		System.out.println(opcion);

		if ((opcion!='A'&& opcion!='a') && (opcion!='P'&& opcion!='p')){
			System.out.println("Error, debe escojer entre 'A' o 'P'");
		}else{
			if (opcion=='A'||opcion=='a'){
				resultado=(lado1*lado2);
				System.out.println(resultado);
			}else{
				resultado=((lado1*2)+(lado2*2));
				System.out.println(resultado);
			}
		}
			
	}
}

