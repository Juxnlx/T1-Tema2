package boletinfor;

import java.util.Scanner;

/**
 * Este programa solicita un número al usuario y el programa debe de calcular el
 * factorial del número introducido.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable num como int para almacenar el valor entero
		// introducido por el usuario.
		int num;

		// Creamos la variable resultFactorial com int para almacenar el valor factorial
		// del número introducido por el usuario. Debemos de inicializarlo a 1 porque si
		// lo inicializamos a 0, a la hora de multiplicarlo vamos a multipiplicar por 0
		// y la solución nos va a mostrar siempre 0.
		int resultFactorial = 1;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el número del que se desea conocer su factorial y lo
		// leemos.
		System.out.print("Introduce el número del que desea conocer su factorial --> ");
		num = sc.nextInt();

		// Imprimimos que es lo que vamos a mostrar por consola.
		System.out.println();
		System.out.println("El factorial del número " + num + " es: ");

		// Con este for asignamos a nuestra variable i el número introducido por el
		// usuario. La condición seria que el números debe de ser mayor o igual 2 y con
		// el decremento lo que vamos haciendo es coger los números mas pequeños de 1 en
		// 1 hasta el 2, ya que multiplicar por 1 es igual.
		for (int i = num; i >= 2; i--) {
			System.out.print(i + " x ");
			// En cada iteración vamos multiplicando el número introducido y lo vamos
			// almacenando en nuesta variable resultFactorial.
			resultFactorial *= i;
		}

		// Imprimimos un mensaje mostrando el factorial del número introducido por el
		// usuario.
		System.out.print("1 = " + resultFactorial);

		// Cierre de Scanner
		sc.close();
	}

}
