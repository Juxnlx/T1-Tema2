package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * Este programa le pide al usuario la distancia recorrer y el número de días y
 * el programa de mostrar el precio del billete con los descuentos pertinentes.
 */

//PRUEBAS
//ENTRADA: 801 km y 8 días  || RESULTADO ESPERADO: 1401.75 || RESULTADO OBTENIDO: 1401.75
//ENTRADA: 800 km y 8 días  || RESULTADO ESPERADO: 2000 || RESULTADO OBTENIDO: 2000
//ENTRADA: 801 km y 7 días  || RESULTADO ESPERADO: 2002.5 || RESULTADO OBTENIDO: 2002.5
//ENTRADA: 233 km y 1 días  || RESULTADO ESPERADO: 582.5 || RESULTADO OBTENIDO: 582.5
//ENTRADA: 0 km y -1 días  || RESULTADO ESPERADO: Dintancias o dias incorrectos || RESULTADO OBTENIDO: Dintancias o dias incorrectos

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaramos la constante DESCUENTA como int para almacenar la cantidad del
		// descuento que siempre sera el 30%.
		final int DESCUENTO = 30;

		// Declaramos la constante PRECIO_KM como float para almacenar el precio por km
		// que siempre sera 2,5.
		final float PRECIO_KM = 2.5f;

		// Creamos la variable distancia como double para almacenar la distancia que
		// vamos a recorrer.
		float distancia;

		// Creamos la variable diasEstancia como int para almacenar los números de dias
		// de la duración del viaje.
		int diasEstancia;

		// Creamos la variable precio como float para almacenar el precio del billete.
		float precio = 0;

		// Creamos el Scanner para leer la distancia y los días de estancia por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la distancia a recorrer y la leemos.
		System.out.print("Introduce la distancia a recorrer --> ");
		distancia = sc.nextFloat();

		// Le pedimos al usuario los dias de estancia por teclado y los leemos.
		System.out.print("Introduce el número de dias de estancia --> ");
		diasEstancia = sc.nextInt();

		// Comprobamos si la distancia es menor que 1 y los dias menor que 0.
		if (distancia < 1 || diasEstancia < 0) {
			// Mostramos un mensaje de error
			System.out.println("Dintancias o dias incorrectos");
			// Si no
		} else {

			// Calculamos el precio del billete que es igual entre el precio por la
			// distancia.
			precio = PRECIO_KM * distancia;

			// Comprobamos si la distancia es mayor que 800 y los dias mayor que 7, si es
			// así le hacemos un descuento al precio total del 30% y si no mostramos el
			// precio total.
			precio = ((distancia > 800) && (diasEstancia > 7)) ? precio - ((DESCUENTO * precio) / 100) : precio;

			// Imprimimos el precio del billete.
			System.out.println("El precio del billete es de --> " + precio);
		}

		// Cierre de Scanner
		sc.close();
	}

}
