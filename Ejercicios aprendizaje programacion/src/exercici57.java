//Ídem anterior però ara heu de dir el nombre de caràcters diferents de A.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici57 {
	public static void main(String[] args) throws IOException {
		
		int numero_caracter;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero de caracters diferents de A's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		numero_caracter = buffer.read();
		
		while(numero_caracter != 13) {
            numero_caracter = buffer.read();    
            if (numero_caracter!=97 && numero_caracter!=65){
            	contador++;
            }
		}
		System.out.println("La frase contenia: " + contador + " caracter diferents de A's.");	
		
	}
}













