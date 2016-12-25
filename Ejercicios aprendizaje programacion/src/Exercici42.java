//Dir quin és el valor més gran d’ una seqüència de nombres acabada amb el 0.

import java.util.Scanner;

public class Exercici42 {
	public static void main(String[] args) {
		
		float valor;
		float resultado=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa calcula el valor mes gran entre els valors ingressats per l'usuari fins que no s'entri un 0.");
		System.out.println("Introdueixi valors:");
		
		while (teclado.hasNextFloat()!=true){
			teclado.nextLine();	
		}
		valor=teclado.nextFloat();
		teclado.nextLine();	
		
		if (valor!=0){
			while (valor!=0){
				if (resultado<valor){
					resultado=valor;
				}
				while (teclado.hasNextFloat()!=true){
					teclado.nextLine();	
				}
				valor=teclado.nextFloat();
				teclado.nextLine();	
				}
			teclado.close();
			System.out.println("El valor mes gran entre els ingressats es: " + resultado);
		}else{
			System.out.println("No ha ingresado ningun valor");

		}
			
	}
}




