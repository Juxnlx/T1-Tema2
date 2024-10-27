package boletinbucles;

import java.util.Scanner;

/**
 * Este programa solicita al usario un número y dibuja un triangulo con base y
 * altura de las mismas dimensiones que el valor de dicho número.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el valor de ancho y alto del
		// triangulo.
		int num;

		// Creamos el Scanner para leer el número introducido por el usuario por
		// teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número por teclado y lo leemos.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos este for para contabilizar el número de filas e interaciones del
		// triangulo.
		for (int i = 1; i <= num; i++) {

			// Con este for vemos cuantos son los espacios que hay que dejar para hacer un
			// triangulo equilatero. Inicializamos la j a i para que siempre empieze por
			// donde va la i en cada interacción y comprobamos que la j sea menor igual al
			// número e incrementamos la j y asi añadimos los espacios necesarios.
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}

			// Con este for creamos cuantos asteristicos debemos de colocar en cada
			// iteración. Incializamos la k en 1 porque en la primera linea siempre va a ser
			// un asterisco. Y comprobamos que k sea menor igual que i para que en la
			// primera vuelta un asterisco, en la segunda 2, etc.
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			// Salto de linea despues de cada linea/iteración.
			System.out.println();
		}

		//Cierre de Scanner
		sc.close();

	}

}
