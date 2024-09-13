package ejerciciosud1;
import java.util.Scanner;
public class LeerCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero= 0;
		System.out.println("Escribe un numero");
		numero = teclado.nextInt();
		
		System.out.println("El valor de la variable es: " +numero);
		
		teclado.close();

	}

}
