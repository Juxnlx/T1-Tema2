package boletinbucles;

import java.util.Scanner;

/**
 * Este programa solicita un número y nos muestra cuantos primos hay entre 1 y
 * el número introducido.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos una variable numPrimos como int para almacenar el número de primos
		// que hay entre 1 y el número introducido por el usuario.
		int numPrimos = 0;

		// Creamos el Scanner para leer el número por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
				numPrimos++;
				}
			}
		}

		System.out.println(numPrimos);
	}

}
