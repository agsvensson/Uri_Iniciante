/*A fórmula para calcular a área de uma circunferência é: area = pi . raio2. Considerando para este
 *  problema que pi = 3.14159:
 *  Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi. */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double raio, area;
		raio = sc.nextDouble();
		
		area = raio * raio * 3.14159;
		System.out.printf("A=%.4f\n", area); 
		
		sc.close();
		

	}

}
