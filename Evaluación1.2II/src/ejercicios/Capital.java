package ejercicios;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double interes = 0;
		double cantidad = 0;
		double tipointeres = 0;
		double tipointeresuno = 0;
		int tiempo = 0;

		System.out.println("Cual es la cantidad de dinero");
		cantidad = teclado.nextDouble();

		System.out.println("Cual es el tipo de interes");
		tipointeres = teclado.nextDouble();
		tipointeresuno = tipointeres / 100;

		System.out.println("Cual es la duración del prestamo");
		tiempo = teclado.nextInt();

		interes = (cantidad * tipointeresuno * tiempo) / (360 / 100);
		System.out.println("Su interes es de " + interes);
		teclado.close();

	}

}
