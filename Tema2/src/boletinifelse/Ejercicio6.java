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

		// Le pedimos al usuario que introduzca el valor de "a" y lo leemos.
		System.out.print("Introduce el valor de a --> ");
		a = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "b" y lo leemos.
		System.out.print("Introduce el valor de b --> ");
		b = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "c" y lo leemos.
		System.out.print("Introduce el valor de c --> ");
		c = sc.nextInt();

		// Resolvemos la primera solución de la ecuación de segundo grado con la
		// ecuación, menos b mas la raiz cuadrada de b al cuadrado - 4 por a por c y
		// todo eso entre 2 por a.
		x1 = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		// Resolvemos la segunda solución de la ecuación de segundo grado con la
		// ecuación, menos b menos la raiz cuadrada de b al cuadrado - 4 por a por c y
		// todo eso entre 2 por a.
		x2 = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		// Comprobamos si las soluciones son las mismas porque si es así esta ecuación
		// solo tiene una solución.
		if (x1 == x2) {
			System.out.println();
			System.out.println("Esta ecuación tiene una sola solución = " + x1);
			// Con la condición else-if comprobamos si los resultados de la ecuación tienen
			// números reales y si es así los mostramos.
		} else if ((x1 <= 0 || x1 > 0) || (x2 <= 0 || x2 > 0)) {
			System.out.println();
			System.out.println("Estas son las dos soluciones = " + x1 + ", " + x2);
			// Si no se cumple ninguna de las condiciones anteriores es que nuestro ecuación
			// no tiene resultados reales, por ello mostramos el mensaje de que nuestra
			// ecuación no tiene resultado.
		} else {
			System.out.println();
			System.out.println("La ecuación no tiene soluciones reales.");
		}

		// Cierre de Scanner
		sc.close();

	}

}
