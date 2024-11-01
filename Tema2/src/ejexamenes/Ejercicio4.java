package ejexamenes;

import java.util.Scanner;

/**
 * Este programa solicita un número al usuario y el programma imprime por
 * consola un hexagono coyos lados miden el número introducido por el usuario.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable lado como int para almacenar el tamaño de los lados del
		// hexagono.
		int lado;

		// Creamos la variable copiaLado como int para almacenar el tamaño del lado
		// introducido por el usuario.
		int copiaLado;

		// Creamos el Scanner para leer el lado introducido por el usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el tamaño del lado del hexagono y lo
		// leemos.
		System.out.print("Introduce el tamaño del lado del hexagono --> ");
		lado = sc.nextInt();

		// Asignamos a la variable copiaLado el valor del lado del hexagono introducido
		// por el usuario.
		copiaLado = lado;

		// Este for recorre el bucle tantas veces como el tamaño del lado del hexagono.
		for (int i = 1; i <= lado; i++) {

			// Con este for imprimimos los espacios que hay que dibujar antes de imprimir
			// los asteriscos. Empieza cuando empieza la i y imprime tantos espacios hasta
			// llegar a un valor antes que el tamaño del lado.
			for (int j = i; j < lado; j++) {
				System.out.print(" ");
			}

			// Con este for imprimimos los espacios necesarios, empezamos en 1 y imprimimos
			// tantos espacios hasta llegar al tamaño del lado que esta almacenado en la
			// copia.
			for (int k = 1; k <= copiaLado; k++) {
				System.out.print("*");
			}

			// La copia del lado en cada vuelta la incrementamos en 2 para en cada iteración
			// imprimir dos asteriscos mas.
			copiaLado += 2;

			// Salto de linea despues de cada linea.
			System.out.println();
		}

		// Este for recorre las mismas iteraciones como el tamaño del lado introducido
		// menos 1. Hace una menos que el tamaño introducido porque la ultima ya la
		// imprime el primer for este for se encarga del decremento.
		for (int i = lado; 1 < i; i--) {
			copiaLado -= 2;

			// Este for lo igualamos a la i para que en cada iteración sea un espacio mas y
			// recorremos hasta un tamaño antes para que no imprima un asterisco de mas.
			for (int j = i; j <= lado; j++) {
				System.out.print(" ");
			}

			// Este for empieza en la copia del tamaño del lado -2 y recorremos hasta 1 para
			// imprimir tantos asteriscos. En cada iteración se resta dos mas así hasta
			// llegar al tamaño introducido por el usuario.
			for (int k = copiaLado - 2; k >= 1; k--) {
				System.out.print("*");
			}

			//Salto de linea, para empezar en una linea nueva.
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();

	}

}
