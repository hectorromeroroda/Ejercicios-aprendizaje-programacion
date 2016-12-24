/**Demanar una nota numèrica al usuari i mostrar un text o un altre segons
el rang de valors dins del qual es troba la nota:
 Si és major o igual que 9 i menor o igual que 10, la nota és d’“Excel·lent”.
 Si és major i igual que 6,5 però estrictament menor que 9, la nota és “Notable”.
 Si és major i igual que 5 però estrictament menor que 6,5, la nota és “Suficient”**/

import java.util.Scanner;

public class Exercici25 {
	public static void main(String[] args) {

		float nota;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el valor de su nota, para saber si a sacado un: Excelente, notable o suficiente: ");
		nota=teclado.nextFloat();
		teclado.nextLine();
		teclado.close();
		
		if (nota>10 || nota<5){
			System.out.println("Error, la nota tiene que estar entre 5 y 10");
		}else{
			if (nota>=9){
				System.out.println("Ha sacado un Excelente");
			}else{
				if (nota>=6.5){
					System.out.println("Ha sacado un Notable");
				}else{
					if (nota>=5){
						System.out.println("Ha sacado un Suficiente");
					}
				}
			}	
		}
			
	}
}
