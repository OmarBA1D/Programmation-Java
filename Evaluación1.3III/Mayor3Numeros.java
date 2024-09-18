package ejercicios;
import java.util.Scanner;
public class Mayor3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double numero1 = 0;
		double numero2 = 0;
		double numero3 = 0;
		
		System.out.println("Escribe el primer numero");
		numero1 = teclado.nextDouble();
		System.out.println("Escribe el segundo numero");
		numero2 = teclado.nextDouble();
		System.out.println("Escribe el tercer numero");
		numero3 = teclado.nextDouble();
		
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println("El numero mayor es el numero " +numero3);
		} else {if(numero2>numero3) {
			System.out.println("El numero mayor es el numero " +numero2);	
		}
		else {if(numero1>numero3) {
			System.out.println("El numero mayor es el numero " +numero1);
		}else {
			System.out.println("Los numeros son iguales");
		}
			teclado.close();
		}
		}
		
		
		

	}

}
