import java.util.Scanner;
import java.util.Locale;


public class Uri_1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		int percentual = 0;

		if (salario >= 0 && salario <= 400.00) {
			percentual = 15;
		} else if (salario >= 400.01 && salario <= 800.00) {
			percentual = 12;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
		} else {
			// salario > 2000.00
			percentual = 4;
		}
		double reajuste = percentual * salario / 100;
		double novoSalario = reajuste + salario;

		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %d %%\n", Math.round(percentual));

		sc.close();

	}

}
