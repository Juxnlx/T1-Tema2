package boletinbucles;

import java.util.Scanner;

/**
 * Este programa genera un número aleatorio entre 0 y 20 y luego imprime los
 * número desde el 1 hasta el número tantas veces como la cantidad de cada
 * número que se va imprimiendo.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar un número entre 0 y 20.
		int num;

		// Creamos el Scanner para leer ese número por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while con la condición de que si un número es menor que 1
		// o mayor que 20, vuelva a preguntar de nuevo que introduzca un número.
		do {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número entre 0 - 20 --> ");
			num = sc.nextInt();
		} while (num < 1 || num > 20);

		// Con este for comprobamos que se impriman los números desde 1 hasta el
		// introducido por el usuario.
		for (int i = 1; i <= num; i++) {

			// Y con este for anidado comprobamos las veces que tenemos que imprimir dicho
			// número. Si la j que es las veces que se va a repetir un número es menor que
			// la i que es el número por el que se va. Imprime el número tantas veces como
			// sea el valor de dicho número (i).
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			// Salto de linea entre número y número para diferenciarlos a la perfección.
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();
	}

}
