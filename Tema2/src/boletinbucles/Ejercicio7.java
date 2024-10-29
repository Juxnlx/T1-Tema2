package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa nos solicita un número por teclado y nos devuelve una piramide
 * de dicha altura y nos imprime los números hasta el introducido y de forma
 * decreciente en la misma linea.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar la altura de la piramide.
		int num = 0;

		// Creamos la variable exception como boolean para almacenar true o false,
		// dependiendo de si el valor de entrada es verdadero o falso.
		boolean exception = false;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while para volver a preguntar el número hasta introducir
		// un valor correcto.
		do {
			
			// Creamos nuestro bloque try con las instrucciones sensibles a algun tipo de
			// excepción, en nuestro caso con el número de valor de entrada.
			try {
				// Le pedimos al usuario que introduzca un número por teclado y lo leemos.
				System.out.print("Introduce un número --> ");
				num = sc.nextInt();

				// Creamos el assert y en caso de que sea false nos devuelve el mensaje de que
				// el número es menor que dos y se va directamente a la exceptción especifica
				// que le haya saltado,
				assert (num > 0) : "El número es menor que 1";

				// Solo se ejecuta si el dato es correcto para salirnos del bucle.
				exception = false;

				// Este catch captura las excepciones si nosotros introducimos un valor númerico
				// menor que dos.
			} catch (AssertionError e) {
				// Imprimimos el mensaje del assert.
				System.out.println(e.getMessage());

				// Ponemos la exception a true para volver a preguntar el número.
				exception = true;

				// Este catch captura las excepciones si nosotros introducimos una cadena.
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido es erroneo");

				// Ponemos la exception a true para volver a preguntar el número.
				exception = true;

				// Creamos el bloque finally para que siempre se ejecute independientemente de
				// si salta una excepción o no.
			} finally {

				// Limpiamos el buffer.
				sc.nextLine();
			}

			// Comprobamos si la exception es false o true para volver a preguntar el número
			// o no
		} while (exception);

		// Este for hace que las número de filas sean las introducidas por el usuario.
		for (int i = 1; i <= num; i++) {
			// Este for comprueba que en cada fila se impriman los números necesarios desde
			// el 1 hasta el numero de vuelta por donde vamos.
			for (int j = 1; j <= i; j++) {
				// Imprimimos la j porque en la 3 fila se imprimiria en este for 1,2,3.
				System.out.print(j);
			}

			// Con este for hacemos que se haga un decremento en cada vuelta desde el ultimo
			// número de cada fila hasta el 1. Para ello decimos que la k vale i menos 1 y
			// comprobamos que la k sea menor o igual a 1 para que siempre nos imprima hasta
			// ahí y hacemos decremento.
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			// Salto de linea
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();
	}

}
