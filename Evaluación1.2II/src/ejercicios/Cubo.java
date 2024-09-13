package ejercicios;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int resultado = 0;

		System.out.println("Introduzca un numero");
		numero = teclado.nextInt();

		resultado = numero * numero * numero;
		System.out.println("El cubo de tu numero es " + resultado);
		teclado.close();

	}

}
