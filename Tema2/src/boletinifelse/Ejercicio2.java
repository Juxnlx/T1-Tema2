package boletinifelse;

import java.util.Scanner;

/**
 * Este programa le pide al usuario dos números y comprueba si son iguales o no.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para almacenar el primer número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos el Scanner para pedir los números al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el primer número por teclado y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario el segundo número por teclado y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num2 = sc.nextInt();

		// Comprobamos mediante una condición if si los dos número introducidos por el
		// usuario son iguales, si es asi imprimimos "son iguales".
		if (num1 == num2) {
			System.out.println(num1 + " y " + num2 + " --> ¡Son IGUALES!");
			// Si los números no son iguales entonces imprime que los números no son
			// iguales.
		} else {
			System.out.println(num1 + " y " + num2 + " --> ¡No son IGUALES!");
		}
		
		//Cierre de Scanner
		sc.close();
	}

}
