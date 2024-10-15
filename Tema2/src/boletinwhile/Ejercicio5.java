package boletinwhile;

import java.util.Scanner;

/**
 * Este programa solicita las edades del los alumnos hasta introducir una
 * negativa y luego muestras la suma de todas las edades, la media, el número de
 * alumnos y cuantos son mayor de adad.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la variable edad como int para almacenar las edades de los alumnos.
		int edad;

		// Creamos la variable sumaAlum como int para almacenar la suma de todas las
		// edades de los alumnos.
		int sumaAlum = 0;

		// Creamos la variable cont como int para almacenar el número de edades
		// introducidas de cada alumno.
		int cont = 0;

		// Creamos la variable contMayEdad como int para almacenar el número de alumnos
		// con mayoria de edad.
		int contMayEdad = 0;

		// Creamos el Scanner para leer las edades del alumno.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la edad del alumno y la leemos.
		System.out.print("Introduce la edad del alumno --> ");
		edad = sc.nextInt();

		// Comprobamos mediante al while que la edad introducida del alumno debe de ser
		// mayor que 0.
		while (0 < edad) {

			// Vamos sumando a la variable sumaAlum todas las edades introducidas por el
			// usuario.
			sumaAlum += edad;

			// Comprobamos si la edad introducida es mayor igual a 18 si es así sumamos 1 a
			// nuestro contador de mayoria de edad.
			if (edad >= 18) {
				contMayEdad++;
			}

			// Contabilizamos el número de alumnos que se van introduciendo.
			cont++;

			// Le volvemos a pedir al usuario que introduzca la edad del elumno y la leemos.
			System.out.print("Introduce la edad del alumno --> ");
			edad = sc.nextInt();

		}

		// Mostramos la suma de las edades de todos los alumnos, la media, el número de
		// alumnos y el número de alumnos mayores de edad.
		System.out.println();
		System.out.println("Suma de todas las edades: " + sumaAlum);
		System.out.println("Media de todas las edades: " + (cont == 0 ? 0 : (float) sumaAlum / cont));
		System.out.println("Número de alumnos introducidos: " + cont);
		System.out.println("Número de alumnos con mayoria de edad: " + contMayEdad);

		// Cierre de Scanner
		sc.close();
	}

}
