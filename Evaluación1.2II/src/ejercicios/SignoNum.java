package ejercicios;

import java.util.Scanner;

public class SignoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int resultado = 0;
		System.out.println("Introduzca un numero");
		numero = teclado.nextInt();
		resultado = -numero;
		System.out.println("Tu resultado es: " + resultado);
		teclado.close();

	}

}
