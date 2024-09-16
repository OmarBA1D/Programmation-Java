package ejercicios;

import java.util.Scanner;

public class SegundoIncrementar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		System.out.println("Introduce la hora ");
		horas = teclado.nextInt();

		System.out.println("Introduce los minutos ");
		minutos = teclado.nextInt();

		System.out.println("Introduce los segundos ");
		segundos = teclado.nextInt();
		
		segundos++;
		
		if(segundos == 60) {
			segundos = 0;
			minutos++;		
		}
		
		if(minutos == 60) {
			minutos = 0;
			horas++;
		}
		
		
		 System.out.printf("%02dh %02dm %02ds%n", horas, minutos, segundos);
		 teclado.close();

	}

}
