// Escriure els divisors d’un número enter llegit per teclat.

import java.util.Scanner;

public class exercici66 {
	public static void main(String[] args) {
		
		int numero;
		int divisor;
		int contador;
		boolean negativo=false;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Aquest programa escriu els divisors d’un número enter, ingresat per l'usuari ");
		System.out.println("Introdueixi el numero:");
		
		while (!teclado.hasNextInt()){
			teclado.nextLine();	
		}
		numero=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		
		if (numero!=0){
			if (numero<=0){
				numero=numero*-1;
				negativo=true;
			}
				
			for (contador=1;contador<=numero;contador++){
				divisor=numero%contador;
				if ((divisor==0)&&(negativo==true)){
					System.out.println((contador*-1) + " es divisor de " + numero*-1);		
				}else{
					if (divisor==0){
					System.out.println(contador + " es divisor de " + numero);		
					}
				}
			}
		}else{
			System.out.println("El divisor de 0 es 0.");		

		}
	}
}









