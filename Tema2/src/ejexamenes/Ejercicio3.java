package ejexamenes;

import java.util.Scanner;

/**
 * Este programa solicita un número al usuario y el programa le muestra por
 * consola un triangulo invertido de esa base y altura hueco por dentro.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable lado como int para alamcenar el lado y la altura (la
		// misma) del triangulo introducida por el usuario.
		int lado;

		// Creamos el Scanner para leer el lado del triangulo introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el lado del triangulo y lo leemos.
		System.out.print("Introduce el lado del triangulo --> ");
		lado = sc.nextInt();

		// Creamos este for para recorrer tantas lineas como tamaño del lado del
		// triangulo. Lo inicializamos al lado introducido por el usuario para
		// recorrerlo de forma decreciente para luego utilizarlo en los demas for.
		for (int i = lado; i >= 1; i--) {

			// Este for empieza en i y su función es imprimir los espacios necesarios antes
			// de empezar a imprimir los asteriscos.
			for (int j = i; j < lado; j++) {
				System.out.print(" ");
			}

			// Creamos este for para saber cuantos asteriscos pintar en cada linea. Para
			// ello inicializamos nuestra variable a la i que empieza en lado, y tiene que
			// ser menor o igual a 1, entonces recorre tantos espacios hasta llegar a 1.
			for (int k = i; k >= 1; k--) {

				// Comprobamos si la i es igual a lado o a 1 , si es así se imprimen todos los
				// asteriscos siempre.
				if (i == lado || i == 1) {
					System.out.print("* ");

					// Comprobamos si la k es igual a i o a 1, si es así imprimimos un acterisco,
					// osea solo al principio y al final de cada linea, pero sin contar la primera y
					// ultima linea.
				} else if (k == i || k == 1) {
					System.out.print("* ");

					// Si no imprimimos un espacio. Para dejar el respectivo hueco entre asterisco y
					// asterisco.
				} else {
					System.out.print("  ");
				}

			}

			// Salto de linea
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();

	}

}
