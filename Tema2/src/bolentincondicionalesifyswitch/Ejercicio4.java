package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * El programa nos pide un número entre 1 y 99 y el programa nos debe de
 * devolver el número escrito.
 */

//PRUEBAS
//ENTRADA: 100 || RESULTADO ESPERADO: El número introducido esta fuera del rango (1-99) || RESULTADO OBTENIDO: El número introducido esta fuera del rango (1-99)
//ENTRADA: 0 || RESULTADO ESPERADO: El número introducido esta fuera del rango (1-99) || RESULTADO OBTENIDO: El número introducido esta fuera del rango (1-99)
//ENTRADA: 1 || RESULTADO ESPERADO: Uno || RESULTADO OBTENIDO: Uno
//ENTRADA: 9 || RESULTADO ESPERADO: Nueve || RESULTADO OBTENIDO: Nueve
//ENTRADA: 10 || RESULTADO ESPERADO: Diez || RESULTADO OBTENIDO: Diez
//ENTRADA: 29 || RESULTADO ESPERADO: Veintinueve || RESULTADO OBTENIDO: Veintinueve
//ENTRADA: 30 || RESULTADO ESPERADO: Treinta || RESULTADO OBTENIDO: Treinta
//ENTRADA: 55 || RESULTADO ESPERADO: Cincuenta y cinco || RESULTADO OBTENIDO: Cincuenta y cinco
//ENTRADA: 99 || RESULTADO ESPERADO: Noventa y nueve || RESULTADO OBTENIDO: Noventa y nueve

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable cifra1 como int para almacenar la primera cifra del num
		// introducido por el usuario.
		int cifra1;

		// Creamos la variable cifra2 como int para almacenar la segunda cifra del num
		// introducido por el usuario.
		int cifra2;

		// Creamos la variable cadCifra1 como String para almacenar la primera cifra del
		// número en letra.
		String cadCifra1 = "";

		// Creamos la variable cadCifra2 como String para almacenar la segunda cifra del
		// número en letra.
		String cadCifra2 = "";

		// Creamos la variable solucion como String para almacenar el resultado del
		// número en cadena.
		String solucion = "";

		// Creamos el Scanner para leer ese número introducido por el usuario por
		// teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número por teclado y lo leemos.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Comprobamos si el número introducido por el usuario esta fuera del rango, si
		// es así mostramos el siguiente mensaje de error.
		if (num < 1 || num > 99) {
			System.out.println("El número introducido esta fuera del rango (1-99)");

			// Si no
		} else {

			// Comprobamos si el número esta comprendido entre 10 y 29, si es así imprimimos
			// el número por consola.
			if (num >= 10 && num <= 15) {
				switch (num) {
				case 10 -> solucion = "Diez";
				case 11 -> solucion = "Once";
				case 12 -> solucion = "Doce";
				case 13 -> solucion = "Trece";
				case 14 -> solucion = "Catorce";
				default -> solucion = "Quince";
				}

				// Si no
			} else {

				// Le asinamos a cifra1 la primera cifra del número, esto se consigue con el
				// cociente del número entre 10.
				cifra1 = num / 10;

				// Le asinamos a cifra2 la segunda cifra del número, esto se consigue con el
				// modulo del número entre 10.
				cifra2 = num % 10;

				// Creamos este switch para guardar la cifra dos que este caso van a ser del 1
				// al 9 y se van a repetir en todos los casos.
				switch (cifra2) {
				case 1 -> cadCifra2 = "uno";
				case 2 -> cadCifra2 = "dos";
				case 3 -> cadCifra2 = "tres";
				case 4 -> cadCifra2 = "cuatro";
				case 5 -> cadCifra2 = "cinco";
				case 6 -> cadCifra2 = "seis";
				case 7 -> cadCifra2 = "siete";
				case 8 -> cadCifra2 = "ocho";
				case 9 -> cadCifra2 = "nueve";
				}

				// Con este switch vamos a controlar la primera cifra que son las decenas.
				switch (cifra1) {

				// En el caso de que las decenas sea 1 solo vamos a terner en cuenta del 16 al
				// 19. Que son solo los que tienen una parte comun.
				case 1 -> cadCifra1 = "Dieci";

				// En el caso dos si las unidades son cero imprimimos veinte si no es 0
				// imprimimos veinti.
				case 2 -> {
					if (cifra2 == 0) {
						cadCifra1 = "Veinte";
					} else {
						cadCifra1 = "Veinti";
					}
				}
				// En el siguiente caso si las decenas son 3 imprimimos treinta y si las
				// unidades son distintas de cero le concatenamos la y. Y así con los demas
				// casos.
				case 3 -> {
					cadCifra1 = "Treinta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}
				}

				case 4 -> {
					cadCifra1 = "Cuarenta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}

				}

				case 5 -> {
					cadCifra1 = "Cincuenta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}

				}

				case 6 -> {
					cadCifra1 = "Sesenta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}
				}

				case 7 -> {
					cadCifra1 = "Setenta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}
				}

				case 8 -> {
					cadCifra1 = "Ochenta";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}
				}
				case 9 -> {
					cadCifra1 = "Noventa";
					if (cifra2 != 0) {
						cadCifra1 = cadCifra1 + " y ";
					}
				}
				}
			}

		}

		// Con este ternario comprobamos si la solución es cadena vacia si no es así le
		// concatenamos la cifra 1 y la cifra 2, pero si no es cadena vacia significa
		// que es un número entre el 10 y el 15, estonces imprime directamente la
		// solución.
		solucion = solucion.equals("") ? (cadCifra1 + cadCifra2) : solucion;
		
		//Imprimimos la solución
		System.out.println(solucion);

		// Cierre de Scanner
		sc.close();

	}
}
