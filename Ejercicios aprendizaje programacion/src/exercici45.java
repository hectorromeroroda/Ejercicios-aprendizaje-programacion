//Introduir dos número n i m i fer la taula del 1 al n del número m.

import java.util.Scanner;

public class exercici45 {
	public static void main(String[] args) {
		
		float numero;
		int contador;
		int vueltas;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa mostra la taula de multiplicar d'un nombre (entre l'1 i el numero escollit) entrat per l'usuari");
		System.out.println("Introdueixi el numero a multiplicar:");
		while (teclado.hasNextFloat()!=true){
			teclado.nextLine();	
		}
		numero=teclado.nextFloat();
		teclado.nextLine();	
		
		if (numero==0){
			System.out.println("Cualquier cosa multiplicada por 0 da 0.");	
		}else{
			System.out.println("Introdueixi fins quin numero vol multiplicar:");
			while (teclado.hasNextInt()!=true){
				teclado.nextLine();	
			}
			vueltas=teclado.nextInt();
			teclado.nextLine();	
			teclado.close();
			
			if (vueltas==0){
				System.out.println("Cualquier cosa multiplicada por 0 da 0.");
			}else{ 
				if (vueltas<0){
				System.out.println("Error, el valor deve ser positivo");
				}else{
					for(contador=1;contador<=vueltas;contador++){
						resultado= (contador * numero);
						System.out.println(contador + "*" + numero + "=" + resultado);	
					}
				}
			}	
		}
		
	}
}
