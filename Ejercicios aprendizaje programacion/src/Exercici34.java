/**. Calcular l'import que un treballador rep en el repartiment anual de
beneficis si aquest se li assigna com un percentatge del seu salari
mensual que dep�n de la seva antiguitat en l'empresa d'acord amb la
taula:
Temps Percentatge
Menos de 1 a�o. 5% del salario
1 a�o o m�s y menos de 2 a�os. 7% del salario
2 a�os o m�s y menos de 5 a�os. 10% del salario
5 a�os o m�s y menos de 10 a�os. 15% del salario
10 a�os o m�s. 20% del salario  **/


import java.util.Scanner;

public class Exercici34 {
	
	public static final double CORTE_PRIMERO=105;
	public static final double CORTE_SEGUNDO=107;
	public static final double CORTE_TERCERO=110;
	public static final double CORTE_CUARTO=115;
	public static final double CORTE_QUINTO=120;

	public static void main(String[] args) {
		
		float antiguedad;
		float salario;
		double resultado = 0;
		float pagas_anuales;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el reparto anual de ganancias segun su sueldo mensual, n� de pagas y antiguedad.");
		System.out.println("Introduzca su salario mensual:");
		salario=teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca su numero de pagas anuales:");
		pagas_anuales=teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca su antiguedad en a�os:");
		antiguedad=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (antiguedad<1){
			resultado=((salario*pagas_anuales*CORTE_PRIMERO)/100);
		}else{
			if (antiguedad<2){
				resultado=((salario*pagas_anuales*CORTE_SEGUNDO)/100);
			}else{
				if (antiguedad<5){
					resultado=((salario*pagas_anuales*CORTE_TERCERO)/100);
				}else{
					if (antiguedad<10){
						resultado=((salario*pagas_anuales*CORTE_CUARTO)/100);
					}else{
						if (antiguedad>=10){
							resultado=((salario*pagas_anuales*CORTE_QUINTO)/100);
							}
						}
					}
				}
			}
		System.out.println(resultado);
	}
}
