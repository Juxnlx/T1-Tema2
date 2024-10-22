package boletinfor;

/**
 * Este programa nos muestra la suma de los 10 primeros números impares
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable sumaTotal como int para almacenar la suma de los 10
		// primeros números impares.
		int sumaTotal = 0;

		// Creamos la variable cont como int y la inicializamos a 1 para saber que solo
		// debemos de sumar los 10 primeros números impares.
		int cont = 1;

		// Creamos el bucle for donde la i la inicializamos a 1 que sera los números que
		// ira comprobando. La condición comprueba que nuestro contador no sea menor o
		// igual a 10 porque solo queremos saber la suma de los 10 primeros números
		// impares. Y por ultimo incrementamos núestra i para ir comprobando de 1 en 1
		// los números en cada iteración.
		for (int i = 1; cont <= 10; i++) {
			// Comprobamos que el número de la iteración es impar, si así asignamos a
			// nuestra variable sumaTotal la suma de cada número que sea impar y el contador
			// lo incrementamos en 1 para asegurarnos que solo entran los 10 primeros.
			if (i % 2 != 0) {
				sumaTotal += i;
				cont++;
			}
		}

		// Imprimimos el resultado de la suma de los 10 primeros números impares.
		System.out.println("La suma de los 10 primeros números impares es: " + sumaTotal);
	}

}
