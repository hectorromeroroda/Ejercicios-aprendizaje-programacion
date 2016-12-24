/**Tenint en compte que una equació de segon grau té aquest format:
aX2+bX+c=0. Demanar per teclat el valor de a , b i c per a calcular els dos
valors de X.**/

import java.util.Scanner;

public class Exercici23 {
	public static void main(String[] args) {

		float a;
		float b;
		float c;
		float raiz;
		double resultat_x1;
		double resultat_x2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el resultado de la ecuacion de segundo grado aX2+bX+c=0, donde el usuario dará el valor de A, B y C");
		System.out.println("Introduzca el valor de A:");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el valor de B:");
		b=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el valor de C:");
		c=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (a==0){
			System.out.println("No se puede dividir por 0");

		}else{
			raiz=(b*b)-(4*a*c);
			if (raiz<0){
					System.out.println("No se pueden calcular raices negativas");
			}else{
				resultat_x1 = (-b + Math.sqrt(raiz))/(2*a);
			    resultat_x2 = (-b - Math.sqrt(raiz))/(2*a);
			    System.out.println("El valor de x1 es: " + resultat_x1);
				System.out.println("El valor de x2 es: " + resultat_x2);
			}
		}
	
	}
}
