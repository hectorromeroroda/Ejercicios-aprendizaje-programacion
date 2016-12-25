/*
Fer un programa que calculi el N termes de la sèrie Fibonacci
Exemple per N = 7, el resultat seria, ja
a. La sèrie de Fibonacci seria: 1 1 2 3 5 8 13 ..
b. Aquesta sèrie es calcula tenint en compte que el primer i segon valor de la sèrie és 1, i a partir d'ells el
tercer membre i successius es calculen amb la suma dels dos anteriors.
c. S’ha de tenir en compte que no es pot calcular la sèrie de Fibonacci per un número inferior a 2, i això
s’ha de controlar.
*/
import java.util.Scanner;

public class exercici50 {
	public static void main(String[] args) {
		
		int vueltas;
		long valor_actual=1;
		long valor_anterior=0;
		long valor_siguiente;
		int contador;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa visualitza 'N' numeros de la succecio de Fibonacci, on 'N' es introduit per l'usuari");
		System.out.println("Introdueixi el valor de N:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		vueltas=teclado.nextInt();
		teclado.nextLine();	
		
		while (vueltas<2){
			System.out.println("El valor ha de ser >=2. Introduzca un nuevo valor:");
			while (teclado.hasNextInt()!=true){
				teclado.nextLine();	
			}
			vueltas=teclado.nextInt();
			teclado.nextLine();	
		}
		
		for (contador=1;contador<=vueltas;contador++){
			System.out.println(valor_actual);
			valor_siguiente=valor_actual + valor_anterior;
			valor_anterior=valor_actual;
			valor_actual=valor_siguiente;
		}
				
	}
}



