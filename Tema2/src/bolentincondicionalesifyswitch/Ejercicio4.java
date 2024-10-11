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
			if (num >= 10 && num <= 29) {
				switch (num) {
				case 10 -> System.out.println("El número introducido es: Diez");
				case 11 -> System.out.println("El número introducido es: Once");
				case 12 -> System.out.println("El número introducido es: Doce");
				case 13 -> System.out.println("El número introducido es: Trece");
				case 14 -> System.out.println("El número introducido es: Catorce");
				case 15 -> System.out.println("El número introducido es: Quince");
				case 16 -> System.out.println("El número introducido es: Dieciseis");
				case 17 -> System.out.println("El número introducido es: Diecisiete");
				case 18 -> System.out.println("El número introducido es: Dieciocho");
				case 19 -> System.out.println("El número introducido es: Diecinueve");
				case 20 -> System.out.println("El número introducido es: Veinte");
				case 21 -> System.out.println("El número introducido es: Veintiuno");
				case 22 -> System.out.println("El número introducido es: Veintidós");
				case 23 -> System.out.println("El número introducido es: Veintitres");
				case 24 -> System.out.println("El número introducido es: Veinticuatro");
				case 25 -> System.out.println("El número introducido es: Veinticinco");
				case 26 -> System.out.println("El número introducido es: Veintiseis");
				case 27 -> System.out.println("El número introducido es: Veintisiete");
				case 28 -> System.out.println("El número introducido es: Veintiocho");
				default -> System.out.println("El número introducido es: Veintinueve");
				}

				// Si no
			} else {

				// Comprobamos si el conciente del número no es ni 0, 1 y 2. Esa divisón nos
				// devuelve la primera cifra del número.
				if (num / 10 != 0 && num / 10 != 1 && num / 10 != 2) {

					// Le asinamos a cifra1 la primera cifra del número, esto se consigue con el
					// cociente del número entre 10.
					cifra1 = num / 10;

					// Le asinamos a cifra2 la segunda cifra del número, esto se consigue con el
					// modulo del número entre 10.
					cifra2 = num % 10;

					// Comprobamos si la cifra 2 es 0 si es asi nos referimos a 30, 40, 50...
					if (cifra2 == 0) {
						// Comprobamos solo la primera cifra y imprimos dichos número los que la primera
						// cifra es 1, 2, ..., 9 y la segunda cifra es 0.
						switch (cifra1) {
						case 3 -> cadCifra1 = "Treinta";
						case 4 -> cadCifra1 = "Cuarenta";
						case 5 -> cadCifra1 = "Cicuenta";
						case 6 -> cadCifra1 = "Sesenta";
						case 7 -> cadCifra1 = "Setenta";
						case 8 -> cadCifra1 = "Ochenta";
						default -> cadCifra1 = "Noventa";
						}
						// Y la cifra 2 la dejamos como cadena vacia.
						cadCifra2 = "";

						// Si no
					} else {
						// Con estos dos switch le asignamos a cadCifra1 una cadena pasandole como
						// parametro cifra1 y cadCifra2 otra cadena pasando como parametro cifra2.
						switch (cifra1) {
						case 3 -> cadCifra1 = "Treinta y ";
						case 4 -> cadCifra1 = "Cuarenta y ";
						case 5 -> cadCifra1 = "Cincuenta y ";
						case 6 -> cadCifra1 = "Sesenta y ";
						case 7 -> cadCifra1 = "Setenta y ";
						case 8 -> cadCifra1 = "Ochenta y ";
						default -> cadCifra1 = "Noventa y ";
						}
						switch (cifra2) {
						case 1 -> cadCifra2 = "uno";
						case 2 -> cadCifra2 = "dos";
						case 3 -> cadCifra2 = "tres";
						case 4 -> cadCifra2 = "cuatro";
						case 5 -> cadCifra2 = "cinco";
						case 6 -> cadCifra2 = "seis";
						case 7 -> cadCifra2 = "siete";
						case 8 -> cadCifra2 = "ocho";
						default -> cadCifra2 = "nueve";
						}
					}
					// Si no
				} else {
					// A cifra 1 le asignamos el modulo del número entre 10 que es el número
					// introducido por el usuario..
					cifra1 = num % 10;

					// Pasamos cifra 1 como parametro y le asignamos a cadCifra1 la cadena
					// correspondiente en cada caso.
					switch (cifra1) {
					case 1 -> cadCifra1 = "Uno";
					case 2 -> cadCifra1 = "Dos";
					case 3 -> cadCifra1 = "Tres";
					case 4 -> cadCifra1 = "Cuatro";
					case 5 -> cadCifra1 = "Cinco";
					case 6 -> cadCifra1 = "Seis";
					case 7 -> cadCifra1 = "Siete";
					case 8 -> cadCifra1 = "Ocho";
					default -> cadCifra1 = "Nueve";
					}
					// CadCifra2 la ponemos como cadena vacia por que en este caso solo cubrimos los
					// números entre 1 y 9.
					cadCifra2 = "";
				}
				// Y por ultimo imprimimos el resultado del número en cadena.
				System.out.println("El número introducido es --> " + cadCifra1 + cadCifra2);
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
