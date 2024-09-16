package ejercicios;
import java.util.Scanner;
public class TablaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		double notas = 0;
		
		System.out.println("Introduce una nota");
		notas = teclado.nextDouble();
		
		if(notas>=0 && notas<3) {
			System.out.println("MD");
		}
		else {
			if(notas>=3 && notas<5) {
				System.out.println("INS");
			}
			else {
				if(notas>=6 && notas<7) {
					System.out.println("BIEN");
				}
				else {
					if(notas>=7 && notas<9) {
						System.out.println("NOT");
					}
					else {
						if(notas>=9 && notas<=10) {
							System.out.println("SOBRE");
						}
					}
				}
			}
		}
		teclado.close();

	}

}
