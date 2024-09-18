package ejercicios;

import java.util.Scanner;

public class DecenasMillar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int unidades = 0;
		int decenas = 0;
		int centenas = 0;
		int unidadesDeMillar = 0;
		int decenasDeMillar = 0;

		if (numero >= 0 && numero <= 99999) {
			System.out.println("Escribe un numero entre 0 y 99999: ");
			numero = teclado.nextInt();
		} else {
			System.out.println("El numero que has introducido es incorrecto, tu numero debe estar entre 0 y 99999 ");
		}
		unidades = numero % 10;
		decenas = (numero / 10) % 10;
		centenas = (numero / 100) % 10;
		unidadesDeMillar = (numero / 1000) % 10;
		decenasDeMillar = (numero / 10000) % 10;

		System.out.println("Unidades: " + unidades);
		System.out.println("Decenas: " + decenas);
		System.out.println("Centenas: " + centenas);
		System.out.println("unidadesDeMillar: " + unidadesDeMillar);
		System.out.println("decenasDeMillar: " + decenasDeMillar);
		
		teclado.close();

	}
}