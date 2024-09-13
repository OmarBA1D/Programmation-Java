package ejerciciosud1;
import java.util.Scanner;
public class LeerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String Nombre = "Omar";
		
		System.out.println("Introduzca una palabra");
		
		Nombre = teclado.next();
		
		System.out.println("El valor de la variable introducida es: " +Nombre);
		
		teclado.close();
		
		

	}

}
