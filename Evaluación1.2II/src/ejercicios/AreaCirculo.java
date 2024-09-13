package ejercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double radio = 0;
		double circulo = 0;

		System.out.println("Introduzca el radio");
		radio = teclado.nextDouble();
		circulo = (radio * radio) * Math.PI;

		System.out.printf("El valor del circulo es: %.2f", circulo);
		teclado.close();

	}

}