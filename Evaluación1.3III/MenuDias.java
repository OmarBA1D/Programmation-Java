package ejercicios;
import java.util.Scanner;
public class MenuDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		char letra = 'g';
	
		System.out.println("Introduzca una letra");
		letra = teclado.next().charAt(0);
		
		switch(letra) {
		case 'L': System.out.println("Lunes");
		break;
		case 'M': System.out.println("Martes");
		break;
		case 'X': System.out.println("Miercoles");
		break;
		case 'J': System.out.println("Jueves");
		break;
		case 'V': System.out.println("Viernes");
		break;
		case 'S': System.out.println("Sabado");
		break;
		case 'D': System.out.println("Domingo");
		break;
		default: System.out.println("Error, introduzca una inicial de un día");
		}
		
		teclado.close();

	}

}
