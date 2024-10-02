package ud3;

import java.util.Scanner;

public class SumaMatrices11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int filas = 0;
		int columnas = 0;

		System.out.println("Introduce el numero de filas");
		filas = teclado.nextInt();
		System.out.println("Introduce el numero de columnas");
		columnas = teclado.nextInt();

		int matriz1[][] = new int[filas][columnas];
		int matriz2[][] = new int[filas][columnas];
		int matrizSuma[][] = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca un numero por la primera matriz fila numero: "+(i+1) + " columna numero: "+(j+1));
				matriz1[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca un numero por la segunda matriz fila numero: "+(i+1) + "columna numero: "+(j+1));
				matriz2[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println(
						"El resultado de la fila nº " + (i + 1) + " columna nº " + j + " es : " + matrizSuma[i][j]);
			}
		}
		teclado.close();

	}

}
