//D’una llista de 10 nombres calcular la seva mitja aritmètica.

import java.util.Scanner;

public class exercici39 {
	public static void main(String[] args) {
		
		float resultado=0;
		int contador;
		float valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa calcula la mitja aritmètica de 10 valors ingressats per l'usuari.");
		System.out.println("Introdueixi 10 valors:");
		
		for (contador=1;contador<=10;contador++){
			while (teclado.hasNextFloat()!=true){
				teclado.nextLine();	
			}
			valor=teclado.nextFloat();
			teclado.nextLine();	
			resultado=(resultado + valor);
		}
		teclado.close();
		resultado=(resultado/10);
		System.out.println("La mitja aritmètica és: " + resultado);
		}
	}

