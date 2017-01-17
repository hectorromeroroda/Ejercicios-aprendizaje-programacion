//Este programa dibuja una piramide invertida de asteriscos, del numero de filas que indique el usuario
import java.util.Scanner;

public class piramide_invertida {
	public static void main(String[] args) {
		
		int filas;
		int contador_filas;
		int asteriscos;
		int espacios_blanco;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa dibuja una piramide invertida de asteriscos, del numero de filas que indique el usuario");
		System.out.println("Introduzca el numero de filas:");
		
			while (teclado.hasNextInt()!=true){
				teclado.nextLine();	
			}
			
			filas= teclado.nextInt();
			teclado.nextLine();
			teclado.close();
			
			for (contador_filas=1;contador_filas<=filas;contador_filas++){
				for (espacios_blanco=1;espacios_blanco<contador_filas;espacios_blanco++){
					System.out.print(" ");
				}
				for (asteriscos=((filas*2)-1);asteriscos>=((contador_filas*2)-1);asteriscos--){
					System.out.print("*");
				}
				System.out.println(" ");

			}			
	}
}










