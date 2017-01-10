
//Fer un programa per entrar (car�cter a car�cter) un text (no buit) acabat pel car�cter �/�. El car�cter �*�
//significa final de l�nia. Entre les diferents paraules podr� haver-hi m�s d� una espai en blanc o b� un asterisc. El
//programa haur� d� escriure el n�mero de l�nies, el n�mero de paraules i el de car�cters diferents de � �, �*�, �/�
//que hi ha en el text.
//Exemple: LA CASA ESTAVA* MOLT MACA* PER� AVUI JA*NO TANT */
//Car�cters 36 Paraules 10 L�nies 4

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