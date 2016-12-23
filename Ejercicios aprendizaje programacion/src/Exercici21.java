//Introduir 3 números i a continuació que els escrigui ordenats de major a menor.

import java.util.Scanner;

public class Exercici21 {
	public static void main(String[] args) {

		float a;
		float b;
		float c;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa saca por pantalla los tres numeros ingresados por el usuario, ordenados de mayor a menor");
		System.out.println("Introduzca el primer numero:");
		a=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el segundo numero:");
		b=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduzca el tercer número:");
		c=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		 if (a >= b){
     		if (b >= c){
     			System.out.print(a + " > " + b + " > " + c+ ".");
     		}else{
	            if (a >= c){
	                System.out.print(a + " > " + c + " > "+ b + ".");
	            }else{
	                System.out.print(c + " > " + a + " > "+ b + ".");
	            	}
     			}
		 }else {
	    		if (c >= b){
	    			System.out.print(c + " > " + b + " > " + a+ ".");
	    		}else{
	    			if (c >= a){
		    			System.out.print(b + " > " + c + " > " + a+ ".");
	    			}else{
		    			System.out.print(b + " > " + a + " > " + c+ ".");
	    				}
	    			}
		 	}	
	}
}
