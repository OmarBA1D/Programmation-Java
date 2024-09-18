package ejercicios;

import java.util.Scanner;

public class MenuMeses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String mes = "Enero";

		System.out.println("Escribe un mes");
		mes = teclado.next();
		
		switch(mes) {
		case "Enero": System.out.println("Mes numero 1");
		break;
		case "Febrero": System.out.println("Mes numero 2");
		break;
		case "Marzo": System.out.println("Mes numero 3");
		break;
		case "Abril": System.out.println("Mes numero 4");
		break;
		case "Mayo": System.out.println("Mes numero 5");
		break;
		case "Junio": System.out.println("Mes numero 6");
		break;
		case "Julio": System.out.println("Mes numero 7");
		break;
		case "Agosto": System.out.println("Mes numero 8");
		break;
		case "Septiembre": System.out.println("Mes numero 9");
		break;
		case "Octubre": System.out.println("Mes numero 10");
		break;
		case "Noviembre": System.out.println("Mes numero 11");
		break;
		case "Deciembre": System.out.println("Mes numero 12");
		break;
		default: System.out.println("Error, escribe un mes valido");
		
		}
		teclado.close();

	}

}
