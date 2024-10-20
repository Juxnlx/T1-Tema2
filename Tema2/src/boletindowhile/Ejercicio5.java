package boletindowhile;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa le va preguntado al usuario si el número que el usuario ha
 * pensado es mayor, menor o igual al introducido por la maquina. El programa
 * finaliza cuando la maquina ha hacertado el número.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos una variable num como int, que sera el número introducido por la
		// maquina
		int num = 1;

		// Creamos la variable min como int para almacenar el valor introducido cuando
		// introdujamos mayor, así vamos cerrando el circulo.
		int min = 1;

		// Creamos la variable max como int para almacenar el valor introducido por la
		// máquina cuando introdujamos menor, así vamos cerrando el abanico de
		// posibilidades.
		int max = 101;

		// Creamos la variable indicacionUsuario como String para almacenar mayor, menor
		// o igual.
		String indicacionUsuario = "";

		// Creamos la clase Random para generar un valor Random y asignarlo a num el
		// número seleccioando por la máquina.
		Random rand = new Random();

		// Creamos la clase Scanner para leer las indicaciones del Usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do while para seguir proponiendo números hasta que acierte.
		do {
			// Comprobamos si el usuario a introducido mayor.
			if (indicacionUsuario.equalsIgnoreCase("mayor")) {
				// Si es así asignamos a nuestra variable min el ultimo número seleccionado por
				// la máquina porque ese será el menor, ya que nosotros hemos dicho que el
				// número que nosotros hemos seleccionado es mayor por lo tanto no puede ser
				// menor que el propuesto por la máquina.
				min = num;
				// Hacemos que la maquina seleccione un número aleatorio entre el min + 1 porque
				// el que ya ha introducido no se puede volver a repetir y el max.
				num = rand.nextInt(min + 1, max);

				// Si no es mayor comprobamos si es menor.
			} else if (indicacionUsuario.equalsIgnoreCase("menor")) {
				// Asignamos a nuestra variable max el ultimo número seleccionado por la máquina
				// en el caso de que el usuario introduzca menor. Porque si nosotros al número
				// que nos ha proporcionado la máquina la indicamos menor, sabemos que los
				// números que propongan a continuación nos pueden ser mayores que ese.
				max = num;
				// Hacemos que la máquina seleccione un número aleatorio entre el min + 1 y el
				// max calculado.
				num = rand.nextInt(min + 1, max);

				// En el caso de que no se cumplan las dos condiciones anteriores se cumle esta,
				// esta solo se ejecutara 1 vez al principio, a partir de esa vez ya se
				// generarán la de mayor o menor.
			} else {
				//Primer número propuestro de la máquina, número aleatorio entre 1 y 100.
				num = rand.nextInt(1, 101);
			}

			// El programa nos muestra el número que ha generado aleatoriamente.
			System.out.println("¿Es este el número que has pensado? --> ");
			System.out.println(num);

			// El usuario responde a la maquina si es mayor, menor o igual.
			System.out.println("El número que has pensado es: ");
			indicacionUsuario = sc.nextLine();

			// Coprobamos si la indicación del usuario es mayor o menor, si así sigue
			// generando números aleatorios hasta que introduzca igual, en ese caso se sale
			// y finaliza el ejercicio.
		} while (indicacionUsuario.equalsIgnoreCase("mayor") || indicacionUsuario.equalsIgnoreCase("menor"));

		// Felicitamos a la máquina por acertar el número que hemos pensado.
		System.out.println("¡Felicidades! es número es: " + num);

		// Cierre de Scanner
		sc.close();
	}

}
