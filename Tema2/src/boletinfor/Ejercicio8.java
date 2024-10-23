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

		// Creamos el Scanner para leer A y B del usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor de A y lo leemos.
		System.out.print("Introduce el valor de A --> ");
		numA = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de B y lo leemos.
		System.out.print("Introduce el valor de B --> ");
		numB = sc.nextInt();

		// Comprobamos si A es menor que B, si es así, mediante un for mostramos los
		// números desde A haste B.
		if (numA < numB) {
			System.out.print("Números entre A y B : ");
			// La variable del for la inicializamos en el número menor en este caso A y
			// vamos imprimiendo los números hasta B y el incremento de 1 en 1.
			for (int i = numA; i <= numB; i++) {
				System.out.print(i + ", ");
			}

			// Comprobamos si B es menor que A, si es así, mediante un for mostramos los
			// números desde B haste A.
		} else if (numB < numA) {
			System.out.print("Números entre B y A : ");
			// La variable del for la inicializamos en el número menor en este caso B y
			// vamos imprimiendo los números hasta A y el incremento de 1 en 1.
			for (int i = numB; i <= numA; i++) {
				System.out.print(i + ", ");
			}

			// Si no se cumple ninguna de las condiciones anteriores, los números son
			// iguales.
		} else {
			System.out.println("Los números introducidos son iguales ");
		}

		// Cierre de Scanner
		sc.close();

	}

}
