package ejercicios;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double numero = 0;
		int parteentera = 0;
		double partefraccionaria = 0;
		
		System.out.println("Introduzca un numero");
		numero = teclado.nextDouble();
		parteentera = (int)(numero / 1);
		partefraccionaria = numero%1;
		
		System.out.println("La parte entera del numero es " +parteentera);
		System.out.println("La parte fraccionada del numero es " +partefraccionaria);
		teclado.close();
		
		
				
		
		

	}

}
