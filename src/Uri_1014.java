/* Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o 
 * total de combust�vel gasto (em litros). */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double consumo = x / y;
		
		System.out.printf("%.3f km/l", consumo);
		
		sc.close();

	}

}
