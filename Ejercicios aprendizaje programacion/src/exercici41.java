//Calcular la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.

import java.util.Scanner;

public class exercici41 {
	public static void main(String[] args) {
			
			float valor=1;
			int contador=0;
			float resultado=0;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Aquest programa calcula la mitja aritmètica dels valors ingressats per l'usuari fins que no s'entri un 0.");
			System.out.println("Introdueixi valors:");
			
			while (teclado.hasNextFloat()!=true){
				teclado.nextLine();	
			}
			valor=teclado.nextFloat();
			teclado.nextLine();	
		
			while (valor!=0){
				resultado=(resultado + valor);	
				contador++;
				while (teclado.hasNextFloat()!=true){
					teclado.nextLine();	
				}
				valor=teclado.nextFloat();
				teclado.nextLine();	
			}
				
			teclado.close();
			if (contador!=0){
				resultado=(resultado / contador);	
				System.out.println("La mitjana aritmetica de sumar els " + contador + " valors, es: " + resultado);

			}else{
				System.out.println("Error, ha introducido valores");

			}
			
	}
}


