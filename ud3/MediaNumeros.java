package ud3;
import java.util.Scanner;
public class MediaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int [30];
		int numero = 1;
		double suma = 0;
		double media = 0;
		int contador = 0;
		
		while (numero >= 0){
			System.out.println("Introduzca un numero");
			numero = teclado.nextInt();
			if(numero >= 0) {
			numeros [contador] = numero;
			contador++;
			}
		
		}
		for(int j= 0; j<contador; j++) {
			suma = suma + numeros[j];
		}
		media = suma / contador;
		
		System.out.println("La media es " +media);

	teclado.close();
	}

}
