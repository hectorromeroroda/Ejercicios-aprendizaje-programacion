/*Compteu el número de vegades que surten els dos primers caràcters consecutivament, la introducció de lletra
finalitza amb el punt ‘.’, per exemple, si la frase comença amb HOLA QUE ASE, caldrà comptar HO
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici63 {
	public static void main(String[] args) throws IOException {
		
		int icaracter_actual;
		char caracter_actual='?';
		char caracter_inicial1='?';
		char caracter_inicial2='?';
		char caracter_comparacion1='?';
		char caracter_comparacion2='?';
		int contador_comparacion=0;
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Aquest programa calcula  el número de vegades que surten els dos primers caràcters consecutivament, fins que no s'entri un punt. ");
		System.out.println("Introdueixi una frase:");
	
		icaracter_actual = buffer.read();

		while(icaracter_actual!= 46) {
			caracter_actual=(char)icaracter_actual;

			while (contador<2){
				caracter_inicial1=caracter_inicial2;
				caracter_inicial2=caracter_actual;
				contador++;
				icaracter_actual = buffer.read();
				caracter_actual=(char)icaracter_actual;
			}
			
			if(caracter_actual!='.'){
				caracter_comparacion1=caracter_comparacion2;
				caracter_comparacion2=caracter_actual;
				if ((caracter_inicial1==caracter_comparacion1)&&(caracter_inicial2==caracter_actual)){
					contador_comparacion++;	
				}
			
			icaracter_actual = buffer.read();
			}
		}		
		System.out.println("Els dos primers caràcters apareixen " + contador_comparacion + " vegades mes repetit");
		
	}
}



	





