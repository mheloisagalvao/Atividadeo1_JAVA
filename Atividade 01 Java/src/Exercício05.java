import java.util.Locale;
import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		// Exercício 05 - Tabuada:

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = 7, i;

		System.out.println("Tabuada do " + numero);

		for (i = 10; i <= 25; i++) {
			System.out.print(i + " x " + numero + " = ");
			System.out.println(i * numero);
		}
		sc.close();
	}

}
