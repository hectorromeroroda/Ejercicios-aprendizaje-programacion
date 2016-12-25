/**
Feu un programa per calcular el màxim comú divisor (m.c.d.) de dos números M i N (enters i > 0 ) fent servir l’
algorisme d’ Euclides que diu:
Dividir M per N i guardar el residu R
Si R es 0, N es la resposta (és el m.c.d.) si no
fer M:=N, N:=R i a continuació anar el pas 1
 **/
import java.util.Scanner;

public class exercici52 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aquest programa calcula el  màxim comú divisor (m.c.d.)de dos numeros enters i >0, ingresats per l'usuari ");
		System.out.println("Introdueixi els dos valors:");
		
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		numero1=teclado.nextInt();
		teclado.nextLine();	
		while (teclado.hasNextInt()!=true){
			teclado.nextLine();	
		}
		numero2=teclado.nextInt();
		teclado.nextLine();	
		teclado.close();
		
		if ( numero1<=0 || numero2<=0){
			System.out.println("Els valors han de ser pusitius!");
		}else{
			resultado=numero1%numero2;
			while (resultado!=0){
				numero1=numero2;
				numero2=resultado;
				resultado=numero1 % numero2;
				}
			System.out.println("El mcd és " + numero2);
			}
	}
}







