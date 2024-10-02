package ud3;
import java.util.Scanner;
public class Contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		 String [] usuarios = new String [15];
		String [] contraseñas = new String [15];
		
		String usuario = " ";
		String contraseña = " ";
		
		String usuarioCorrecto = "Omar";
		String contraseñaCorrecta = "Dam20";
		int contador = 0;
		int intentos = 0;
	    boolean accesoPermitido = false;

		
		while (intentos < 3 && !accesoPermitido) {
			System.out.println("Introduce tu usuario");
			usuario = teclado.nextLine();
			
			System.out.println("Introduce tu contraseña");
			contraseña = teclado.nextLine();
			
			usuarios[contador] = usuario;
			contraseñas[contador] = contraseña;
			contador++;
			
			if (usuarioCorrecto.equals(usuario) && contraseñaCorrecta.equals(contraseña)) {
				System.out.println("Bienvenido " +usuarioCorrecto+ "!");
			}else {
				intentos++;
				System.out.println("Usuario o contraseña incorrectos" + (3-intentos));
			}
	
			}
		if(!accesoPermitido) {
			System.out.println("Has alcanzado el máximo de intentos");
	    }
		teclado.close();}
}