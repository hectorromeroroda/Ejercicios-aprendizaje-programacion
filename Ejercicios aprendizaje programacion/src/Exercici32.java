/**Fer un programa que permetí calcular descomptes segons unes premises
donades per l'usuari, les regles i passos a seguir son els seguents
 Decidir quin és el valor mínim per optar al descompte, quin
percentatge es descomptarà i el valor màxim possible.
 Demanar que s’introdueixi el preu inicial, en euros, pel teclat.
 Llegir-lo.
 Comprovar que el preu és correcte i no és negatiu:
 Si es compleix, veure si el preu introduït és igual o superior al
valor mínim per optar al descompte:
 Si és així, calcular el descompte.
 Comprovar si el descompte supera el màxim permissible:
 Si és així, el descompte es redueix al màxim permissible.
 Aplicar el descompte sobre el preu inicial.
 Mostrar el preu final.
 Si el preu era negatiu, mostrar un missatge d’error.**/

import java.util.Scanner;

public class Exercici32 {
	
	public static final float VALOR_MINIMO_DESCUENTO=50;
	public static final float PORCENTAJE_DESCUENTO=10;
	public static final float DESCUENTO_MAX=50;

	public static void main(String[] args) {

		float valor_usuario;
		float resultado;	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un valor para calcular su descuento:");
		valor_usuario=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (valor_usuario<=0){
			System.out.println("Error, valor no valido");
			}else{
				resultado=((PORCENTAJE_DESCUENTO*valor_usuario)/100);
				if (resultado<=DESCUENTO_MAX){
					resultado=(valor_usuario-resultado);
					System.out.println("El resultado con el descuento del " + PORCENTAJE_DESCUENTO + "% " + "aplicado, es: " + resultado + "€");
				}else{
					resultado=(valor_usuario-DESCUENTO_MAX);
					System.out.println("El resultado con el descuento del " + PORCENTAJE_DESCUENTO + "% " + "aplicado sobre los primeros " + (PORCENTAJE_DESCUENTO*DESCUENTO_MAX) + "€, es: " + resultado + "€");
				}
			}	
	
	}
}
