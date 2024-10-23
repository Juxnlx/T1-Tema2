package boletinfor;

import java.util.Scanner;

/**
 * Este programa solicita dos números A y B, si A es menor que B, muestra los
 * números desde A hasta B, si no al contrario.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable A como int para almacenar el primer número introducido
		// por el usuario.
		int numA;

		// Creamos la variable B como int para almacenar el segundo número introducido
		// por el usuario.
		int numB;

		// Creamos la variable principio como int para almacenar el número menor.
		int principio;

		// Creamos la variable principio como int para almacenar el número menor.
		int fin;

		// Creamos el Scanner para leer A y B del usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor de A y lo leemos.
		System.out.print("Introduce el valor de A --> ");
		numA = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de B y lo leemos.
		System.out.print("Introduce el valor de B --> ");
		numB = sc.nextInt();

		// Comprobamos si A es menor que B, si es así le asignamos a principio nuestro
		// número A, y a fin el número B-
		if (numA < numB) {
			principio = numA;
			fin = numB;
			// Si no asignamos a principio y a fin lo contrario a lo anterior.
		} else {
			principio = numB;
			fin = numA;
		}

		// Imprimimos un mensaje de lo que vamos a mostrar a continuación.
		System.out.print("Números entre " + principio + " y " + fin + ": ");
		// La variable del for la inicializamos en el número menor que se encuentra
		// guardada en la variable principio y vamos imprimiendo los números hasta el
		// mayor que se encuentra en fin y el incremento de 1 en 1 y vamos imprimiendo.
		for (int i = principio; i <= fin; i++) {
			System.out.print(i + ", ");
		}

		// Cierre de Scanner
		sc.close();

	}

}
