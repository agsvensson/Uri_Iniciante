/* Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
 * A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 * Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens 
 * (dentre elas o C++), assumem que o resultado da divis�o entre dois inteiros � outro inteiro. */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int r;
		double v;
		
		r = sc.nextInt();
		
		v = (4.0/3) * 3.14159 * r * r * r;
		
		System.out.printf("VOLUME = %.3f\n", v);
		
		sc.close();
	}
}
