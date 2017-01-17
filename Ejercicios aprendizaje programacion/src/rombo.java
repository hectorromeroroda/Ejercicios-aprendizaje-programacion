//Este programa dibuja un rombo de asteriscos, del numero de filas que indique el usuario
import java.util.Scanner;

public class rombo {
	public static void main(String[] args) {
			
			int filas_superiores;
			int filas_inferiores;
			int contador_filas;
			int asteriscos;
			int espacios_blanco;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Este programa dibuja un rombo de asteriscos, del numero de filas que indique el usuario");
			System.out.println("Introduzca el numero de filas:");
			
				while (teclado.hasNextInt()!=true){
					teclado.nextLine();	
				}
				
				filas_superiores= teclado.nextInt();
				teclado.nextLine();
				teclado.close();
				
				
				for (contador_filas=1;contador_filas<=filas_superiores;contador_filas++){
					for (espacios_blanco=(filas_superiores-1);espacios_blanco>=contador_filas;espacios_blanco--){
						System.out.print(" ");
					}
					for (asteriscos=1;asteriscos<=((contador_filas*2)-1);asteriscos++){
						System.out.print("*");
					}
					System.out.println(" ");
				}
				
				for (filas_inferiores=1;filas_inferiores<=(filas_superiores-1);filas_inferiores++){
					for (espacios_blanco=1;espacios_blanco<=filas_inferiores;espacios_blanco++){
						System.out.print(" ");
					}
					for (asteriscos=(((filas_superiores-1)*2)-1);asteriscos>=((filas_inferiores*2)-1);asteriscos--){
						System.out.print("*");
					}
					System.out.println(" ");
				}
				
					
		}
	}












