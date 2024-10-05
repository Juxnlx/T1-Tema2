package boletinifelse;

import java.util.Scanner;

/**
 * Este programa pide al usuario un número entre 0 y 10 y el programa muestra la
 * calificación de esa nota.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable nota como int para almacenar el valor introducido por el
		// usuario.
		int nota;

		// Creamos el scanner para leer la nota introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la nota por teclado y la leemos
		System.out.print("Introduce la nota --> ");
		nota = sc.nextInt();

		// Comprobamos mediante if y else-if si la nota introducida por el usuario esta
		// comprendida entre alguno de estos rangos o es igual a algun número, y
		// dependiendo del valor introducido el programa imprimirá el resultado de esa
		// nota. Si esa nota esta fuera del rando entre 0 y 10 nos imprimirá que el
		// resultado de la nota es incorrecto.
		if (nota >= 0 && nota < 5) {
			System.out.println("El resultado de examen es --> INSUFICIENTE");
		} else if (nota == 5) {
			System.out.println("El resultado del examen es --> SUFICIENTE");
		} else if (nota == 6) {
			System.out.println("El resultado del examen es --> BIEN");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("El resultado del examen es --> NOTABLE");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("El resultado del examen es --> SOBRESALIENTE");
		} else {
			System.out.println("La nota introducida es incorrecta");
		}

		// Cierre de scanner
		sc.close();
	}

}
