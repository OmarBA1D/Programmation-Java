package ud3;
import java.util.Scanner;

public class ArraySuma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = 0;
        filas = teclado.nextInt();       
        System.out.println("Introduce el número de columnas: ");
        int columnas = 0;
        columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int[] sumasFilas = new int[filas];

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
            sumasFilas[i] = suma; 
        }
        
        System.out.println("La suma de los elementos de cada fila es:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumasFilas[i]);
        }

        teclado.close();
    }
}