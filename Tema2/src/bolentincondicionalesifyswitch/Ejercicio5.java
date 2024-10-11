package bolentincondicionalesifyswitch;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa genera dos números aleatorios y el usuario debe de introducir
 * la suma de esos dos números y el programa comprobará si la suma es correcta.
 */

//PRUEBAS
//ENTRADA: 1 || RESULTADO ESPERADO: No es posible ese resultado || RESULTADO OBTENIDO: No es posible ese resultado
//ENTRADA: 199 || RESULTADO ESPERADO: No es posible ese resultado || RESULTADO OBTENIDO: No es posible ese resultado
//ENTRADA: 2 || RESULTADO ESPERADO: Lo siento el resultado es incorrecto." || RESULTADO OBTENIDO: Lo siento el resultado es incorrecto."
//ENTRADA: 198 || RESULTADO ESPERADO: Lo siento el resultado es incorrecto." || RESULTADO OBTENIDO: Lo siento el resultado es incorrecto."
//ENTRADA: X || RESULTADO ESPERADO: ¡FELICIDADES! El resultado de la suma es: X || RESULTADO OBTENIDO: ¡FELICIDADES! El resultado de la suma es: X
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para asignar un valor aleatorio entre 1 y
		// 99.
		int num1;

		// Creamos la variable num2 como int para asignar un valor aleatorio entre 1 y
		// 99.
		int num2;

		// Creamos la variable sumaUsuario como int para asignar el valor de la suam de
		// los dos números que será introducido por el usuario.
		int sumaUsuario;

		// Creamos la clase Random para asignarle un número aleatorio entre 1 y 99 a
		// num1 y num2.
		Random rand = new Random();

		// Creamos la clase Scanner para leer el resultado de la suma introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Asignamos a num1 un número aleatorio entre 1 y 99 con la clase Random.
		num1 = rand.nextInt(1, 100);

		// Asignamos a num1 un número aleatorio entre 1 y 99 con la clase Random.
		num2 = rand.nextInt(1, 100);

		// Le pedimos al usuario que introduzca el resultado de la suma y lo leemos.
		System.out.println("¿Cual es el resultado de " + num1 + " + " + num2 + " ?");
		sumaUsuario = sc.nextInt();

		// Comprobamos si el número de la suma esta comprendido entre 2 y 198 porque lo
		// maximo que podria sumarse en 99+99=198 y 1+1=2.
		if (sumaUsuario < 2 || sumaUsuario > 198) {
			System.out.println("No es posible ese resultado");

			// Si no
		} else {
			// Comprobamos si el resultado de la suma introducida por el usuario es correcta
			// y mostramos un mensaje de felicitación. Si no lo es mostramos un mensaje
			// imprimiendo que el resultado de la suma en incorrecto.
			if ((num1 + num2) == sumaUsuario) {
				System.out.println("¡FELICIDADES! El resultado de la suma es: " + sumaUsuario);
			} else {
				System.out.println("Lo siento el resultado es incorrecto.");
				System.out.println("El resultado de la suma sería: " + (num1 + num2));
			}
		}
		// Cierre de Scanner
		sc.close();
	}

}
