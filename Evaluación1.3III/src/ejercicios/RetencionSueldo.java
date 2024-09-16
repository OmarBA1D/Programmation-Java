package ejercicios;
import java.util.Scanner;
public class RetencionSueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		double sueldo = 0;
		System.out.println("Introduce tu sueldo");
		sueldo = teclado.nextDouble();
		
		if(sueldo<1000.00) {
			System.out.println("La retencion sobre tu sueldo es " +sueldo*0.10);
		}
		else {
			if(sueldo>1000.00) {
				System.out.println("La retencion sobre tu sueldo es " +sueldo*0.16);
			}
			else {
				System.out.println("La retencion sobre tu sueldo es " +sueldo*0.12);
			}
			teclado.close();
		}

	}

}
