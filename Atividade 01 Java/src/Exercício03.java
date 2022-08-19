import java.util.Locale;
import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		// Exercício 03 - Prefeitura:

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int filhos, habitantes = 0, somaFilhos = 0;
		double salario, somaSalario = 0.0, sal900 = 0.0, mediaS, mediaF, maiorS = 0.0, perctS;
		char verificacao;

		do {
			System.out.println("Digite seu salário: ");
			salario = sc.nextDouble();
			somaSalario += salario;
			if (salario <= 900) {
				sal900++;
			}
			System.out.println("Digite seu nº de filhos: ");
			filhos = sc.nextInt();
			somaFilhos += filhos;
			habitantes++;

			System.out.println("Deseja continuar? (S ou N)");
			verificacao = sc.next().charAt(0);

			if (maiorS < salario) {
				maiorS = salario;
			}
		} while (verificacao != 'N');

		mediaS = somaSalario / habitantes;
		System.out.printf("A média salarial é de R$ %.2f%n", mediaS);

		mediaF = somaFilhos / habitantes;
		System.out.printf("A média de filhos é de %.2f%n", mediaF);

		System.out.printf("O maior salario é de R$ %.2f%n", maiorS);

		perctS = (sal900 / habitantes) * 100.0;
		System.out.println("A porcentagem de salários abaixo de R$900.00 é: " + perctS + "%");

		sc.close();
	}

}
