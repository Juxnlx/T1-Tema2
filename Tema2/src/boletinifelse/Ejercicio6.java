package boletinifelse;

import java.util.Scanner;

/**
 * Este programa nos calcula una ecuación de segundo grado, para ello debemos de
 * introducir la variable a, b y c y calcular x. El programa nos mostrara 1
 * solución, 2 soluciones o ninguna dependiendo de la ecuación.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos el Scanner para pedir a, b y c al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable a como int para almacenar el valor de a.
		int a;

		// Creamos la variable b como int para almacenar el valor de b.
		int b;

		// Creamos la variable c como int para almacenar el valor de c.
		int c;

		// Creamos la variable x1 como double para almacenar el primer resultado de la
		// ecuación de segundo grado.
		double x1;

		// Creamos la variable x2 como double para almacenar el segundo resultado de la
		// ecuación de segundo grado.
		double x2;

		// Creamos la variable discriminante como double para almacenar la solución de
		// la raiz cuadrada.
		double discriminante;

		// Le pedimos al usuario que introduzca el valor de "a" y lo leemos.
		System.out.print("Introduce el valor de a --> ");
		a = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "b" y lo leemos.
		System.out.print("Introduce el valor de b --> ");
		b = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "c" y lo leemos.
		System.out.print("Introduce el valor de c --> ");
		c = sc.nextInt();

		// Comprobamos si a es cero, si es así nuestra ecuación solo tendra una
		// solución, ya que sera una ecuación de primer grado. Solo habría que resolver
		// una x.
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("Esta ecuación tiene una sola solución = " + x1);

			// Si la a es distinto de 0 estonces hacemos lo siguiente:
		} else {
			// Calculamos el discriminante, lo que hay dentro de la raiz cuadrada.
			discriminante = b * b - 4 * a * c;

			// Si es menor que 0 la ecuación no tiene solución, porque no se puede hacer la
			// raiz cuadra de un número negativo.
			if (discriminante < 0) {
				System.out.println();
				System.out.println("La ecuación no tiene soluciones reales.");
			//Pero si ese discriminante es positivo, entonces calculamos x1 (primera solución) y x2 (segunda solución).
			} else {
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println();
				System.out.println("Estas son las dos soluciones = " + x1 + ", " + x2);
			}
		}

		// Cierre de Scanner
		sc.close();

	}

}
