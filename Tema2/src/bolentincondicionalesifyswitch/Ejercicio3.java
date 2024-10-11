package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * El programa nos pide los 8 números del dni y nos devuelve la letra del dni.
 */

//PRUEBAS
//ENTRADA: 9999999 || RESULTADO ESPERADO: El número introducido es incorrecto || RESULTADO OBTENIDO: El número introducido es incorrecto
//ENTRADA: 100000000 || RESULTADO ESPERADO: El número introducido es incorrecto || RESULTADO OBTENIDO: El número introducido es incorrecto
//ENTRADA: 10000000 || RESULTADO ESPERADO: 10000000Z || RESULTADO OBTENIDO: 10000000Z
//ENTRADA: 26597217 || RESULTADO ESPERADO: 26597217V || RESULTADO OBTENIDO: 26597217V
//ENTRADA: 99999999 || RESULTADO ESPERADO: 99999999R || RESULTADO OBTENIDO: 99999999R
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable numDni como int para alamcenar el número del DNI del
		// usuario introducido por el teclado.
		int numDni;

		// Creamos el Scanner para poder leer el número de DNI introducido por el
		// usuario
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el número de su dni y lo leemos.
		System.out.print("Intruduce el número de DNI --> ");
		numDni = sc.nextInt();

		// Comprobamos mediante un condicional if si el número introducido esta esta
		// fuera del rango entre 0 y 99999999.
		if (numDni < 10000000 || numDni > 99999999) {
			System.out.println("El número introducido es incorrecto");
		} else {

			// Creamos un swich para comprobar los distintos casos para ver que letra
			// asignar al DNI en este caso lo comprobaremos con el resto de la división de
			// el número de dni entre 23.
			switch (numDni % 23) {
			case 0 -> System.out.println("Tu DNI es:" + numDni + "T");
			case 1 -> System.out.println("Tu DNI es: " + numDni + "R");
			case 2 -> System.out.println("Tu DNI es: " + numDni + "W");
			case 3 -> System.out.println("Tu DNI es: " + numDni + "A");
			case 4 -> System.out.println("Tu DNI es: " + numDni + "G");
			case 5 -> System.out.println("Tu DNI es: " + numDni + "M");
			case 6 -> System.out.println("Tu DNI es: " + numDni + "Y");
			case 7 -> System.out.println("Tu DNI es: " + numDni + "F");
			case 8 -> System.out.println("Tu DNI es: " + numDni + "P");
			case 9 -> System.out.println("Tu DNI es: " + numDni + "D");
			case 10 -> System.out.println("Tu DNI es: " + numDni + "X");
			case 11 -> System.out.println("Tu DNI es: " + numDni + "B");
			case 12 -> System.out.println("Tu DNI es: " + numDni + "N");
			case 13 -> System.out.println("Tu DNI es: " + numDni + "J");
			case 14 -> System.out.println("Tu DNI es: " + numDni + "Z");
			case 15 -> System.out.println("Tu DNI es: " + numDni + "S");
			case 16 -> System.out.println("Tu DNI es: " + numDni + "Q");
			case 17 -> System.out.println("Tu DNI es: " + numDni + "V");
			case 18 -> System.out.println("Tu DNI es: " + numDni + "H");
			case 19 -> System.out.println("Tu DNI es: " + numDni + "L");
			case 20 -> System.out.println("Tu DNI es: " + numDni + "C");
			case 21 -> System.out.println("Tu DNI es: " + numDni + "K");
			default -> System.out.println("Tu DNI es: " + numDni + "E");
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
