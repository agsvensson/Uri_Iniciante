/* Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. Calcule e imprima a m�dia
 * semestral. Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo
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