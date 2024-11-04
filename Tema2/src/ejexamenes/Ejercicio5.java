package ejexamenes;

import java.util.Scanner;

/**
 * Este programa solicita al usuario un tamaño y el programa imprime por consola
 * un tablero con 64 escapes blancos y negros y el tamaño del escape tiene de
 * tamaño lo introducido por el usuario.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos al variable tamEscape para almacenar el tamaño de los lados del
		// escape.
		int tamEscape;

		// Creamos el Scanner para leer el tamaño del escape introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el tamaño del escape y lo leemos.
		System.out.println("Introduce el tamaño del escape --> ");
		tamEscape = sc.nextInt();

		// Con este for recorremos las lineas que tenemos que imprimir siempre van a ser
		// 8.
		for (int i = 1; i <= 8; i++) {

			if (i % 2 != 0) {
				for (int h = 1; h <= tamEscape; h++) {
					System.out.print(" ");

				}
			}
			// Este for imprime los huecos que hay en cada linea.
			for (int j = 1; j <= 8; j++) {

				if (j % 2 == 0) {
					for (int k = 1; k <= tamEscape; k++) {
						System.out.print("#");
					
					}

					for (int h = 1; h <= tamEscape; h++) {
						System.out.print(" ");
					}

				}
			}
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();
	}

}
