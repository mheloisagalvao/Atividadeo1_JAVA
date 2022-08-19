import java.util.Locale;
import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

		// Exercício 02 - Triângulos:

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite lado 1 do triângulo: ");
		double X = sc.nextDouble();

		System.out.println("Digite lado 2 do triângulo: ");
		double Y = sc.nextDouble();

		System.out.println("Digite lado 3 do triângulo: ");
		double Z = sc.nextDouble();

		if ((X < (Y + Z)) && (Y < (X + Z)) && (Z < (X + Y))) {
			if (X == Y && Y == Z) {
				System.out.println("Este triângulo é equilátero.");
			} else if (X == Y || Y == Z || Z == X) {
				System.out.println("Este triângulo é isósceles.");
			} else if (X != Y && Y != Z && Z != X) {
				System.out.println("Este triângulo é escaleno.");
			}
		} else {
			System.out.println("Este é um não triângulo.");
		}

		sc.close();
	}

}
