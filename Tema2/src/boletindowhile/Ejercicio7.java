package boletindowhile;

import java.util.Scanner;

/**
 * El programa nos muestra un menú con varias opciones, nosotros seleccionamos 1
 * y el programa hace algo al respecto.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos la variable numero1 como int para almacenar el primer número
		// introducido por el usuario.
		int numero1;

		// Creamos la variable numero2 como int para almacenar el segundo número
		// introducido por el usuario.
		int numero2;

		// Creamos la variable opcion como char para almacenar la letra (opción
		// seleccionada) introducida por el usuario.
		char opcion;

		// Creamos la variable solución como float para almacenar el valor de la
		// solución de la ecuación seleccionada.
		float solucion;

		// Creamos el Scanner para pedir los números y la opción al usuario y leerlos.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while para seguir ejecutando el juego hasta que el
		// jugador seleccione la opción de salida.
		do {

			// Le pedimos al uasuario que introduzca el primer núemro y lo leemos.
			System.out.print("Introduce el primer número --> ");
			numero1 = sc.nextInt();

			// Le pedimos al uasuario que introduzca el segundo núemro y lo leemos.
			System.out.print("Introduce el segundo número --> ");
			numero2 = sc.nextInt();

			// Mostramos al usuario la baraja de opciones que puede elegir el usuario para
			// ver que quiere hacer con esos dos números.
			System.out.println();
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. SALIR");

			// Le pedimos al usuario que introduzca una de las opciones mostradas
			// anteriormente. Para quedarnos con el primer valor necesitamos hacer un charAt
			// de indice 0.
			System.out.println("Introduce una opción del menú anterior (A-D) --> ");
			opcion = sc.next().charAt(0);

			// A la variable solución le asignamos el swicht con los diferentes casos que
			// seria las opciones del menu, segun la opción seleccionada devuelve un valor u
			// otro. En caso de introducir una opción no valida se devuelve un -1.
			solucion = switch (opcion) {
			case 'A' -> {
				yield (numero1 + numero2);
			}
			case 'B' -> {
				yield (numero1 - numero2);
			}
			case 'C' -> {
				yield (numero1 * numero2);
			}
			case 'D' -> {
				// Comprobamos si el número es igual a 0 para evitar que se divida entre 0 ya
				// que no se puede. Entonces hago que devuelva -2 y luego controlamos ese valor
				// para que mustre un mensaje de error.
				if (numero2 == 0) {
					yield -2;
					// Si el número es distinto de 0 se hace la división normal y corriente.
				} else {
					yield (numero1 / numero2);
				}

			}
			// En el caso de introducir 'E' la solución devuelve 'E' y luego se
			// interpretaria en el if indicando la salida.
			case 'E' -> {
				yield 'E';
			}
			default -> {
				yield -1;
			}
			};

			// En caso de que la solución sea -1 se muestra un mensaje de opción incorrecta.
			if (solucion == -1) {
				System.out.println("Opción incorrecta");

				// En el caso de que la solución sea -2 mostramos el mensaje de que no se puede
				// dividir entre 0.
			} else if (solucion == -2) {
				System.out.println("No se puede dividir entre 0");

				// Si no se muestra la operación seleccionada por el usuario.
			} else if (solucion == 'E') {
				// Imprimimos la despedida
				System.out.println("Saliendo...");

			} else {
				System.out.println("La solución de la operación es --> " + solucion);
			}

			// Comprobamos si la solución es distinta a E si es así segiremos ejecutando el
			// juego, si no nos salimos.
		} while (solucion != 'E');

		System.out.println();
		// Cierre de Scanner
		sc.close();
	}

}
