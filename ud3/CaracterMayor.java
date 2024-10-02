package ud3;
import java.util.Scanner;
public class CaracterMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in );
		

		System.out.println("Introduzca un string para saber su mayor caracter y su posición");
		String string = teclado.nextLine();
        char mayorCaracter = string.charAt(0);
        int p = 0;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > mayorCaracter) {
                mayorCaracter = string.charAt(i);
                p = i;
            }
        }
        
        System.out.println("El mayor carácter es: '" + mayorCaracter + "' en la posición " + p);
    
        
		teclado.close();

	}

}