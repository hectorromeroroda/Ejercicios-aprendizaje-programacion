/** Determinar la quantitat de diners que rebrà un treballador per concepte
de les hores extres treballades en una empresa, sabent que quan les
hores de treball excedeixen de 40, la resta es consideren hores extres i
que aquestes es paguen al doble d'una hora normal quan no excedeixen
de 8; si les hores extres excedeixen de 8 es paguen les primeres 8 al
doble del que paguen les hores normals i la resta al triple.**/

import java.util.Scanner;

public class Exercici33 {
	
	public static final float HORAS_TRABAJADAS_MAX=40;
	public static final float HORAS_EXTRAS_DOBLES=8;
	public static final double PRECIO_HORA=21.5;

	public static void main(String[] args) {
			
		float horas_trabajadas;
		float horas_extras;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el sueldo de una persona, teniendo en cuenta el numero de horas extras que ha hecho.");
		System.out.println("Introduzca las horas trabajadas este mes:");
		horas_trabajadas=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (horas_trabajadas<=HORAS_TRABAJADAS_MAX){
			resultado=(horas_trabajadas*PRECIO_HORA);
		}else{
			horas_extras=(horas_trabajadas-HORAS_TRABAJADAS_MAX);
			if (horas_extras<=HORAS_EXTRAS_DOBLES){
				resultado=(((horas_extras*2)+40)*PRECIO_HORA);
			}else{
				resultado=(((horas_extras*3)+40)*PRECIO_HORA);
			}
		}
		System.out.println("Su sueldo de este mes es: " + resultado + "€");
		
	}
}
