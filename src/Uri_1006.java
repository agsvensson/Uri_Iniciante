/* Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a 
 * m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere
 *  que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal. */

import java.util.Scanner;
import java.util.Locale;


public class Uri_1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double media = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
		System.out.printf("MEDIA = %.1f", media);
		

	}

}
