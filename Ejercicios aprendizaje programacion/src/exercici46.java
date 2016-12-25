//Visualitzar els N primers nombres imparells positius, sent N un valor entrat per teclat

import java.util.Scanner;

public class exercici46 {
	public static void main(String[] args) {
		
		int valor;
		int contador;
		int sumador=0;
		long resultado=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa visualitzar els N primers nombres imparells positius, sent N un valor entrat per teclat:");
		System.out.println("Introdueixi el valor de N:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		valor=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		
		if (valor>0){
			System.out.println("1");
			for (contador=1;contador<valor;contador++){
				sumador=sumador+2;
				resultado= sumador+1;
				System.out.println(resultado);
			}
		}else{
			System.out.println("El valor deve ser positivo");
		}
	
	}
}
