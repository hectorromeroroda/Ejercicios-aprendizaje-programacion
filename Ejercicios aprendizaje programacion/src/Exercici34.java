/**. Calcular l'import que un treballador rep en el repartiment anual de
beneficis si aquest se li assigna com un percentatge del seu salari
mensual que depèn de la seva antiguitat en l'empresa d'acord amb la
taula:
Temps Percentatge
Menos de 1 año. 5% del salario
1 año o más y menos de 2 años. 7% del salario
2 años o más y menos de 5 años. 10% del salario
5 años o más y menos de 10 años. 15% del salario
10 años o más. 20% del salario  **/


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
		
		System.out.println("Este programa calcula el reparto anual de ganancias segun su sueldo mensual, nº de pagas y antiguedad.");
		System.out.println("Introduzca su salario mensual:");
		salario=teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca su numero de pagas anuales:");
		pagas_anuales=teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Introduzca su antiguedad en años:");
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
