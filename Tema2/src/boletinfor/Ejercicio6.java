package boletinfor;

import java.util.Scanner;

/**
 * Este programa solicita al usuario 5 notas de alumnos y el programa dice al
 * final si hay un suspenso.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable nota como double para almacenar las 5 notas introducidas
		// por el usuario de los alumnos.
		double nota;

		// Creamos la variable contSuspensos como int para contabilizar el número de
		// suspensos
		// que hay.
		int contSuspensos = 0;

		// Creamos el Scanner para leer las notas de los alumnos por teclado.
		Scanner sc = new Scanner(System.in);

		// Este bucle for lo incializamos en 1 y comprobamos que la i sea menor igual
		// que 5, para que así solo de 5 vueltas y en esas 5 vueltas preguntaremos las 5
		// notas.
		for (int i = 1; i <= 5; i++) {

			// Le pedimos al usuario que introduza una nota y la leemos por teclado.
			System.out.println("Introduce la nota " + i + ": ");
			nota = sc.nextInt();

			// Comprobamos si la nota introducida por el usuario es en menor que 5, si es
			// así incrementamos nuestra cantidad de suspensos.
			if (nota < 5) {
				contSuspensos++;
			}

		}

		// Comprobamos si contSuspensos en mayor de 0, si es así es que hay mas de un
		// suspenso. Y mostramos el número de suspensos.
		if (contSuspensos > 0) {
			System.out.println("Sí, hay " + contSuspensos + " suspensos.");
			// Si no, felicitamos al usuario porque no hay ninguna nota suspensa.
		} else {
			System.out.println("¡FELICIDADES! No hay ninguna nota suspensa.");
		}

		// Cierre de Scanner
		sc.close();
	}

}
