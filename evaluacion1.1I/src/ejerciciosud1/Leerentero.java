package ejerciciosud1;
import java.util.Scanner;
public class Leerentero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int numero = 0;
		 numero = teclado.nextInt();
		 
		 System.out.println("El valor de tu variable es: " +numero);
		 teclado.close();

	}

}
