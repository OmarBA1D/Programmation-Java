package ud1;
import java.util.Scanner;
public class Ej4Char {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra = 'f';
				
		System.out.println("Introduzca una letra :");
		letra = teclado.next().charAt(0);
		
	
		System.out.println(letra);
	teclado.close();	
	}

}
