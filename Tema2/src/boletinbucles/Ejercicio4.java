package boletinbucles;

import java.util.Scanner;

/**
 * Este programa calcula el mínimo comun divisor solicitando al usuario dos
 * números por teclado. Y finalmente muestra el m.c.m de los dos números.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para almacenar el primer número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos la variable numMay como int para almacenar cual de los dos números
		// introducidos por el usuario en mayor.
		int numMay;

		// Creamos el Scanner para leer los dos números por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();

		// Comprobamos si el numero 1 es mayor o igual que el número 2, si es así el
		// número mayor es el número 1.
		if (num1 >= num2) {
			numMay = num1;

			// Si no el número menor es el 2.
		} else {
			numMay = num2;
		}

		// Con este for recorremos desde el 2 hasta el número mas alto de los dos
		// números introducidos por el usuario. Para que en cada iteración vayamos
		// comprobando 1 a una si el número de esa vuelta (la i del for), es divisible
		// entre el número 1 y el 2.
		for (int i = 2; i <= numMay; i++) {
			// Mediante este if comprobamos si el modulo del número 1 y 2 entre la i es 0,
			// si es así es que ese número es divisible y es el primero de todos. Para ello
			// ponemos el break para quedarnos con el primero porque lo mas seguro es que
			// tenga mas de uno en común. Al empezar en 2 el primer número que encontremos
			// divisible es ese el que buscamos.
			if ((num1 % i == 0) && (num2 % i == 0)) {
				// Imprimimos la i para mostrar cual es el m.c.m de num1 y num2.
				System.out.println("El m.c.m de " + num1 + " y " + num2 + " es: " + i);
				break;
			}
		}

		// Cierre de Scanner
		sc.close();

	}

}
