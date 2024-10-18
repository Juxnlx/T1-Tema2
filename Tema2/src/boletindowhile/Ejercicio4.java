package boletindowhile;

import java.util.Scanner;

/**
 * Este programa pide un número al usuario y el programa debe de mostrar la
 * tabla multiplicar de ese número.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar el número del que queremos
		// mostrar la tabla.
		int num;

		// Creamos la variable num como int para ir almacenando el número del 1 al 10 y
		// ir multiplicando con el número introducido por el usuario.
		int contador = 1;

		// Creamsos el Scanner para pedir el número al usuario
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número del que se deseea saber su
		// tabla.
		System.out.println("Introduce un number --> ");
		num = sc.nextInt();
		System.out.println();
		System.out.println("La tabla del " + num + " es: ");

		do {
			// Imprimimos el resultado de la tabla.
			System.out.println(contador + " x " + num + " = " + contador * num);

			// Vamos incrementando el contador en cada vuelta hasta 10.
			contador++;

			// Comprobamos que el contador sea menor igual a 10.
		} while (contador <= 10);

		//Cierre de Scanner 
		sc.close();

	}

}
