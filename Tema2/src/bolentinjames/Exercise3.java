package bolentinjames;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// We declare the height variable as double to store the height entered by the
		// user.
		double height;

		// We declare the variable maximum to store the maximum height entered by the
		// user.
		double maximun = 0;

		// We declare the variable minimun as double to store the smallest height
		// entered by the user. We initialize it to a very high value.
		double minimum;

		// Create the Scanner 
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a height: --> ");
		height = sc.nextDouble();
		
		minimum = height;

		while (height != 0) {

			if (maximun < height) {
				maximun = height;
			}

			if (minimum > height) {
				minimum = height;
			}

			System.out.print("Enter a height: --> ");
			height = sc.nextDouble();
		}

		System.out.println("The maximum height is: " + maximun);
		System.out.println("The lowest height is: " + minimum);
		sc.close();

	}

}
