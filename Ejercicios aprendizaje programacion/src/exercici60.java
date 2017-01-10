//Igual que l’exercici 56 però cal comptar la seqüència dels dos caràcters ‘LA’.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici60 {
	public static void main(String[] args) throws IOException {
		
		int caracter1;
		int caracter2=0;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero d'LA's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		caracter1 = buffer.read();
		
		while(caracter1 != 13) {
			if (((caracter1==97) || (caracter1==65)) && ((caracter2==108) || (caracter2==76))) {	//Si caracter 1 es = 'a' o 'A'. Y caracter2 es = 'l' o 'L'
				contador++;
            }
			caracter2 = caracter1;
            caracter1 = buffer.read();   
		}
		System.out.println("La frase contenia: " + contador + " LA's.");	
		
	}
}





