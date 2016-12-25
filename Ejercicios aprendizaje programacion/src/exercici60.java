//Igual que l’exercici 56 però cal comptar la seqüència dels dos caràcters ‘LA’.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici60 {
	public static void main(String[] args) throws IOException {
		
		int caracter1;
		int caracter2;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero d'LA's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		caracter1 = buffer.read();
		//caracter2=0 deveria ser asi. Quitando la lectura del de abajo. No hay que repetir buffers dentro de while.
		while(caracter1 != 13) {
			caracter2=caracter1;// No es del todo correcto, esto deveria estar fuera del while, encima, debajo de caracter1 = buffer.read();
            caracter1 = buffer.read();   
            if ((caracter2==108 && caracter1==97) || (caracter2==76 && caracter1==65) || (caracter2==76 && caracter1==97) || (caracter2==108 && caracter1==65)){
            	contador++; //Se pueden quitar opciones del IF poniendo Si caracter actual es x o X y caracter anterior es y o Y
            }

		}
		System.out.println("La frase contenia: " + contador + " LA's.");	
		
	}
}





