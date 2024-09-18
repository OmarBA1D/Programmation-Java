package ejercicios;

import java.util.Scanner;

public class UnidadesDecenasCentenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int unidades = 0;
		int decenas = 0;
		int centenas = 0;

		if (numero >= 0 && numero <= 999) {
			System.out.println("Escribe un numero entre 0 y 999: ");
			numero = teclado.nextInt();
		} else {
			System.out.println("El numero que has introducido es incorrecto, tu numero debe estar entre 0 y 999 ");
		}
		unidades = numero % 10;
		decenas = (numero / 10) % 10;
		centenas = (numero / 100) % 10;

		System.out.println("Unidades: " + unidades);
		System.out.println("Decenas: " + decenas);
		System.out.println("Centenas: " + centenas);
		
		teclado.close();

	}
}