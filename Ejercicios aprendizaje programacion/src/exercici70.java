/*Fer un joc en el qual l�ordinador s�inventar� dos n�mero (entre el 1 i el 100) i l�usuari haur� de dir quin �s el
resultat de la seva multiplicaci�. Si l�usuari l�encerta guanya i se li mostr� un missatge de guanyador. Si l�usuari
no indica correctament el resultat de la multiplicaci� anir� introduint valors fins que l�encerti. Al finalitzar se li
preguntar� si vol fer un altre partida, en cas afirmatiu el proc�s torna a comen�ar.
*/
import java.util.Random;
import java.util.Scanner;

public class exercici70 {
	public static void main(String[] args) {
		
		int resultado;
		int numero=0;
		char si_no='y';
		int valor_random1;
		int valor_random2;
		Scanner teclado = new Scanner(System.in);
		Random random1 = new Random();
		Random random2 = new Random();
		
		valor_random1= (int)(random1.nextFloat()*100+1);
		valor_random2= (int)(random2.nextFloat()*100+1);
		resultado= (valor_random1*valor_random2);

		System.out.println("Aquest programa s'inventa numeros entre 1 i el 100 i s'ha d'adivinar el resultat de multiplicar-lo entre si. ");
		System.out.println("Resultat de: " + valor_random1 + "*"  + valor_random2 + "=???");
		System.out.println("Introdueixi el resultat:");
		
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			numero=teclado.nextInt();
			teclado.nextLine();
			
		while ((si_no=='y')||(si_no=='Y')){	
			while (numero!=resultado){
				System.out.println("Resultado erroneo, siga probando");
				while (!teclado.hasNextInt()){
					teclado.nextLine();	
				}
				numero=teclado.nextInt();
				teclado.nextLine();
			}
			System.out.println("Ha acertado! Quiere seguir jugando?");
			System.out.println("Introducza 'Y' para seguir jugando, y 'N' para avandonar el juego");
			si_no=teclado.next().charAt(0);
			teclado.nextLine();	
			if ((si_no=='y')||(si_no=='Y')){
				valor_random1= (int)(random1.nextFloat()*100+1);
				valor_random2= (int)(random2.nextFloat()*100+1);
				resultado= (valor_random1*valor_random2);
				
				System.out.println("Resultat de: " + valor_random1 + "*"  + valor_random2 + "=???");
				System.out.println("Introdueixi el resultat:");
				
					while (!teclado.hasNextInt()){
						teclado.nextLine();	
					}
					numero=teclado.nextInt();
					teclado.nextLine();
			}

		}		
		
	}
}














