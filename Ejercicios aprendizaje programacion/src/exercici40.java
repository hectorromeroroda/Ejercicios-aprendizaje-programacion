//Calcular la suma d'una seqüència de nombres acabada amb el 0.

import java.util.Scanner;

public class exercici40 {
	public static void main(String[] args) {
			
			float valor=1;
			float resultado=0;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Aquest programa calcula la suma dels valors ingressats per l'usuari fins que no s'entri un 0.");
			System.out.println("Introdueixi valors:");
			
			while (valor!=0){
				while (teclado.hasNextFloat()!=true){
					teclado.nextLine();	
				}
				valor=teclado.nextFloat();
				teclado.nextLine();	
				resultado=(resultado + valor);	
			}	
			teclado.close();
			System.out.println("El resultat es: " + resultado);
	}
}
