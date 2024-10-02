package ejercicios;

import java.util.Scanner;

public class ArraySumaPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int [30];
		int numero = 1;
		int suma = 0;
		int contador = 0;
		
		while (numero >= 0){
			System.out.println("Introduzca un numero");
			numero = teclado.nextInt();
			if(numero >= 0) {
			numeros [contador] = numero;
			contador++;
			}
		
		}
		for(int j= 0; j<contador; j++) {
			suma = suma + numeros[j];
		}
		
		 // Verificar si la suma es un número primo
        if (esPrimo(suma)) {
            System.out.println("La suma de los números es " + suma + " y es primo.");
        } else {
            System.out.println("La suma de los números es " + suma + " y no es primo.");
        }

        teclado.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= numero / 2; i++) { // Recorre hasta la mitad del número
            if (numero % i == 0) {
                return false; // Si se encuentra un divisor, no es primo
            }
        }
        return true; // Si no se encuentran divisores, es primo
    }
}