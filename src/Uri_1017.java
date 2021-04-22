/* Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao 
 * utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um 
 * simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a 
 * velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, 
 * calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto. */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int kmh = sc.nextInt();
		
		double litros = kmh / 12.0 * horas;
		
		System.out.printf("%.3f\n", litros);
	
		sc.close();

	}

}
