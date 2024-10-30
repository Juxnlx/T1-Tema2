package ejexamenes;

import java.util.Scanner;

/**
 * Este programa solicita un número por teclado y nos imprime un cuadrado de
 * lado que es igual al introducido por teclado con el centro hueco.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Numero que nos introduce el usuario y es el lado del cuadrado.
		int lado;

		// Creamos el Scanner para leer el lado del cuadrado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el lado del cuadrado y lo leemos.
		System.out.println("Introduce el tamaño del lado del cuadrado --> ");
		lado = sc.nextInt();

		// Este for nos recorre tantas filas como el número de lado introducido por el
		// usuario.
		for (int i = 1; i <= lado; i++) {

			// Este for nos recorre fila a fila.
			for (int j = 1; j <= lado; j++) {

				// Comprobamos si la fila es igual a 1 o a lado. Si es así imprimimos un
				// asterisco.
				if (i == 1 || i == lado) {
					System.out.print("* ");

					// Comprobamos si la columna es igual a 1 o a lado. Si es así imprimimos un
					// asterisco.
				} else if (j == 1 || j == lado) {
					System.out.print("* ");
					// Si no, imprimimos un espacio en blanco.
				} else {
					System.out.print("  ");
				}
			}

			// Salto de linea.
			System.out.println();
		}

		sc.close();

	}

}
