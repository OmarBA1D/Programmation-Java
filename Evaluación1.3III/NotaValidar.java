package ejercicios;
import java.util.Scanner;
public class NotaValidar {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double nota = 0;
		System.out.println("Introduce una nota");
		nota = teclado.nextDouble();
	
		if(nota>=0 && nota<=10) {
			System.out.println("La nota es valida");
		} else {
			System.out.println("La nota no es valida");
		}
		teclado.close();
	}
	
}
