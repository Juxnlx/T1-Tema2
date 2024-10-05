package boletinifelse;

import java.util.Scanner;

/**
 * Este programa le pide a dos jugadores: Pidra, Papel o Tijera y el programa
 * mostrará el ganador y si hay empate o no.
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos la variable jugador1 como String para almacenar la opción introducido
		// por el jugador 1.
		String jugador1 = "";

		// Creamos la variable jugador2 como String para almacenar la opción introducido
		// por el jugador 2.
		String jugador2 = "";

		// Creamos el Scanner para leer por teclado las opciones seleccionadas por los
		// jugadores.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador 1 que introduzca la opción seleccionada y la leemos.
		System.out.print("Jugador 1 elige: PIEDRA, PAPEL TIJERA --> ");
		jugador1 = sc.nextLine();

		// Le pedimos al jugador 2 que introduzca la opción seleccionada y la leemos.
		System.out.print("Jugador 2 elige: PIEDRA, PAPEL TIJERA --> ");
		jugador2 = sc.nextLine();

		// Comprobamos mediante if y else-if cuando el jugador 1 gana con las 2
		// posibilidades que puede hacer. Y luego hacemos lo mismo con el jugador 2.
		// También comprobamos con el else si hay empate, es decir, si los dos jugadores
		// han elegido la misma opción.
		if (jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("tijera")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 1.");

		} else if (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("piedra")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 1.");

		} else if (jugador1.equalsIgnoreCase("tijera") && jugador2.equalsIgnoreCase("papel")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 1.");

		} else if (jugador2.equalsIgnoreCase("piedra") && jugador1.equalsIgnoreCase("tijera")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 2.");

		} else if (jugador2.equalsIgnoreCase("papel") && jugador1.equalsIgnoreCase("piedra")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 2.");

		} else if (jugador2.equalsIgnoreCase("tijera") && jugador1.equalsIgnoreCase("papel")) {
			System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 2.");

		} else {
			System.out.println("¡EMPATE! --> Jugador 1: " + jugador1 + " y Jugador 2: " + jugador2);
		}

		// Cierre de Scanner
		sc.close();
	}

}
