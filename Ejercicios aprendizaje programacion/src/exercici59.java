/**Ídem anterior però ara heu de calcular el % de lletres A amb relació als caràcters dels espais en blanc ‘ ‘ (caldrà
saber el número de A i d'espais en blanc) . Si s’entran 10 ‘ ‘ i 5 ‘A’ hi ha un 50% de A respecte als ‘ ‘.
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class exercici59 {
	public static void main(String[] args) throws IOException {
		
		int numero_caracter;
		int contador_espacios=0;
		int contador_a=0;
		float porcentaje;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aquest programa calcula el % d'A's que conte una frase, respecte al numero d¡espais en blanc, fins que no s'entri un intro. ");
		System.out.println("Introdueixi una frase:");

		numero_caracter = buffer.read();
		if (numero_caracter==97 || numero_caracter==65){
        	contador_a++;
        }
		if (numero_caracter==127){
        	contador_espacios++;
        }
		while(numero_caracter != 13) {
            numero_caracter = buffer.read();    
            if (numero_caracter==97 || numero_caracter==65){
            	contador_a++;
            }
            if (numero_caracter==32){
            	contador_espacios++;
            }
		}
		if(contador_espacios!=0){
			porcentaje=(contador_a*100)/contador_espacios;   
			System.out.println("La frase contenia un " +  porcentaje + "% de A's respecto espacios en blanco") ;
		}else{
			System.out.println("Nose han introducido espacios") ;	
		}
		
	}
}


