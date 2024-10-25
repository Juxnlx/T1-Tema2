package boletinbucles;

import java.util.Scanner;

/**
 * Este programa solicita unas horas, minutos y segundos y el programa muestra
 * la hora incrementada con diez segundos mas.
 */

//PRUEBAS
//ENTRADA: horas = 25 || RESULTADO ESPERADO: "Las horas introducidas son erroneas." || RESULTADO OBTENIDO: "Las horas introducidas son erroneas."
//ENTRADA: minutos = 60 || RESULTADO ESPERADO: "Los minutos introducidos son erroneos." || RESULTADO OBTENIDO: "Los minutos introducidos son erroneos."
//ENTRADA: segundos = 60 || RESULTADO ESPERADO: "Los segundos introducidos son erroneos." || RESULTADO OBTENIDO: "Los segundos introducidos son erroneos.
//ENTRADA: 08:09:05 +55 || RESULTADO ESPERADO: 08:10:00 || RESULTADO OBTENIDO: 08:10:00
//ENTRADA: 08:59:05 +55 || RESULTADO ESPERADO: 09:00:00 || RESULTADO OBTENIDO: 23:01:00
//ENTRADA: 23:59:05 +55 || RESULTADO ESPERADO: 00:00:00 || RESULTADO OBTENIDO: 00:00:00

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable hora como int para almacenar las horas introducidas por
		// el usuario.
		int horas;

		// Creamos la variable minutos como int para almacenar los minutos introducidos
		// por el usuario.
		int minutos;

		// Creamos la variable segundos como int para almacenar los segundos
		// introducidos por el usuario.
		int segundos;

		// Creamos la variable cantSeg como int para almacenar los segundos introducidos
		// por el usuario.
		int cantSeg;

		// Creamos la variable solución para mostrar la hora con los segundos ya
		// incrementados de forma bonita.
		String solucion = "";

		// Creamos el Scanner para leer las horas, minutos y segundos.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca las horas y las leemos.
		System.out.print("Introduce las horas --> ");
		horas = sc.nextInt();

		// Comprobamos si el valor introducido es erroneo, si es así mostramos un
		// mensaje de error y volvemos a pedir las horas.
		while (horas < 0 || horas > 23) {
			System.out.println("Las horas introducidas son erroneas.");
			System.out.print("Introduce las horas --> ");
			horas = sc.nextInt();
		}

		// Le pedimos al usuario que introduzca los minutos y los leemos.
		System.out.print("Introduce los minutos --> ");
		minutos = sc.nextInt();

		// Comprobamos si el valor introducido es erroneo, si es así mostramos un
		// mensaje de error y volvemos a pedir los minutos.
		while (minutos < 0 || minutos > 59) {
			System.out.println("Los minutos introducidos son erroneos.");
			System.out.print("Introduce los minutos --> ");
			minutos = sc.nextInt();
		}

		// Le pedimos al usuario que introduzca los segundos y los leemos.
		System.out.print("Introduce los segundos --> ");
		segundos = sc.nextInt();

		// Comprobamos si el valor introducido es erroneo, si es así mostramos un
		// mensaje de error y volvemos a pedir los segundos.
		while (segundos < 0 || segundos > 59) {
			System.out.println("Los segundos introducidos son erroneos.");
			System.out.print("Introduce los segundos --> ");
			segundos = sc.nextInt();
		}

		// Le pedimos al usuario la cantidad de segundos que desea incrementar.
		System.out.print("Introduce los segundos que deseas incrementar --> ");
		cantSeg = sc.nextInt();

		// Con este for comprobamos que en cada interación se vaya introduciendo un
		// segundos. Va ver tantas interacciones como incrementos de segundos hayamos
		// introducidos.
		for (int i = 1; i <= cantSeg; i++) {

			// Incrementamos los segundos
			segundos++;

			// Comprobamos si los segundos son mayor que 59, si es así entra. Ponemos los
			// segundos a 0 y incrimentamos los minutos.
			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}

			// Comprobamos si los minutos son mayor que 59, si es así entra. Ponemos los
			// minutos a 0 y incrimentamos las horas.
			if (minutos == 60) {
				minutos = 0;
				horas++;
			}

			// Comprobamos si las horas son mayor que 23, si es así entra y ponemos las
			// horas a 0.
			if (horas > 23) {
				horas = 0;
			}
		}

		// Hacemos un ternario y a nuestra solución le concatenamos un 0 delante si las
		// horas, minutos y segundos son menor 10, si no una cadena vacia, luego las
		// horas y dos puntitos y asi con los demas.

		solucion = (horas < 10 ? "0" : "") + horas + ":";
		solucion += (minutos < 10 ? "0" : "") + minutos + ":";
		solucion += (segundos < 10 ? "0" : "") + segundos;

		// Mostramos nuestra hora con los segundos ya incrementados.
		System.out.println(solucion);

		// Cierre de Scanner
		sc.close();
	}

}
