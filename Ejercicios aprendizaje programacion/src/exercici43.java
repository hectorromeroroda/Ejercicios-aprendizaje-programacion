//Calcular el valor més gran, més petit i la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.
import java.util.Scanner;

public class exercici43 {
	public static void main(String[] args) {
		
		float valor=1;
		float num_pequenyo;
		float num_grande;
		float resultado=0;
		int contador=0;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa calcula el valor mes gran, mes petit i mitjana aritmetica, entre els valors ingressats per l'usuari fins que no s'entri un 0.");
		System.out.println("Introdueixi valors:");
		
		while (teclado.hasNextFloat()!=true){
			teclado.nextLine();	
		}
		valor=teclado.nextFloat();
		teclado.nextLine();	
		num_pequenyo=valor;
		num_grande=valor;
		
		if (valor==0){
			System.out.println("Error, no ha ingresado valores");	
		}else{
			while (valor!=0){
				contador++;
				resultado=(resultado + valor);
				if (valor>num_grande){
					num_grande=valor;
				}
				if (valor<num_pequenyo){
					num_pequenyo=valor;		
				}
				while (teclado.hasNextFloat()!=true){
					teclado.nextLine();	
				}
				valor=teclado.nextFloat();
				teclado.nextLine();		
			}
		
			teclado.close();
			resultado= (resultado/contador);
			System.out.println("La mitja aritmetica es: " + resultado);
			System.out.println("El numero mes gran que has entrat es: " + num_grande);
			System.out.println("El numero mes petit que has entrat es: " + num_pequenyo);
		}
		
	}
}
