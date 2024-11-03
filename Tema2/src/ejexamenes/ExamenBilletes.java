package ejexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa solicita una cantidad de dinero y el programa le devuelve
 * cuantos billetes necesitara para alcanzar dicha cantidad con el menor número
 * de billetes posibles.
 */
public class ExamenBilletes {

	public static void main(String[] args) {

		// Creamos las siguientes constantes para declarar el valor de cada billete.
		final int BILLETES500 = 500;
		final int BILLETES200 = 200;
		final int BILLETES100 = 100;
		final int BILLETES50 = 50;
		final int BILLETES20 = 20;
		final int BILLETES10 = 10;
		final int BILLETES5 = 5;

		// Creamos la variable cantUsuario como int para almacenar la cantidad
		// introducida por el usuario.
		int cantUsuario = 0;

		// Creamos la variable excepcion como boolean para controlar si el valor de
		// entrada es valido o no.
		boolean excepcion = false;

		// Creamos la variable continuar como char para controlar si el usuario quiere
		// salir o no.
		char continuar;

		// Creamos unas variables para almacenar las cantidades necesarias que se
		// necesitan de cada billete.
		int contBillete500 = 0;
		int contBillete200 = 0;
		int contBillete100 = 0;
		int contBillete50 = 0;
		int contBillete20 = 0;
		int contBillete10 = 0;
		int contBillete5 = 0;

		// Creamos el escaner para leer la cantidad introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		do {
			// Creamos un bucle do-while por si en caso de que el valor de entrada no es
			// valido se vuelva a pedir un número de nuevo.
			do {
				try {
					// Le pedimos al usuario que introduzca un número multiplo de 5 y lo leemos.
					System.out.println("Introduce una cantida (multiplo de 5) --> ");
					cantUsuario = sc.nextInt();

					// Con el assert comprobamos que el valor introducido es multiplo de 5, si no es
					// así, lanza el siguiente mensaje "El número introducido no es multiplo de 5"
					// como una excepción.
					assert (cantUsuario % 5 == 0) : "El número introducido no es multiplo de 5.";

					// Ponemos la excepción a falsa porque en el caso de que sea verdad que el valor
					// introducido es multiplo de 5 estonces se pondria la excepción a falsa y
					// saldria del bucle.
					excepcion = false;

					// Con esta excepción controlamos que el número introducido sea multiplo de 5,
					// si no lo es se ejecutaria esta excepción. Se imprimiría el mensaje del assert
					// y la excepción se podria a true para que el bucle volviera a preguntar otra
					// cantidad.
				} catch (AssertionError e) {
					System.out.println(e.getMessage());
					excepcion = true;

					// Con esta excepción controlamos que no se introduzca ningun valor erroneo como
					// podria ser una cadena, si se intruduce saltaria esta excepción mostrando este
					// mensaje "El valor introducido no es valido" y la excepción la igualariamos a
					// true para que vuelve a preguntar otra cantidad de nuevo.
				} catch (InputMismatchException e) {
					System.out.println("El valor introducido no es valido");
					excepcion = true;

					// El finally lo ponemos para que siempre nos limpie el buffer con el nextLine
					// dentro. Para que en caso de que nos vuelva a pedir un número lo haga
					// correctamente. Y ponemos todos los contadores a 0 para que en caso de que se
					// vuelva a pedir otro número para contabilizar los billetes se empieze de nuevo
					// y no se vayan almacenando de nuevo.
				} finally {
					sc.nextLine();
					contBillete500 = 0;
					contBillete200 = 0;
					contBillete100 = 0;
					contBillete50 = 0;
					contBillete20 = 0;
					contBillete10 = 0;
					contBillete5 = 0;
				}

				// Comprobamos si la excepción es true o false para ver si el valor introducido
				// es valido o no.
			} while (excepcion);

			// Creamos un bucle do-while para comprobar y repetir unas comprobaciones hasta
			// que la cantidad introducida por el usuario sea 0.
			do {
				// Con estas condiciones if-else comprobamos si la cantidad introducida por el
				// usuario es menor o igual a billete mas grande 500. Si la cantidad del usuario
				// es mayor entonces entra en el if a la cantidad del usuario se le resta 500
				// euros en este caso y se contabiliza 1 billete de 500. Ahora se volveria a
				// comprobar la cantidad en el while y se vuelve a repetir la secuencia de if
				// primero comprueba 500, si no es 200 y así consecutivamente.
				if (BILLETES500 <= cantUsuario) {
					cantUsuario -= BILLETES500;
					contBillete500++;
				} else if (BILLETES200 <= cantUsuario) {
					cantUsuario -= BILLETES200;
					contBillete200++;
				} else if (BILLETES100 <= cantUsuario) {
					cantUsuario -= BILLETES100;
					contBillete100++;
				} else if (BILLETES50 <= cantUsuario) {
					cantUsuario -= BILLETES50;
					contBillete50++;
				} else if (BILLETES20 <= cantUsuario) {
					cantUsuario -= BILLETES20;
					contBillete20++;
				} else if (BILLETES10 <= cantUsuario) {
					cantUsuario -= BILLETES10;
					contBillete10++;
				} else {
					cantUsuario -= BILLETES5;
					contBillete5++;
				}
				// Comprobamos si el la cantidad es distinta de 0, si es así volvemos a ejecutar
				// las comprobaciones de if hasta que la cantidad del usuario sea igual a 0.
			} while (cantUsuario != 0);

			// Imprimimos la cantidad de billetes que se utilizaran para dicha cantidad.
			System.out.println("BILLETES UTILIZADOS PARA DICHA CANTIDAD");
			System.out.println();
			System.out.println("Billetes de 500$ --> " + contBillete500);
			System.out.println("Billetes de 200$ --> " + contBillete200);
			System.out.println("Billetes de 100$ --> " + contBillete100);
			System.out.println("Billetes de 50$ --> " + contBillete50);
			System.out.println("Billetes de 20$ --> " + contBillete20);
			System.out.println("Billetes de 10$ --> " + contBillete10);
			System.out.println("Billetes de 5$ --> " + contBillete5);

			// Le preguntamos al usuario si quiere volver a introducir otra cantidad y
			// leemos su respuesta.
			System.out.print("Introduce 'S' si desea continuar, en caso contrario 'N' --> ");
			continuar = sc.nextLine().charAt(0);

			// Comprobamos si el usuario a introducido 'S' o 's' si así a sido se le volvera
			// a pedir que introduzca una cantidad nueva y le volveremos a mostrar los
			// billetes. Si introduce 'N' u otra letra nos salimos del programa.
		} while (continuar == 'S' || continuar == 's');

		// Mostramos un mensaje de salida.
		System.out.println("SALIENDO...");

		// Cierre de Scanner
		sc.close();

	}

}
