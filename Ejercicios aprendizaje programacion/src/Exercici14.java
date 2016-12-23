/**Demanar un número enter que signifiqui una quantitat d’euros i digui 
la descomposició en bitllets de 5,10,20,50 i 100.**/

import java.util.Scanner;

public class Exercici14 {
	
	public static final int BILLETE100=100;
	public static final int BILLETE50=50;
	public static final int BILLETE20=20;
	public static final int BILLETE10=10;
	public static final int BILLETE5=5;
	
	public static void main(String[] args) {
		
		int euros;
		int resto;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le dice la descomposicion en billetes de 100,50,20,10 y 5 euros, de un valor dado");	
		System.out.println("Escriba el valor en euros a descomponer:");
		euros=teclado.nextInt();
		teclado.nextLine();
		teclado.close();
		
		resultado=euros/BILLETE100;
		resto=euros%BILLETE100;
		System.out.println("Equivale a " + resultado + " Billete/s de " + BILLETE100 + "€. ");
		resultado=resto/BILLETE50;	
		resto=resto%BILLETE50;
		System.out.println("   y " + resultado + " Billete/s de " + BILLETE50 + "€. ");
		resultado=resto/BILLETE20;
		resto=resto%BILLETE20;
		System.out.println("   y " + resultado + " Billete/s de " + BILLETE20 + "€. ");
		resultado=resto/BILLETE10;
		resto=resto%BILLETE10;
		System.out.println("   y " + resultado + " Billete/s de " + BILLETE10 + "€. ");
		resultado=resto/BILLETE5;
		resto=resto%BILLETE5;
		System.out.println("   y " + resultado + " Billete/s de " + BILLETE5 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");
		
	}
}
