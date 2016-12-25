/**
Fer un programa que imprimeixi una figura semblant a la representada a continuació havent llegit un número N
per teclat.
Exemple pe N = 4
    *
   ***
  *****
 *******
**/
import java.util.Scanner;

public class exercici51 {
	public static void main(String[] args) {
		
		int filas;
		int contador1;
		int contador2;
		int contador3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa visualitza el triangle d'asterisc (*), de N filas, on el  valor de N es entrat per l'usuari.");
		System.out.println("Introdueixi el valor de N:");

		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		filas=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();

		for (contador1=1;contador1<=filas;contador1++){
			for (contador2=filas-1;contador2>=contador1;contador2--){
				System.out.print(" ");
			}
			for (contador3=1;contador3<=((contador1*2)-1);contador3++){
				System.out.print("*");	
			}
			System.out.println("");
		}	
	}
}





