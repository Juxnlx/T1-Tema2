package boletinwhile;

import java.util.Scanner;

/**
 * Este programa le pide al usuario números y va contanvilizando cuantas veces a
 * insertado un número y te devuelve la cantidad de números introducidos cuando
 * introduces un número negativo.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable contador como int para almacenar la cantidad de veces
		// que hemos introducido números.
		int contador = 0;

		// Creamos el Scanner para pedir al usuario los números a contar por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos nuestro while para contabilizar el número de veces que introducimos
		// un número.
		while (num >= 0) {

			// Cada vez que entremos en el bucle incrementamos 1 en nuestro contador. Eso
			// significa que se ha introducido un número positivo.
			contador++;

			// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();
		}

		// Mostramos el resultado de la cantidad de números introducidos.
		System.out.println("Números introducidos: " + contador);

		// Cierre de Scanner
		sc.close();

	}

}
