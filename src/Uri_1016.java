/* Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 60 Km/h 
 * e o carro Y sai com velocidade constante de 90 Km/h. 
 * Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, consegue
 *  se afastar um quil�metro a cada 2 minutos.
 *  Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa 
 *  dist�ncia do outro carro. */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		int tempo = n * 2;
		
		System.out.printf(tempo + " minutos");
		
		sc.close();
	}

}
