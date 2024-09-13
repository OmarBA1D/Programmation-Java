package ejercicios;

import java.util.Scanner;

public class LongitudCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double radio = 0;
		double circunferencia = 0;

		System.out.println("Introduzca el radio");
		radio = teclado.nextDouble();
		circunferencia = 2 * radio * Math.PI;

		System.out.printf("El valor de la circunferencia es: %.2f", circunferencia);
		teclado.close();

	}

}
