package ud3;
import java.util.Scanner;
public class Inicia2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int filas = 0;
		int columnas = 0;
		
		System.out.println("Introduce el numero de filas");
		filas = teclado.nextInt();
		
		System.out.println("Introduce el numero de columnas");
		columnas = teclado.nextInt();
		
		String [][] matriz = new String [filas][columnas];
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				matriz[i][j]= "#";
			}
			
		}
		for (int i = 0; i < filas ; i ++) {
			for (int j = 0 ; j < columnas;j++) {
				System.out.printf("%s", matriz[i][j]);
				if(j == columnas - 1) {
					System.out.println();
				}
			}
		}
		
		

		teclado.close();
	}

}
