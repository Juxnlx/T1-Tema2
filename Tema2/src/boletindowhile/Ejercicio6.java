package boletindowhile;

import java.util.Scanner;

/**
 * Este programa le pide a dos jugadores: Pidra, Papel o Tijera y el programa
 * mostrará el ganador y si hay empate o no.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la constante PIEDRA como string para almacenar el valor de Piedra.
		final String PIEDRA = "Piedra";

		// Creamos la constante PAPLE como string para almacenar el valor de Papel.
		final String PAPEL = "Papel";

		// Creamos la constante Tijera como string para almacenar el valor de Tijera.
		final String TIJERA = "Tijera";

		// Creamos la variable jugador1 como String para almacenar la opción introducida
		// por el jugador 1.
		String jugador1 = "";

		// Creamos la variable jugador2 como String para almacenar la opción introducida
		// por el jugador 2.
		String jugador2 = "";

		// Creamos la variable continuar como char para almacenar el caracter deseado
		// para seguir o no con la partida.
		char continuar;

		// Creamos el Scanner para leer por teclado las opciones seleccionadas por los
		// jugadores.
		Scanner sc = new Scanner(System.in);
		
		//Creamos un buble do-while para para iniciar una nueva partida si el jugador lo deseea.
		do {
			
			// Creamos un bucle do-while para comprobar si la opción introducida por el
			// jugador 1 es valida.
			do {
				// Le pedimos al jugador 1 que introduzca la opción seleccionada y la leemos.
				System.out.print("Jugador 1 elige: PIEDRA, PAPEL TIJERA --> ");
				jugador1 = sc.next();

				// Comprobamos si la opción introducida por el jugador 1 es distinta a papel,
				// piedra y tijera, si es así debe de volver a preguntar hasta introducir una
				// opción valida.
			} while (!jugador1.equalsIgnoreCase("papel") && !jugador1.equalsIgnoreCase("piedra")
					&& !jugador1.equalsIgnoreCase("tijera"));

			// Creamos un bucle do-while para comprobar si la opción introducida por el
			// jugador 2 es valida.
			do {
				// Le pedimos al jugador 2 que introduzca la opción seleccionada y la leemos.
				System.out.print("Jugador 2 elige: PIEDRA, PAPEL TIJERA --> ");
				jugador2 = sc.next();
				// Comprobamos si la opción introducida por el jugador 2 es distinta a papel,
				// piedra y tijera, si es así debe de volver a preguntar hasta introducir una
				// opción valida.
			} while (!jugador2.equalsIgnoreCase("papel") && !jugador2.equalsIgnoreCase("piedra")
					&& !jugador2.equalsIgnoreCase("tijera"));

			// Comprobamos mediante if y else-if cuando el jugador 1 gana con las 2
			// posibilidades que puede hacer. Y luego hacemos lo mismo con el jugador 2.
			// También comprobamos con el else si hay empate, es decir, si los dos jugadores
			// han elegido la misma opción.
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("¡EMPATE! --> Jugador 1: " + jugador1 + " y Jugador 2: " + jugador2);

			} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERA)
					|| jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)
					|| jugador1.equalsIgnoreCase(TIJERA) && jugador2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Jugador 1: " + jugador1 + " - Jugador 2: " + jugador2 + " --> Ganador jugador 1.");

			} else {
				System.out.println("Jugador 2: " + jugador2 + " - Jugador 1: " + jugador1 + " --> Ganador jugador 2.");
			}

			// Le preguntamos al usuario si deseea seguir jugando y leemos su respuesta
			System.out.println();
			System.out.print("¿Quiere seguir jugando? Pulsa 'S' si así lo desea --> ");
			continuar = sc.next().charAt(0);

		} while (continuar == 'S');

		// Imprimimos fin del juego
		System.out.println("El juego a finalizado");

		// Cierre de Scanner
		sc.close();
	}

}
