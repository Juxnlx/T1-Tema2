package boletinfor;

import java.util.Scanner;

/**
 * Este programa solicita un número entero positivo y nos muestra si ese número
 * es primo o no.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable solucion como boolean, para almacenar true o false
		// dependiendo de si es primo o no, lo vamos a inicializar como true porque de
		// normal siempre va a ser primo.
		boolean solucion = true;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Con este bucle for controlamos las 10 prmeras interaciones impares.
		// Inicializamos nuestra variable en 2 porque debemos de empezar a comprobar en
		// 2 ya que si empazamos en 1 todos los números son divisibles entre 1, entonces
		// el programa no funciona.
		for (int i = 2; i < num; i++) {

			// Comprobamos si el número es par
			if (num % i == 0) {
				// Si es así devolvemos impar, que es igual a que no es primo, si no siempre
				// devolvera true que es como esta inicializado y sera primo.
				solucion = false;
				// Provocamos el cierre.
				break;
			}
		}

		// Comprobamos si se devuelve true, si es así es primo.
		if (solucion) {
			System.out.println("El " + num + " es primo ");
			// Si no, no es primo.
		} else {
			System.out.println("El " + num + " no es primo ");
		}

		// Cierre de Scanner
		sc.close();
	}

}
