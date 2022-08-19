import java.util.Locale;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		// Exercício 01 - Médias aritmética e ponderada + Conceito:

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite suas 3 notas: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		System.out.println("Digite uma letra: ");
		char letra = sc.next().charAt(0);

		double mediaArit, mediaPond;

		if (letra == 'A') {
			mediaArit = (n1 + n2 + n3) / 3.0;
			if (mediaArit <= 4.9) {
				System.out.printf("Conceito D e sua nota é de %.2f%n", mediaArit);
			} else if (mediaArit <= 6.9) {
				System.out.printf("Conceito C e sua nota é de %.2f%n", mediaArit);
			} else if (mediaArit <= 8.9) {
				System.out.printf("Conceito B e sua nota é de %.2f%n", mediaArit);
			} else if (mediaArit <= 10.0) {
				System.out.printf("Conceito A e sua nota é de %.2f%n", mediaArit);
			}
		} else if (letra == 'P') {
			mediaPond = ((n1 * 2.0) + (n2 * 4.0) + (n3 * 6.0)) / (2.0 + 4.0 + 6.0);
			if (mediaPond <= 4.9) {
				System.out.printf("Conceito D e sua nota é de %.2f%n", mediaPond);
			} else if (mediaPond <= 6.9) {
				System.out.printf("Conceito C e sua nota é de %.2f%n", mediaPond);
			} else if (mediaPond <= 8.9) {
				System.out.printf("Conceito B e sua nota é de %.2f%n", mediaPond);
			} else if (mediaPond <= 10.0) {
				System.out.printf("Conceito A e sua nota é de %.2f%n", mediaPond);
			}
		}

		sc.close();
	}

}
