/* Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média
 * semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo
 * [0,10]). Cada nota deve ser validada separadamente. */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1117 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		while (n1 < 0.0 || n1 > 10.0) {
			System.out.println("nota invalida");
			n1 = sc.nextDouble();
		}

		double n2 = sc.nextDouble();
		while (n2 < 0.0 || n2 > 10.0) {
			System.out.println("nota invalida");
			n2 = sc.nextDouble();
		}

		double media = (n1 + n2) / 2.0;
		System.out.printf("media = %.2f\n", media);

		sc.close();

	}

}