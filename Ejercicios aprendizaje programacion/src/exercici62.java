/*Igual que l’exercici 60 però ara compteu el número de mots/paraules ‘LA’ (penseu que es considera que acaba
una paraula quan darrera hi ha un espai o signe de puntuació). Només cal controlar els següents signes de
puntació (. , ; )
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici62 {
	public static void main(String[] args) throws IOException {
		
		int icaracter_actual;
		char caracter_actual;
		char caracter1='0';
		char caracter2='0';
		char caracter3=' ';		//Lo inicio con un espacio en blanco, para que si la frase empieza con La, lo cuente.
		int contador=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero d'LA's que conte una frase, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		icaracter_actual = buffer.read();
		while(icaracter_actual!= 13) {			
			caracter_actual=(char)icaracter_actual;
			if ((caracter_actual==' ') || (caracter_actual=='.') || (caracter_actual==',') || (caracter_actual==';')){
				if(caracter3=='a'){
					if(caracter2=='l'){
						if((caracter1==' ')||(caracter1=='.')||(caracter1==',')||(caracter1==';')){
							contador++;
						}
					}					
				}	
			}
			caracter1=caracter2;
			caracter2=caracter3;
			caracter3=caracter_actual;
			icaracter_actual = buffer.read();
		}
		
		caracter_actual=' ';			//Esto es para que si la frase acaba en La, lo cuente. Cambio el intro por un espacio y compruebo que cumpla.
		if ((caracter_actual==' ') || (caracter_actual=='.') || (caracter_actual==',') || (caracter_actual==';')){
			if(caracter3=='a'){
				if(caracter2=='l'){
					if((caracter1==' ')||(caracter1=='.')||(caracter1==',')||(caracter1==';')){
						contador++;
					}
				}					
			}	
		}
			
		System.out.println("La frase contenia: " + contador + " LA's");	
	}
}


