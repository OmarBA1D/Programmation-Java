package ud3;

import java.util.Scanner;

public class ArrayOpciones13 {
	
	private static void menu(){
		System.out.println("---MENU DE MANEJO DE ARRAYS---");
		System.out.println("1- Incializar el array");
		System.out.println("2- Ver el array");
		System.out.println("3- Insertar un elemento (en la posición que le corresponda)");
		System.out.println("4- Borrar un elemento (de su posición compactando el array)");
		System.out.println("6- Salir");

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		
		int[] array = new int[10];
		boolean Otmane = true;
		
		while(Otmane) {
			menu();
			int opcion = 0;
			opcion = teclado.nextInt();
			
			switch(opcion) {
			
			case 1: for(int i = 0; i < 10; i++) {
				array[i] = 0;
			}
			break;
			case 2: for(int i = 0; i < 10; i++) {
				System.out.println(array[i]);
			}
			break;
			case 3:  System.out.print("Elige una posición entre 0 y 9 para insertar");
			int n = teclado.nextInt();
			System.out.print("Elige un numero para insertar");
			int k = teclado.nextInt();
			array[n] = k;
			break;
			case 4: System.out.print("Elige una posición entre 0 y 9 para borrar");
			int o = teclado.nextInt();
			array[o] = 0;
			break;
			case 5 : Otmane = false;
			break;
			}
		
		}
		teclado.close();

	}

}
