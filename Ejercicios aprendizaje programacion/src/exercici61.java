//. Ídem anterior però ara s’ha de comptar ‘LA’ i ‘SI’.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici61 {
	public static void main(String[] args) throws IOException {
		
		int caracter1;
		int caracter2;
		int contador_la=0;
		int contador_si=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero d'LA's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		caracter1 = buffer.read();
		while(caracter1 != 13) {
			caracter2=caracter1;
            caracter1 = buffer.read();   
            if ((caracter2==108 && caracter1==97) || (caracter2==76 && caracter1==65) || (caracter2==76 && caracter1==97) || (caracter2==108 && caracter1==65)){
            	contador_la++;
            }else{
            	 if ((caracter2==115 && caracter1==105) || (caracter2==83 && caracter1==73) || (caracter2==115 && caracter1==73) || (caracter2==83 && caracter1==105)){
                 	contador_si++;
            	 }
            }
		
		}
		System.out.println("La frase contenia: " + contador_la + " LA's i " + contador_si + " SI's");	
	}
}
