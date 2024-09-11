package ud1;
import java.util.Scanner;
public class Ej2Int {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		
		System.out.println("Introduzca un numero :");
		numero = teclado.nextInt();

		if (numero < 0) {
			numero = -numero;
			System.out.println(+numero);
		}
		if(numero > 0){
			System.out.println(+numero);
		}
	
	teclado.close();	
	}

}
