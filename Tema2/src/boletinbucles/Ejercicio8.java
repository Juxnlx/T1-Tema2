package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa le ira solicitando números al usuario y si son mayores que el
 * anterior perfecto pero si es menor saltaraun error. Finalmente nos mostrará
 * el total de números introducidos y el número de fallos.
 */

//PRUEBAS
//ENTRADA: -1 || RESULTADO ESPERADO: "El número introducido es negativo" || RESULTADO OBTENIDO: "El número introducido es negativo"
//ENTRADA: "abcd" || RESULTADO ESPERADO: "Dime un número: " || RESULTADO OBTENIDO: "El valor introducido es erroneo"
//ENTRADA: 4, 9, 9, 10, 0 || RESULTADO ESPERADO: "Total de números introducidos: " 4 || RESULTADO OBTENIDO: "Total de números introducidos: " 4	
//												 "Números fallados: " 0									"Números fallados: " 0
//ENTRADA: 5, 9, 7, 10, 9, 0 || RESULTADO ESPERADO: "Total de números introducidos: " 5 || RESULTADO OBTENIDO: "Total de números introducidos: " 5
//												    "Números fallados: " 2                                     "Números fallados: " 2

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num = 0;

		// Creamos la variable numAnt como int para almacenar el número anterior
		// introducido por el usuario
		int numAnt = 0;

		// Creamos la variable numFallos como int para contabilizar el número de fallos.
		int numFallos = 0;

		// Creamos la variable numIntrod como int para contabilizar los números
		// introducidos.
		int numIntrod = 0;

		// Creamos la variable exception como boolean para almacenar true o false,
		// dependiendo de si el valor de entrada es verdadero o falso.
		boolean exception;

		// Creamos el Scanner para leer el número del usuario
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while para volver a preguntar el número hasta introducir
		// un valor correcto.
		do {

			// Creamos nuestro bloque try con las instrucciones sensibles a algun tipo de
			// excepción, en nuestro caso con el número de valor de entrada.
			try {
				// Le pedimos al usuario que introduzca un número por teclado y lo leemos.
				System.out.print("Dime un número inicial: ");
				num = sc.nextInt();

				// Creamos el assert y en caso de que sea false nos devuelve el mensaje de que
				// el número es negativo y se va directamente a la exceptción especifica
				// que le haya saltado. Salta cuando los números son menores que 0.
				assert (num >= 0) : "El número introducido es negativo";

				// Solo se ejecuta si el dato es correcto para salirnos del bucle.
				exception = false;

				// Este catch captura las excepciones si nosotros introducimos un valor númerico
				// menor que cero.
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

		// Creamos un bucle do-while para ejecutar siempre estas instrucciones hasta que
		// se introduzca un 0 por teclado.
		do {

			// Comprobamos si el número introducido es menor que el introducido
			// anteriormente, si es así imprimimos un mensaje de error y contabilizamos +1
			// en nuestro contador de error.
			if (num < numAnt) {
				System.out.println("Fallo es menor.");
				numFallos++;
			}

			// Siempre que se repita un bucle asignamos a nuestra variable numAnt el número
			// introducido por el usuario.
			numAnt = num;
			// Asignamos +1 en nuestro contador de números introducidos.
			numIntrod++;

			// Le pedimos al usuario que introduzca un nuevo número y lo leemos
			System.out.print("Dime un número: ");
			num = sc.nextInt();

			// Comprobamos si el número introducido es distinto de 0, si es así volvemos a
			// ejecutar el bloque de instrucciones.
		} while (num != 0);

		// Imprimimos el total de números introducidos, excluyendo al 0 e imprimimos el
		// número de fallos.
		System.out.println("Total de números introducidos: " + numIntrod);
		System.out.println("Números fallados: " + numFallos);

		// Cierre de Scanner
		sc.close();
	}

}
