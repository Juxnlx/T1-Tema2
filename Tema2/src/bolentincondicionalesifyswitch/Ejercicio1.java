package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * Este programa le pide al usuario un número entre 0 y 9999 y el programa debe
 * de mostrar si el número introducido es capicúa o no.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		//Creamos la variable num para almacenar el número introducido por el usuario.
		int num;
		
		//Creamos el Scanner para leer por teclado el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca el número y lo leemos por teclado.
		System.out.print("Introduce un número entre 0 y 9999 -->");
		num = sc.nextInt();
		
		//Comprobamos si el número introducido por el usuario esta 0 y 9999.
		if (num<0 || num>9999) {
			System.out.println("");
		}
	}

}
