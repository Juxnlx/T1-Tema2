package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa solicita al usario un número y dibuja un triangulo con base y
 * altura de las mismas dimensiones que el valor de dicho número.
 */

//PRUEBAS
//ENTRADA: 1 || RESULTADO ESPERADO: "El número es menor que dos" || RESULTADO OBTENIDO: "El número es menor que dos"
//ENTRADA: 4 || RESULTADO ESPERADO: * || RESULTADO OBTENIDO: *
//								   * *                      * *
//								  * * *                    * * * 
//								 * * * *                  * * * *
//ENTRADA: "abcd" || RESULTADO ESPERADO: "El valor introducido es erroneo" || RESULTADO OBTENIDO: "El valor introducido es erroneo"
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el valor de ancho y alto del
		// triangulo.
		int num = 0;

		// Creamos la variable exception como boolean para almacenar true o false,
		// dependiendo de si el valor de entrada es verdadero o falso.
		boolean exception = false;

		// Creamos el Scanner para leer el número introducido por el usuario por
		// teclado.
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
				assert (num >= 2) : "El número es menor que dos";

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

		// Creamos este for para contabilizar el número de filas e interaciones del
		// triangulo.
		for (int i = 1; i <= num; i++) {

			// Con este for vemos cuantos son los espacios que hay que dejar para hacer un
			// triangulo equilatero. Inicializamos la j a i para que siempre empieze por
			// donde va la i en cada interacción y comprobamos que la j sea menor igual al
			// número e incrementamos la j y asi añadimos los espacios necesarios.
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}

			// Con este for creamos cuantos asteristicos debemos de colocar en cada
			// iteración. Incializamos la k en 1 porque en la primera linea siempre va a ser
			// un asterisco. Y comprobamos que k sea menor igual que i para que en la
			// primera vuelta un asterisco, en la segunda 2, etc.
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			// Salto de linea despues de cada linea/iteración.
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();

	}

}
