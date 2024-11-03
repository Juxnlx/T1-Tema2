package ejexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa solicita al usuario una hora y unos minutos vistos tras un
 * espejo (al reves), y el programa muestra la hora correcta.
 */
public class ExamenHoras {

	public static void main(String[] args) {

		final int HORAS_EN_PUNTO = 12;

		final int MINUTOS_EN_PUNTO = 60;

		// Creamos la variable horas como int para almacenar las horas introducidas por
		// el usuario.
		int horas = 0;

		// Creamos al variable minutos como int para almacenar los minutos introducidos
		// por el usuario.
		int minutos = 0;

		// Creamos la variable horaReal como int para almacenar la hora real de la
		// reflejada introducida por el usuario.
		int horaReal;

		// Creamos la variable minutoReal como int para almacenar los minutos reales de
		// los reflejados introducidos por el usuario.
		int minutoReal;

		// Creamos la variable exception como boolean para indicar mediante true o false
		// si devemos volver a preguntar la hora y minutos o no.
		boolean excepcion = false;

		// Creamos la variable continuar como char para indicar con un caracter si
		// queremos seguir introduciendo horas reflejadas o no.
		char continuar;

		// Creamos la variable solucion como String para mostrar la hora de forma
		// bonita.
		String solucion = "";

		// Creamos el Scanner para leer las horas y los minutos por teclado.
		Scanner sc = new Scanner(System.in);

		do {
			// Con este bucle do-while comprobamos que si salta una excepción porque las
			// horas introducidas son erroneas vuelva a preguntar las horas al usuario.
			do {
				// Con el try-catch controlamos las excepciones que puedan saltar y mostramos
				// ciertos mensajes.
				try {
					// Le pedimos al usuario que introduzca las horas reflejadas y las leemos.
					System.out.println("Introduce las horas reflejadas --> ");
					horas = sc.nextInt();
					assert (horas > 0 && horas <= 12) : "Las horas introducidas son erroneas";
					excepcion = false;
				} catch (AssertionError e) {
					System.out.println(e.getMessage());
					excepcion = true;
				} catch (InputMismatchException e) {
					System.out.println("Las horas introducidas no son validas");
					excepcion = true;
				} finally {
					sc.nextLine();
				}
			} while (excepcion);

			// Con este bucle do-while comprobamos que so salta alguna excepción porque los
			// minutos introducidos no son validos que vuelva a preguntar los minutos al
			// usuario.
			do {
				// Con el try-catch controlamos las excepciones que se puedan lanzar y mostramos
				// diferentes mensajes.
				try {
					// Le pedimos al usuario que introduzca los minutos reflejados y los leemos.
					System.out.println("Introduce los minutos reflejados --> ");
					minutos = sc.nextInt();
					assert (minutos >= 0 && minutos <= 59) : "Los minutos introducidos son erroneos";
					excepcion = false;
				} catch (AssertionError e) {
					System.out.println(e.getMessage());
					excepcion = true;
				} catch (InputMismatchException e) {
					System.out.println("Los minutos introducidos no son validos");
					excepcion = true;
				} finally {
					sc.nextLine();
					solucion = "";
				}
			} while (excepcion);

			// Comprobamos si los minutos son distintos a 0 y a 30, si es así a los minutos
			// reales le asignamos los minutos en punto (60) menos los minutos introducidos
			// por el usuario y así sabemos los no reflejados.
			if (minutos != 0 && minutos != 30) {
				minutoReal = MINUTOS_EN_PUNTO - minutos;
				// Si no asignamos a la variable minutoReal los minutos introducidos por el
				// usuario porque en caso de ser 30 o 0 su contrario va a seguir siendo el mismo
				// porque pilla justo en el limite.
			} else {
				minutoReal = minutos;
			}

			// Comprobamos si las horas son distintas de 12 y de 6, si es así a las horas
			// reales le asignamos las horas en punto (12) menos las horas introducidas por
			// el usuario y así sabemos las horas no reflejadas.
			if (horas != 12 && horas != 6) {
				horaReal = HORAS_EN_PUNTO - horas;
				// Si no asignamos a la variable horaReal las horas introducidas por el usuario
				// porque en caso de ser 12 o 6 su contrario va a seguir siendo el mismo.
			} else {
				horaReal = horas;
			}

			// Comprobamos si los minutos definitivos son distintos de 0, si es así la hora
			// difinitiva siempre va a ser -1 porque hasta que no sean en punto no es la
			// nueva hora.
			if (minutoReal != 0) {
				horaReal -= 1;
			}

			// Hacemos un ternario y a nuestra solución le concatenamos un 0 delante si las
			// horas, minutos y segundos son menor 10, si no una cadena vacia luego las
			// horas y dos puntitos.
			solucion += (horaReal < 10 ? "0" : "") + horaReal + ":";
			solucion += (minutoReal < 10 ? "0" : "") + minutoReal;

			// Imprimimos la solucion que son las horas y los minutos no reflejados de forma
			// bonita.
			System.out.println("La hora correcta es --> " + solucion);

			// Le pedimos al usuario que introduzca una 'S' si desea continuar o 'N' si
			// desea finalizar el programa y leemos su respuesta.
			System.out.print("Si desea introducir otra hora introduzca 'S', en caso contrario 'N' --> ");
			continuar = sc.nextLine().charAt(0);

			// Comprobamos si la letra introducida es 'S' si es así volvemos al inicio del
			// programa.
		} while (continuar == 'S');

		// Imprimimos un mensaje de cierre del programa.
		System.out.println("SALIENDO...");
		
		//Cierre de Scanner
		sc.close();
	}

}
