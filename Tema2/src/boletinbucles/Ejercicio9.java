package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa nos solicita un número por teclado mayor que 0 y el programa
 * nos muestra cuantas cifras tiene ese número.
 */

//PRUEBAS
//ENTRADA: 0 || RESULTADO ESPERADO: "El número introducido es negativo" || RESULTADO OBTENIDO: "El número introducido es negativo"
//ENTRADA: "abcd" || RESULTADO ESPERADO: "Dime un número: " || RESULTADO OBTENIDO: "El valor introducido es erroneo"
//ENTRADA: 1 || RESULTADO ESPERADO: Número de cifras de 1: 1 || RESULTADO OBTENIDO: Número de cifras de 1: 1
//ENTRADA: 348 || RESULTADO ESPERADO: Número de cifras de 348: 3 || RESULTADO OBTENIDO: Número de cifras de 348: 3
//ENTRADA: 48654 || RESULTADO ESPERADO: Número de cifras de 48654: 5 || RESULTADO OBTENIDO: Número de cifras de 48654: 5
//ENTRADA: 123456789 || RESULTADO ESPERADO: Número de cifras de 123456789: 9 || RESULTADO OBTENIDO: Número de cifras de 123456789: 9

public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario del que queremos saber su número de cifras
		int num = 0;

		// Creamos la variable contCifras como int para alamacenar las cifras del número
		// introducido por el usuario.
		int contCifras = 0;

		// Creamos la variable exception como boolean para almacenar true o false,
		// dependiendo de si el valor de entrada es verdadero o falso.
		boolean exception;

		// Creamos el Scanner para leer el número introducido por el usuario
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
				// el número es menor que uno y se va directamente a la exceptción especifica
				// que le haya saltado. Salta cuando los números son menores que 0.
				assert (num > 0) : "El número introducido es menor que 1";

				// Solo se ejecuta si el dato es correcto para salirnos del bucle.
				exception = false;

				// Este catch captura las excepciones si nosotros introducimos un valor númerico
				// menor que uno.
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

		// Comprobamos si el modulo del número entre la i es igual que el número, si es
		// así incrementamos el contCifras en 1 y en la siguiente interación vamos
		// multiplicando el número por 10 y asi vamos probando con 10, 100, 1000, etc.
		for (int i = 1; num % i != num; i *= 10) {
			contCifras++;
		}

		// Imprimimos el número de cifras del número introducido por el usuario.
		System.out.println("Número de cifras de " + num + ": " + contCifras);

		// Cierre de Scanner
		sc.close();
	}

}
