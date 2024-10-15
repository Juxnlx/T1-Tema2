package boletinwhile;

import java.util.Scanner;

/**
 * Este programa solicita 10 números al usuario y luego nos muestra la suma de
 * los positivos, la media de los negativos y el número de ceros introducidos.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar los números introducidos por
		// el usuario,
		int num;

		// Creamos la variable cont como int para contabilizar cuantos números esta
		// introduciendo el usuario. Y declaramos nuestra variable a 1 porque nada mas
		// entrar en el bucle se le pide un número al usuario.
		int cont = 1;

		// Creamos la variable resultSuma como int para almacenar la suma de todos los
		// números positivos introducidos por el usuario.
		int resultSuma = 0;

		// Creamos la variable resultResta como int para almacenar la resta de todos
		// los números negativos introducidos por el usuario.
		int resultResta = 0;

		// Creamos una variable contResta como int para contabilizar el número de
		// números negativos introducidos por el usuario.
		int contResta = 0;

		// Creamos a variable contCeros como int para contabilizar el número de ceros
		// introducidos por el usuario.
		int contCeros = 0;

		// Creamos el Scanner para leer los diez números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos el while con la condición de que nuestro cont debe de ser menor o
		// igual a 10 para solo pedir al usuario 10 números.
		while (cont <= 10) {

			// Le pedimos al usuario que introduzca un número y lo leemos por teclado.
			System.out.println("Introduce un número --> ");
			num = sc.nextInt();

			// Incrementamos nuestro contador de números introducidos por el usuario en 1.
			cont++;

			// Comprobamos si el número es positivo, si es así, sumamos los números
			// positivos y los almacenamos en resultSuma.
			if (num > 0) {
				resultSuma += num;
				// Comprobamos si los números son menor que 0, si es así, los sumamos y
				// contabilizamos los números negativos introducidos para luego mostrar la
				// media.
			} else if (num < 0) {
				resultResta -= num;
				contResta++;
				// Y por ultimo este else controla las veces que se introduce 0 y lo contabiliza
				// y almacena ese núemro de veces en cantCeros.
			} else {
				contCeros++;
			}
		}

		// Imprimimos la suma de los números positivos, la media de los negativos y las
		// veces que hemos introducido ceros.
		System.out.println();
		System.out.println("Total suma números positivos --> " + resultSuma);
		System.out.println("Media de número negativos --> " + (float) resultResta/contResta);
		System.out.println("Número de ceros introducidos --> " + contCeros);

		//Cierre de Scanner
		sc.close();
	}

}
