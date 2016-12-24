/**Visualitzar el 20 primers nombres naturals amb els següents esquemes: 25.a) mentre 25.b) repetir i 25.c)
per.**/


public class Exercici35 {
	public static void main(String[] args) {
	
		int contador=1;
		
		System.out.println("Este programa visualiza los 20 primeros numeros naturales, utilizando bucles");
		while (contador<=20){
			System.out.println(contador);
			contador= contador+1;
		}
		
		for (contador=1;contador<=20;contador++){
			System.out.println(contador);

		}

		contador=1;
		do {
			System.out.println(contador);
			contador= contador+1;

		}while (contador<=20);
	}
}
