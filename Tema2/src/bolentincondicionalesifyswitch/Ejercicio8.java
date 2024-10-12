package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * El programa pide al usuario el número de mes y año, el programa comprueba si
 * es bisiesto o no y muestra el número de dias que tiene el mes.
 */

//PRUEBAS
//ENTRADA: 0 y 0  || RESULTADO ESPERADO: Los valores introducidos son incorrectos || RESULTADO OBTENIDO: Los valores introducidos son incorrectos
//ENTRADA: 0 y 2024  || RESULTADO ESPERADO: Los valores introducidos son incorrectos || RESULTADO OBTENIDO: Los valores introducidos son incorrectos
//ENTRADA: 12 y 0  || RESULTADO ESPERADO: Los valores introducidos son incorrectos || RESULTADO OBTENIDO: Los valores introducidos son incorrectos
//ENTRADA: 2 y 2024  || RESULTADO ESPERADO: 29 || RESULTADO OBTENIDO: 29
//ENTRADA: 2 y 2023  || RESULTADO ESPERADO: 28 || RESULTADO OBTENIDO: 28
//ENTRADA: 12 y 2024  || RESULTADO ESPERADO: 31 || RESULTADO OBTENIDO: 31

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable mes como int para introducir el mes del que queremos
		// saber los dias.
		int mes;

		// Creamos la variable year como int para introducir el año, para saber si es
		// bisiesto o no.
		int year;

		// Creamos la variable dias para almacenar el número de dias del mes.
		int dia;

		// Creamos el Scanner para leer el mes y el año introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el mes del que quiere saber el número de
		// dias y lo leemos.
		System.out.print("Introduce el número del mes --> ");
		mes = sc.nextInt();

		// Le pedimos al usuario que introduzca el año por teclado y lo leemos
		System.out.print("Introduce el año --> ");
		year = sc.nextInt();

		// Comprobamos si el mes es menor que 1 y mayor que 12 y el año es menor 1.
		if ((mes < 1 || mes > 12) || (year < 0)) {
			// Mostramos un mensaje de error.
			System.out.println("Los valores introducidos son incorrectos");
			// Si no
		} else {
			// Comprobamos cada mes con un switch y mostramos el número de dias.
			switch (mes) {
			case 1 -> dia = 31;
			case 2 -> {
				// En el caso de febrero comprobamos si el año es bisiesto, si es así devolvemos
				// 29, si no 28.
				if (year % 4 == 0) {
					dia = 29;
				} else {
					dia = 28;
				}
			}
			case 3 -> dia = 31;
			case 4 -> dia = 30;
			case 5 -> dia = 31;
			case 6 -> dia = 30;
			case 7 -> dia = 31;
			case 8 -> dia = 31;
			case 9 -> dia = 30;
			case 10 -> dia = 31;
			case 11 -> dia = 30;
			default -> dia = 31;
			}

			// Imprimmos el número de días del mes introducido.
			System.out.println("El mes introducido tiene " + dia + " dias");
		}

		// Cierre de Scanner
		sc.close();
	}

}
