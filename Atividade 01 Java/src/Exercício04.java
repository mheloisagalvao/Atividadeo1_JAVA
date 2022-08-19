import java.util.Locale;
import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		// Exercício 04 - Valores:

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, numero, maior = 0, menor = 100, contPositivos = 0, contMaior = 0, contMenor = 0;

		for (i = 0; i < 50; i++) {

			System.out.println("Digite 50 números:");
			numero = sc.nextInt();

			if (numero > 0) {
				contPositivos++;
			}

			if (numero > maior) {
				maior = numero;
				contMaior++;
			}

			if (numero < menor) {
				menor = numero;
				contMenor++;
			}
		}

		System.out.println("A quantidade de números positivos é de: " + contPositivos);
		System.out.println("O maior nº digitado foi " + maior);
		System.out.println("O menor nº digitado foi " + menor);

		sc.close();
	}

}
