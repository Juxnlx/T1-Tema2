package ejexamenes;

import java.util.Scanner;

/**
 * Este programa nos solicita un número entero mayor o igual a 0 y el programa
 * nos devuelve cuantas de sus cifras son pares y cuantas son impares.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable finalCifra como int para almacenar la ultima cifra del
		// número.
		int finalCifra;

		// Creamos la variable contCifrasPar como int para almacenar cuantas cifras del
		// número introducido por el usuario son pares.
		int contCifrasPar = 0;

		// Creamos la variable contCifrasImpar como int para almcenar cuantas cifras del
		// número introducido por el usuario son impares.
		int contCifrasInpar = 0;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos.
		System.out.println("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos un bucle do-while para comprobar que el bucle en ciertas iteraciones
		// tenga tras una division entre 10 un cociente y resto 0.
		do {
			// En la variable finalCifra almacenamos la ultima cifra del número, esto lo
			// hacemos haciendo el modulo del número entre 10.
			finalCifra = num % 10;

			// Comprobamos si la ultima cifra es par o impar, si es así contabilizamos +1 en
			// nuestro contador de pares.
			if (finalCifra % 2 == 0) {
				contCifrasPar++;
				// Si no contabilizamos +1 en nuestro contador de impares.
			} else {
				contCifrasInpar++;
			}

			// Antes de la comprobación dividimos el número entre 10 para quedarnos con el
			// cociente, que es el número sin la ultima cifra.
			num /= 10;

			// Comprobamos si el modulo del número entre 10 es distinto de 0 o si el
			// conciente del numero entre 10 es distinto de 0, si es así es que el número
			// sigue teniendo cifras que contabilzar entonces vuelve a entrar en el bucle.
		} while ((num % 10 != 0) || (num / 10 != 0));

		// Imprimimos el número de cifras pares del número introducido por el usuario.
		System.out.println("Número de cifras pares: " + contCifrasPar);

		// Imprimimos el número de cifras impares del número introducido por el usuario.
		System.out.println("Número de cifras impares: " + contCifrasInpar);

		// Cierre de Scanner.
		sc.close();
	}

}
