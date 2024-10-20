package boletinswitch;

import java.util.Scanner;

/**
 * Este programa pide al usuario dos veces el resultado de dos tiradas de dados
 * en cadena. Y muestra en valor núemrico la suam de esas dos tiradas.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable tirada1 como String para almacenar la primera tirada del
		// usario.
		String tirada1;

		// Creamos la variable tirada2 como String para almacenar la segunda tirada del
		// usario.
		String tirada2;

		// Creamos la varible solucion como int para almacenar la suma de las dos
		// tiradas.
		int solucion;

		// Creamos el Scanner para pedir el valor de cada tirada al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor de la primera tirada en
		// cadena.
		System.out.print("Resultado de la primera tirada --> ");
		tirada1 = sc.nextLine();

		// Le pedimos al usuario que introduzca el valor de la segunda tirada en
		// cadena.
		System.out.print("Resultado de la segunda tirada --> ");
		tirada2 = sc.nextLine();

		// A la solución le asignamos el valor devuelto de la tirada 1 dependiendo de la
		// tirada introducida por el usuario.
		solucion = switch (tirada1) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		// A la solución le concatenamos el valor devuelto de la tirada 2 dependiendo de
		// la tirada introducida por el usuario.
		solucion += switch (tirada2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		//Mostramos la solución de la suma de las tiradas.
		System.out.println("La solución de las tiradas es: " + solucion);

		// Cierre de Scanner
		sc.close();
	}

}
