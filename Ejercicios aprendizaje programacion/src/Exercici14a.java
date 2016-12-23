/**Demanar un número enter que signifiqui una quantitat d’euros i digui 
la descomposició en bitllets de 5,10,20,50 i 100 y en monedas.**/
import java.util.Scanner;

public class Exercici14a {
	public static final byte BILLETE100=100;
	public static final byte BILLETE50=50;
	public static final byte BILLETE20=20;
	public static final byte BILLETE10=10;
	public static final byte BILLETE5=5;
	public static final byte MONEDA1=1;
	public static final byte MONEDA05=50;
	public static final byte MONEDA02=20;
	public static final byte MONEDA01=10;
	public static final byte MONEDA005=5;
	public static final byte MONEDA002=2;
	
	
public static void main(String[] args) {
		
	double euros;
	double partefraccionaria;
	double resto;
	double resultado;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Este programa le dice la descomposicion en billetes de 100,50,20,10 y 5 euros y en monedas, de un valor dado");	
	System.out.println("Escriba el valor en euros a descomponer:");
	euros=teclado.nextDouble();
	teclado.nextLine();
	teclado.close();
	
	partefraccionaria=((euros)-((int)euros))*100;
	euros=(int) euros;

	resultado=euros/BILLETE100;
	resto=euros%BILLETE100;
	System.out.println("Equivale a " + (int)resultado + " Billete/s de " + BILLETE100 + "€. ");
	
	resultado=resto/BILLETE50;	
	resto=resto%BILLETE50;
	System.out.println("   y " + (int)resultado + " Billete/s de " + BILLETE50 + "€. ");
	
	resultado=resto/BILLETE20;
	resto=resto%BILLETE20;
	System.out.println("   y " + (int)resultado + " Billete/s de " + BILLETE20 + "€. ");
	
	resultado=resto/BILLETE10;
	resto=resto%BILLETE10;
	System.out.println("   y " + (int)resultado + " Billete/s de " + BILLETE10 + "€. ");
	
	resultado=resto/BILLETE5;
	resto=resto%BILLETE5;
	System.out.println("   y " + (int)resultado + " Billete/s de " + BILLETE5 + "€. ");
	
	resultado=resto/MONEDA1;
	resto=resto%MONEDA1;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + MONEDA1 + "€. ");
	
	resultado=partefraccionaria/MONEDA05;
	resto=partefraccionaria%MONEDA05;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + "0,5€");
	
	resultado=resto/MONEDA02;
	resto=resto%MONEDA02;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + "0,2€");
	
	resultado=resto/MONEDA01;
	resto=resto%MONEDA01;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + "0,1€");
	
	resultado=resto/MONEDA005;
	resto=resto%MONEDA005;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + "0,05€");
	
	resultado=resto/MONEDA002;
	resto=resto%MONEDA002;
	System.out.println("   y " + (int)resultado + " Moneda/s de " + "0,02€");
	System.out.println("   y " + String.format("%1$.0f",resto) + " Moneda/s de " + "0,01€");
	
	}
}


