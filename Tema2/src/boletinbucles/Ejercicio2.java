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

		// Creamos la variable esPrimo como boolean para comprobar como true si el
		// número es positivo, false si es negativo.
		boolean esPrimo;

		// Creamos el Scanner para leer el número por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Comprobamos que si el número es igual a 1, si es así decimos que sea false
		// directamente.
		if (num == 1) {
			esPrimo = false;
			// Sino
		} else {
			// Con este for vamos contando en cada interacción un número desde el 1 hasta el
			// introducido por el usuario
			for (int i = 2; i <= num; i++) {
				// Antes de la comprobación siempre lo ponemos como true, porque luego vamos a
				// comprobar si no es primo entonces si no entra siempre va a ser true.
				esPrimo = true;
				// Este for nos va a recorrer desde el 2 hasta la raiz cuadrada del número por
				// donde va el primer for.
				for (int j = 2; j <= Math.sqrt(i); j++) {

					// Comprobammos si el modulo de 1 entre j es 0 para comprobar si no es primo, si
					// es así ponemos esPrimo a false.
					if (i % j == 0) {
						esPrimo = false;
					}
				}
				// Fuera del primer for comprbamos si es primo es true o false, si es true
				// contamos +1 en nuestro contador de primos.
				if (esPrimo) {
					numPrimos++;
				}
			}
		}

		// Imprimimos el número de primos que existen hasta el introducido por el
		// usuario.
		System.out.println("Los primos hasta " + num + " son: " + numPrimos);

		// Cierre de Scanner
		sc.close();
	}

}
