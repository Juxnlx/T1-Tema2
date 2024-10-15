package boletinwhile;

import java.util.Scanner;

/**
 * Este programa pedira números al usuario el programa debe de sumarlos y
 * finalmente mostrara la media de esos núemros. El programa termina cuando el
 * usuario introduce un número negativo.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable resultSuma como int para almacenar la suma de todos los
		// números positivos introducidos por el usuario.
		int resultSuma = 0;

		// Creamos la variable contador como int para almacenar la cantidad de veces
		// que hemos introducido números.
		int contador = 0;

		// Creamos el Scanner para pedir al usuario los números por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos nuestro while para sumar los número positivos introducidos por el
		// usuario y contabilazar las veces que se introduce un número.
		while (num >= 0) {

			// Con esta condición vamos sumando los números positivos introducidos y lo
			// almacenamos en resultSuma.
			resultSuma += num;

			// Cada vez que entremos en el bucle incrementamos 1 en nuestro contador. Eso
			// significa que se ha introducido un número positivo.
			contador++;

			// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();
		}

		// Mostramos el resultado de la media de todos los números introducidos.
		System.out.println("La media de estos números es: " + (float) resultSuma / contador);
		System.out.println(contador);

		// Cierre de Scanner
		sc.close();

	}

}
