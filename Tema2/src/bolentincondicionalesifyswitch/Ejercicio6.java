package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * Este programa solicita al usuario unos segundos, minutos y horas y el
 * programa debe de mostrar la hora con un minuto incrementado.
 */

//PRUEBAS
//ENTRADA: 23:00:60 || RESULTADO ESPERADO: "Las horas, minutos o segundos son incorrectos" || RESULTADO OBTENIDO: "Las horas, minutos o segundos son incorrectos"
//ENTRADA: 08:09:05 || RESULTADO ESPERADO: 08:09:06 || RESULTADO OBTENIDO: 08:09:06
//ENTRADA: 23:00:59 || RESULTADO ESPERADO: 23:01:00 || RESULTADO OBTENIDO: 23:01:00
//ENTRADA: 05:17:05 || RESULTADO ESPERADO: 05:17:06 || RESULTADO OBTENIDO: 05:17:06
//ENTRADA: 04:08:31 || RESULTADO ESPERADO: 04:08:32 || RESULTADO OBTENIDO: 04:08:32
//ENTRADA: 23:59:05 || RESULTADO ESPERADO: 23:59:06 || RESULTADO OBTENIDO: 23:59:06
//ENTRADA: 23:08:31 || RESULTADO ESPERADO: 23:08:32 || RESULTADO OBTENIDO: 23:08:32
//ENTRADA: 04:22:31 || RESULTADO ESPERADO: 04:22:32 || RESULTADO OBTENIDO: 04:22:32
//ENTRADA: 23:59:59 || RESULTADO ESPERADO: 00:00:00 || RESULTADO OBTENIDO: 00:00:00

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable segundos como int para almacenar los segundos
		// introducidos por
		// el usuario.
		int segundos;

		// Creamos la variable min como int para almacenar los minutos introducidos por
		// el usuario.
		int minutos;

		// Creamos la variable horas como int para almacenar las horas introducidas por
		// el usuario.
		int horas;

		// Creamos el Scanner para pedir las horas, minutos y segundos al usuario.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca las horas que deseé y las leemos.
		System.out.print("Introduce una cantidad de horas --> ");
		horas = sc.nextInt();
		
		// Le pedimos al usuario que introduzca los minutos que deseé y los leemos.
		System.out.print("Introduce una cantidad de minutos --> ");
		minutos = sc.nextInt();

		// Le pedimos al usuario que introduzca los segundos que deseé y los leemos.
		System.out.print("Introduce una cantidad de segundos --> ");
		segundos = sc.nextInt();

		// Comprobamos si las horas, minutos y segundos introducidos por el usuario son
		// incorrectos. En el caso de los segundos el valor -1 y 60 serian incorrectos.
		if ((horas < 0 || horas > 23) || (minutos < 0 || minutos > 59) || (segundos < 0 || segundos > 59)) {
			System.out.println("Las horas, minutos o segundos son incorrectos");

			// Si no
		} else {
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

			// Mediante if comprobamos si los segundos, minutos y horas son un número de 1
			// cifra o 2 cifras y le añadimos un 0 delante o no.
			if (segundos / 10 == 0 && minutos / 10 == 0 && horas / 10 == 0) {
				System.out.println("Hora con 1 seg mas: 0" + horas + ":0" + minutos + ":0" + segundos);
			} else if (segundos / 10 == 0 && minutos / 10 == 0) {
				System.out.println("Hora con 1 seg mas: " + horas + ":0" + minutos + ":0" + segundos);
			} else if (segundos / 10 == 0 && horas / 10 == 0) {
				System.out.println("Hora con 1 seg mas: 0" + horas + ":" + minutos + ":0" + segundos);
			} else if (minutos / 10 == 0 && horas / 10 == 0) {
				System.out.println("Hora con 1 seg mas: 0" + horas + ":0" + minutos + ":" + segundos);
			} else if (segundos / 10 == 0) {
				System.out.println("Hora con 1 seg mas: " + horas + ":" + minutos + ":0" + segundos);
			} else if (minutos / 10 == 0) {
				System.out.println("Hora con 1 seg mas: " + horas + ":0" + minutos + ":" + segundos);
			} else if (horas / 10 == 0) {
				System.out.println("Hora con 1 seg mas: " + "0" + horas + ":" + minutos + ":0" + segundos);
			} else {
				System.out.println("Hora con 1 seg mas: " + horas + ":" + minutos + ":0" + segundos);
			}
		}

		// Cierre de Scanner;
		sc.close();
	}
}
