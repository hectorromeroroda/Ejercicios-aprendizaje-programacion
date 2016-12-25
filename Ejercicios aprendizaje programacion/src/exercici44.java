//Introduir un número i que es visualitzi la seva taula de multiplicar del 1 al 10.

import java.util.Scanner;

public class exercici44 {
	public static void main(String[] args) {
		
		int numero;
		int contador;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa mostra la taula de multiplicar d'un nombre (entre l'1 i el 10 ambos incluidos) entrat per l'usuari");
		System.out.println("Introdueixi el numero:");
		
			while (teclado.hasNextInt()!=true){
				teclado.nextLine();	
			}
			
			numero= teclado.nextInt();
			teclado.nextLine();
			teclado.close();
			
			if ((numero<0) || (numero>10)){
				System.out.println("Error, valor no valido");
			}else{
				if (numero==0){
				System.out.println("Cualquier cosa multiplicada por 0 da 0.");
				}else{
					for (contador=1;contador<=10;contador++){
						resultado= (contador * numero);
						System.out.println(contador + "*" + numero + "=" + resultado);
					
					}
				}
			}
				
	}
}








