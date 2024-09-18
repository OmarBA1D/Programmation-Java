package ejercicios;

import java.util.Scanner;

public class MenuIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double numeroUno = 0;
		double numeroDos = 0;
		double resultado = 0;
		double resto = 0;
		int opcion = 0;
		
		do {

			System.out.println("---MENU---");
			System.out.println("1- Sumar ");
			System.out.println("2- Restar ");
			System.out.println("3- Multiplicar ");
			System.out.println("4- Dividir ");
			System.out.println("5- Resto (%) ");
			System.out.println("6- Salir ");
			opcion = teclado.nextInt();
			
			if (opcion >= 1 && opcion <= 5) {
		
				System.out.println("Introduzca el primer numero");
				numeroUno = teclado.nextDouble();
		
				System.out.println("Introduzca el segundo numero");
				numeroDos = teclado.nextDouble();
		
			 }
			switch (opcion) {
			case 1:
				resultado = numeroUno + numeroDos;
				System.out.println("El resultado de tu operación es " + resultado);

				break;
	
			case 2:
				resultado = numeroUno - numeroDos;
				System.out.println("El resultado de tu operación es " + resultado);

				break;
	
			case 3:
				resultado = numeroUno * numeroDos;
				System.out.println("El resultado de tu operación es " + resultado);

				break;
	
			case 4:
				resultado = numeroUno / numeroDos;
				System.out.println("El resultado de tu operación es " + resultado);

				break;
	
			case 5:
				if (numeroDos != 0) {
	                resto = numeroUno % numeroDos;
	                System.out.println("El resto de la división es " + resto);
	            } else {
	                System.out.println("Error: División por cero no permitida.");
	            }
	            break;
			case 6:
				System.out.println("Saliendo");
				break;
			default:
	            System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 6.");
	            break;
			}
		}while (opcion != 6);

		
		
		
		
		teclado.close();
		
	}
}
