package boletinwhile;

import java.util.Scanner;

/**
 * Este programa pide nos pedira números positivos y los va sumando hasta que el
 * usuario introduzca un número negativo en ese momento muestra el resultado de
 * la suma.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable resultSuma como int para almacenar la suma de todos los
		// números positivos introducidos por el usuario.
		int resultSuma = 0;

		// Creamos el Scanner para pedir al usuario los números a sumar por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos nuestro while para sumar los número positivos introducidos por el
		// usuario.
		while (num > 0) {

			// Con esta condición vamos sumando los número positivos introducidos y lo
			// almacenamos en resultSuma.
			resultSuma += num;

			// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();
		}

		// Mostramos el resultado de la suma de todos los números introducidos
		System.out.println("La suma total es de: " + resultSuma);

		// Cierre de Scanner
		sc.close();
	}

}
