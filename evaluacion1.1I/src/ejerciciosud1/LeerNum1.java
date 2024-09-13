package ejerciciosud1;
import java.util.Scanner;
public class LeerNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		
		int Numero = teclado.nextInt();
		
		int resultado = Numero + 1;
		
		System.out.println("El valor de tu variable es " +resultado);
		
		teclado.close();

	}

}
