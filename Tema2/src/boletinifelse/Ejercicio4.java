package boletinifelse;

import java.util.Scanner;

/**
 * Este programa nos devuelve los números ordenados de menor a mayor, pidiendole
 * al usuario dos números.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable num1 como double para almacenar el primer número
		// introducido por el usuario.
		double num1;

		// Creamos la variable num2 como double para almacenar el segundo número
		// introducido por el usuario.
		double num2;

		// Creamos el Scanner para pedir los números al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el primer número por teclado y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextDouble();

		// Le pedimos al usuario el segundo número por teclado y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextDouble();

		// Comprobamos si el num1 es mayor que num2 y los imprimimos en orden creciente.
		if (num1 > num2) {
			System.out.println(num2 + " < " + num1);
			// Comprobamos si el num1 es menor que num2 y los imprimos en orden creciente.
		} else if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
			// Si los números son iguales se imprime que los números no son iguales.
		} else {
			System.out.println("Los números son iguales");
		}

		// Cierre de Scanner
		sc.close();
	}

}
