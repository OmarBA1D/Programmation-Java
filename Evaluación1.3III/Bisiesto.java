package ejercicios;
import java.util.Scanner;
public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int año = 0;
		
		System.out.println("Introduzca un año");
		año = teclado.nextInt();
		
		if(año % 4 == 0 && año % 100 == 0 || año % 400 == 0) {
			System.out.println(año + " es besiesto ");
		} else {
			System.out.println(año + " no es besiesto ");
		}
		teclado.close();
	}

}
