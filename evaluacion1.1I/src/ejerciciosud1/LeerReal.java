package ejerciciosud1;
import java.util.Scanner;
public class LeerReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un caracter");
		char letra = teclado.next().charAt(0) ;
		
		System.out.println("El valor de tu variable es: " + letra);
		teclado.close();
		
		

	}

}
