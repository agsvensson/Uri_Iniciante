/* Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, 
 * calcule e mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B. */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, tri, cir, tra, qua, ret, pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = (a * c) / 2;
		cir = pi * (c * c);
		tra = (a + b) * c / 2;
		qua = b * b;
		ret = a * b;

		
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
		sc.close();

	}

}
