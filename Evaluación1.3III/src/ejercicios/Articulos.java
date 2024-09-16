package ejercicios;
import java.util.Scanner;
public class Articulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int codigoArticulo = 0;
		int cantidad = 0;
		double precioUnitario = 0;
		double precioTotal = 0;
		
		System.out.println("Ingrese el codigo de articulo");
		codigoArticulo = teclado.nextInt();
		
		System.out.println("Ingrese la cantidad");
		cantidad = teclado.nextInt();
		
		System.out.println("Ingrese el precio unitario");
		precioUnitario = teclado.nextDouble();

		if(cantidad>100) {
			precioTotal = precioUnitario * cantidad * 0.6;
		}
		
		if(cantidad > 25 && cantidad <= 100) {
			precioTotal = precioUnitario * cantidad * 0.8;
		}
		
		if(cantidad > 10 && cantidad <= 25) {
			precioTotal = precioUnitario * cantidad * 0.9;

		}
		
		if(cantidad <= 10) {
			precioTotal = precioUnitario * cantidad * 1;

		}
		teclado.close();
		
		System.out.println("\n--- Detalles del Artículo ---");
        System.out.println("Código de Artículo: " + codigoArticulo);
        System.out.println("Cantidad Comprada: " + cantidad);
        System.out.println("Precio Unitario: $" + String.format("%.2f", precioUnitario));
        System.out.println("Precio Total: $" + String.format("%.2f", precioTotal));

		
		
		
		

	}

}
