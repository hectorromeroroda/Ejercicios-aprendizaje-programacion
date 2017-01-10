//Calcular la mitja aritmètica d’una sèrie de d’enters positius que finalitza amb el 0, només els enters positius.

import java.util.Scanner;

public class exercici65 {
	public static void main(String[] args) {
		
		float numero;
		float resultado_suma=0;
		float resultado;
		int contador=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Aquest programa calcula la mitjana aritmetica d'una series d'enters positius, ingresats per l'usuari fins a ingressar un 0. ");
		System.out.println("Introdueixi els valors:");
		
		while (!teclado.hasNextFloat()){
			teclado.nextLine();	
		}
		numero=teclado.nextFloat();
		teclado.nextLine();	
		
		while(numero != 0) {
			if (numero>0){
				resultado_suma=resultado_suma+numero;
				contador++;
			}
			while (!teclado.hasNextFloat()){
				teclado.nextLine();	
			}
			numero=teclado.nextFloat();
			teclado.nextLine();	
			
            }
		teclado.close();
		if (contador==0){
			System.out.println("No se puede realizar la operacion");
		}else{
			resultado=resultado_suma/contador;
			System.out.println("La mitja aritmetica es: " + resultado);
		}
		
	}
}







