package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * Este programa le pide al usuario un número entre 0 y 9999 y el programa debe
 * de mostrar si el número introducido es capicúa o no.
 */

//PRUEBAS
// ENTRADA: -1 || RESULTADO ESPERADO: No valido || RESULTADO OBTENIDO: No valido
// ENTRADA: 10000 || RESULTADO ESPERADO: No valido || RESULTADO OBTENIDO: No valido
// ENTRADA: 0 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 9 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 10 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 54 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 99 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 100 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 537 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 545 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 999 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 1000 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 5445 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
// ENTRADA: 5454 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 5678 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
// ENTRADA: 9999 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable num para almacenar el número introducido por el usuario.
		int num;

		// Creamos el Scanner para leer por teclado el número introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número y lo leemos por teclado.
		System.out.print("Introduce un número entre 0 y 9999 -->");
		num = sc.nextInt();

		// Comprobamos si el número introducido por el usuario esta 0 y 9999.
		if (num < 0 || num > 9999) {
			System.out.println("EL número introducido no se encuentra en el rango entre 0 y 9999");
			// Si no continuamos con el obtivo del ejercicio, saber si el número es capicua
			// o no.
		} else {

			// Comprobamos si el número es de una cifra, si es así siempre es capicúa.
			if (num >= 0 && num <= 9) {
				System.out.println("¡Es capicúa!");

				// Comprobamos si el número tiene dos cifras
			} else if (num >= 10 && num <= 99) {
				// Comprobamos si el modulo del número y la divisón son iguales si es así el
				// número de dos cifras es capicúa.
				if ((num % 10) == (num / 10)) {
					System.out.println("¡Es capicúa!");
					// Si no, no es capicúa
				} else {
					System.out.println("¡No es capicúa!");
				}

				// Comprobamos si el número tiene tres cifras.
			} else if (num >= 100 && num <= 999) {
				// Comprobamos si el cociente del número entre 100 es igual al modulo del modulo
				// del número entre 100.
				if ((num / 100) == ((num % 100) % 10)) {
					System.out.println("¡Es capicúa!");
					// Si no, no es capicúa
				} else {
					System.out.println("¡No es capicúa!");
				}

				// Con este else se da por hecho que los números comprendidos van a estar entre
				// 1000 y 9999
			} else {
				// Comprobamos si el número entre 1000 es igual al cociente entre 100 del modulo
				// del número entre 100. O el número entre 1000 es igual al modulo entre 10 del
				// número modulo de 100.
				if ((num / 1000) == ((num % 100) / 100) || (num / 1000) == ((num % 100) % 10)) {
				System.out.println("¡Es capicúa!");
				
				// Si no, no es capicúa
				} else {
					System.out.println("¡No es capicúa!");
				}
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
