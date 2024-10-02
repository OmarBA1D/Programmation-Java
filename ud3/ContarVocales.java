package ud3;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		 int[] contadorVocales = new int[5];

		System.out.println("Introduzca una cadena");
		String cadena = teclado.nextLine().toLowerCase();
		
		for (int i=0; i<cadena.length();i++) {
		char caracter = cadena.charAt(i);
		
		switch(caracter) {
		case 'a':  contadorVocales[0]++;
        break;
		case 'e' :  contadorVocales[1]++;
        break;
		case 'i':  contadorVocales[2]++;
        break;
		case 'o':  contadorVocales[3]++;
        break;
		case 'u':  contadorVocales[4]++;
        break;
        default:
        	break;
		
		}
		}
		
		System.out.println("El numero de veces que se han introducido vocales es: ");
		System.out.println("A: " +contadorVocales[0]);
		System.out.println("E: " +contadorVocales[1]);
		System.out.println("I: " +contadorVocales[2]);
		System.out.println("O: " +contadorVocales[3]);
		System.out.println("U: " +contadorVocales[4]);
		
		  teclado.close();
		}

}	
