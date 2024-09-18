package ejercicios;

import java.util.Scanner;

public class MenuCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion = 1;

		while (opcion >= 1) {

			System.out.println("---Menu---");
			System.out.println("1. opcion 1");
			System.out.println("2. opcion 2");
			System.out.println("3. opcion 3");
			System.out.println("4. opcion 4");
			System.out.println("5. opcion 5");
			System.out.println("0. Salir");

			System.out.println("Elige una opcion");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("1. opcion 1");
				break;
			case 2:
				System.out.println("2. opcion 2");
				break;
			case 3:
				System.out.println("3. opcion 3");
				break;
			case 4:
				System.out.println("4. opcion 4");
				break;
			case 5:
				System.out.println("5. opcion 5");
				break;
			case 0:
				System.out.println("0. Salir");
				break;
			default:
				System.out.println("Error, Introduce un numero entre 1 y 5");
			}

		}
		teclado.close();

	}

}
