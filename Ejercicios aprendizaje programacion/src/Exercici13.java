/**Demanar un número enter que signifiqui una quantitat d’euros i digui 
quants bitllets de 5, 10, 20,50 i 100 son equivalents**/

import java.util.Scanner;

public class Exercici13 {
	
	public static final short BILLETE100=100;
	public static final short BILLETE50=50;
	public static final short BILLETE20=20;
	public static final short BILLETE10=10;
	public static final short BILLETE5=5;
	
	public static void main(String[] args) {
		
		int euros;
		int resultado;
		int resto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula la equivalencia de un valor dado, en billetes de 100,50,20,10 y 5 euros");
		System.out.println("Escriba un valor para hacer su euivalencia:");
		euros=teclado.nextInt();
		teclado.nextLine();
		teclado.close();

		resultado=euros/BILLETE100;
		resto= euros%BILLETE100;
		System.out.print("Equivale a " + resultado + " Billetes de " + BILLETE100 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");		
		
		resultado=euros/BILLETE50;
		resto= euros%BILLETE50;
		System.out.print("Equivale a " + resultado + " Billetes de " + BILLETE50 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");
		
		resultado=euros/BILLETE20;
		resto= euros%BILLETE20;
		System.out.print("Equivale a " + resultado + " Billetes de " + BILLETE20 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");
		
		resultado=euros/BILLETE10;
		resto= euros%BILLETE10;
		System.out.print("Equivale a " + resultado + " Billetes de " + BILLETE10 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");
		
		resultado=euros/BILLETE5;
		resto= euros%BILLETE5;
		System.out.print("Equivale a " + resultado + " Billetes de " + BILLETE5 + "€. ");
		System.out.println("Y se desprecian " + resto + "€");
		
	}
}
