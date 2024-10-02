package ud3;

import java.util.Scanner;

public class Traspuesta10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int filas = 0;
		int columnas = 0;

		System.out.println("Introduzca el numero de filas");
		filas = teclado.nextInt();
		System.out.println("Introduzca el numero de columnas");
		columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.println("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		int traspuesta [][] = new int [filas][columnas];
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				traspuesta [j][i] = matriz [i][j];
				
			}
		}
		System.out.println("Matriz traspuesta: ");
		for(int i = 0; i < columnas; i++) {
			for(int j = 0; j < filas; j++) {
				System.out.println(traspuesta[i][j] + "");
			}
			System.out.println();
		}
		teclado.close();

	}

}
