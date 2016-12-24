/**
B –Introduir un import en euros real i indicar el número mínim de bitllets i monedes que li correspon.
Bitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.01.
**/

import java.util.Scanner;
import java.lang.Math;

public class exercici37b {
	public static final int BILLETE500=500;
	public static final int BILLETE200=200;
	public static final int BILLETE100=100;
	public static final int BILLETE50=50;
	public static final int BILLETE20=20;
	public static final int BILLETE10=10;
	public static final int BILLETE5=5;
	public static final int MONEDA2=2;
	public static final int MONEDA1=1;
	public static final int MONEDA05=50;
	public static final int MONEDA02=20;
	public static final int MONEDA01=10;
	public static final int MONEDA005=5;
	public static final int MONEDA002=2;
	public static final int MONEDA001=1;

	public static void main(String[] args) {
		
		double euros;
		double parte_fraccionaria;
		double contador=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa le dice la descomposicion en billetes de 500, 200, 100,50,20,10 y 5 euros y monedas de 2 y 1  0,5, 0,2 etc euros, de un valor dado");	
		System.out.println("Escriba el valor en euros a descomponer:");
		while (teclado.hasNextDouble()!=true){
			teclado.nextLine();	
		}
		euros=teclado.nextDouble();
		teclado.close();
		
		parte_fraccionaria=(((euros)-((int)euros))*100);
		parte_fraccionaria=Math.round(parte_fraccionaria);//Para redondear la parte fraccionaria y que no tenga decimales
		euros=(int) euros;

		while (euros>=BILLETE500){
			euros= (euros-BILLETE500); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 500€");
		contador=0;
		
		while (euros>=BILLETE200){
			euros= (euros-BILLETE200); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 200€");
		contador=0;
		
		while (euros>=BILLETE100){
			euros= (euros-BILLETE100); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 100€");
		contador=0;
		
		while (euros>=BILLETE50){
			euros= (euros-BILLETE50); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 50€");
		contador=0;

		while (euros>=BILLETE20){
			euros= (euros-BILLETE20); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 20€");
		contador=0;
		
		while (euros>=BILLETE10){
			euros= (euros-BILLETE10); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 10€");
		contador=0;
	
		while (euros>=BILLETE5){
			euros= (euros-BILLETE5); 
			contador= contador+1;
		}
		System.out.println(contador + " billetes de 5€");
		contador=0;
		
		while (euros>=MONEDA2){
			euros= (euros-MONEDA2); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 2€");
		contador=0;
		
		while (euros>=MONEDA1){
			euros= (euros-MONEDA1); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 1€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA05){
			parte_fraccionaria= (parte_fraccionaria-MONEDA05); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,5€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA02){
			parte_fraccionaria= (parte_fraccionaria-MONEDA02); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,2€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA01){
			parte_fraccionaria= (parte_fraccionaria-MONEDA01); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,1€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA005){
			parte_fraccionaria= (parte_fraccionaria-MONEDA005); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,05€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA002){
			parte_fraccionaria= (parte_fraccionaria-MONEDA002); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,02€");
		contador=0;
		
		while (parte_fraccionaria>=MONEDA001){
			parte_fraccionaria= (parte_fraccionaria-MONEDA001); 
			contador= contador+1;
		}
		System.out.println(contador + " moneda de 0,01€");
		contador=0;

	}
}
	


