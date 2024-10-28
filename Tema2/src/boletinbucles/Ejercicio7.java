package boletinbucles;

import java.util.Scanner;

/**
 * Este programa nos solicita un número por teclado y nos devuelve una piramide
 * de dicha altura y nos imprime los números hasta el introducido y de forma
 * decreciente en la misma linea.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar la altura de la piramide.
		int num;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos por teclado
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Este for hace que las número de filas sean las introducidas por el usuario.
		for (int i = 1; i <= num; i++) {
			// Este for comprueba que en cada fila se impriman los números necesarios desde
			// el 1 hasta el numero de vuelta por donde vamos.
			for (int j = 1; j <= i; j++) {
				// Imprimimos la j porque en la 3 fila se imprimiria en este for 1,2,3.
				System.out.print(j);
			}

			// Con este for hacemos que se haga un decremento en cada vuelta desde el ultimo
			// número de cada fila hasta el 1. Para ello decimos que la k vale i menos 1 y
			// comprobamos que la k sea menor o igual a 1 para que siempre nos imprima hasta
			// ahí y hacemos decremento.
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			// Salto de linea
			System.out.println();
		}

		//Cierre de Scanner
		sc.close();
	}

}
