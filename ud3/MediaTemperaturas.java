package ud3;
import java.util.Scanner;
public class MediaTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int [] temperaturas = new int [50];
		int temperatura = 0;
		int suma = 0;
		double media = 0;
		int contador = 0;
		
		while (temperatura != -999){
			System.out.println("Introduzca una temperatura");
			temperatura = teclado.nextInt();
			 temperaturas[contador] = temperatura;
			 if(temperatura != -999) {
				 temperaturas [contador] = temperatura;
					contador++;
					}
		}
			 for(int j= 0; j<contador; j++) {
					suma = suma + temperaturas[j];
				}
			media = suma / contador;
				
				System.out.println("La media es " +media);

			teclado.close();
		

	

}
}
