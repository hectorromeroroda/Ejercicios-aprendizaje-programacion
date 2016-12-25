//Ídem anterior però ara heu de comptar les vocals que hi ha en el text, tant majúscules com minúscules.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici58 {
	public static void main(String[] args) throws IOException {
		
		int numero_caracter;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero de vocals que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		numero_caracter = buffer.read();
		if (numero_caracter==97 || numero_caracter==65){
        	contador++;
        }
		while(numero_caracter != 13) {
            numero_caracter = buffer.read();    
            switch (numero_caracter){
            	case (65):
            		contador++;
            		break;
            	case (69):
            		contador++;
            		break;
            	case (73):
            		contador++;
            		break;
            	case (79):
            		contador++;
            		break;
            	case (85):
            		contador++;
            		break;
            	case (97):
            		contador++;
            		break;
            	case (101):
            		contador++;
            		break;
            	case (105):
            		contador++;
            		break;
            	case (111):
            		contador++;
            		break;
            	case (117):
            		contador++;
            		break;
            	default:
            		break;
            }		
		}
		System.out.println("La frase contenia: " + contador + " vocals.");	

	}
}
