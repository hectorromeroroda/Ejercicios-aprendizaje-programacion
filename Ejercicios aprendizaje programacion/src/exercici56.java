/**
Fer un programa per entrar (caràcter a caràcter) un text (no buit) del que hem de dir el número de A’s que hi ha.
El text s’ acaba quan s’entri un intro.
 **/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici56 {
	public static void main(String[] args) throws IOException {
		
		int numero_caracter;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero d'A's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		numero_caracter = buffer.read();
		if (numero_caracter==97 || numero_caracter==65){
        	contador++;
        }
		while(numero_caracter != 13) {
            numero_caracter = buffer.read();    
            if (numero_caracter==97 || numero_caracter==65){
            	contador++;
            }
		}
		System.out.println("La frase contenia: " + contador + " A's.");	
		
	}
}











