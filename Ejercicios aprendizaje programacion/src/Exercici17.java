/*Llegir un n�mero pel teclat, si aquest es m�s gran de 20 mostrar com a resultat el n�mero elevat
  a dos en cas contrari mostrar com a resultat el n�mero elevat a 3.*/
 
import java.util.Scanner;

public class Exercici17 {
	public static void main(String[] args) {
		
		float numero;
		float resultado;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Este programa lee un numero del teclado, si �ste es menor a 20, se muestra como resultado ");
		System.out.println("el n�mero elevado a 3, si es mayor, se muestra como resultado el n�mero elevado a 2.\n");
		System.out.println("Introduzca un n�mero:");
		numero=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();

		if (numero>20){
			resultado=(numero*numero);
		}else{
			resultado=(numero*numero*numero);
			}
		System.out.println(String.format("El resultado es: " + "%1$.2f",resultado) );
		
	}
}
