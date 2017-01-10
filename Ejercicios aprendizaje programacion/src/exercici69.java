
//Fer un programa per entrar (caràcter a caràcter) un text (no buit) acabat pel caràcter ‘/’. El caràcter ‘*’
//significa final de línia. Entre les diferents paraules podrà haver-hi més d’ una espai en blanc o bé un asterisc. El
//programa haurà d’ escriure el número de línies, el número de paraules i el de caràcters diferents de ‘ ‘, ‘*’, ‘/’
//que hi ha en el text.
//Exemple: LA CASA ESTAVA* MOLT MACA* PERÒ AVUI JA*NO TANT */
//Caràcters 36 Paraules 10 Línies 4

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici69 {
	public static void main(String[] args) throws IOException {
		
		int icaracter_actual;
		char caracter_actual=' ';
		char caracter_anterior=' ';
		int contador_linias=0;
		int contador_palabras=0;
		int contador_caracteres=0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el numero de linies, el numero de paraules i el numero de caracter diferent s a ' ', '*', '/'");
		System.out.println("Introdueixi una frase:");

		icaracter_actual = buffer.read();
		while(icaracter_actual != 47) {
			caracter_actual=(char)icaracter_actual;
			if ((caracter_actual==' ' || caracter_actual=='*')&& (caracter_anterior!=' ' && caracter_anterior!='*')){
				contador_palabras++;
			}
			
			if (caracter_actual=='*'){
				contador_linias++;
			}
			
			
			if (caracter_actual!='*' && caracter_actual!=' '){
				contador_caracteres++;
			}
					
			caracter_anterior=caracter_actual;
			icaracter_actual = buffer.read(); 
				
			if (icaracter_actual==47 && (caracter_anterior!=' ' && caracter_anterior!='*')){
				contador_palabras++;
			}
		}
		System.out.println("Contiene " + contador_caracteres +" caracteres diferentes a ' ', '*', '/' ");
		System.out.println("Contiene " + contador_palabras +" palabras diferentes");
		System.out.println("Contiene " + contador_linias +" linias diferentes");
		
	}
}