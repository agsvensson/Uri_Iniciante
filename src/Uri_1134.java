/* Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
 * Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 
 * 2.Gasolina 3.Diesel 4.Fim). 
 * Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo 
 * (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. */

import java.util.Scanner;

public class Uri_1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int x = sc.nextInt();

		if (x < 1 && x > 4) {
			x = sc.nextInt();
		} else {
			while (x != 4) {
				if (x == 1) {
					alcool = alcool + 1;
				}
				else if (x == 2) {
					gasolina = gasolina + 1;
				}
				else if (x == 3) {
					diesel = diesel + 1;
				}
				x = sc.nextInt();
			}
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
