/* Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele
  no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, 
  informar o total a receber no final do m�s, com duas casas decimais. */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal_fixo, vendasMes, totalReceber, comissao;
		
		String nome = sc.nextLine();
		sal_fixo = sc.nextDouble();
		vendasMes = sc.nextDouble(); 
		comissao = 0.15 * vendasMes;
		totalReceber =  comissao + sal_fixo;
		
		System.out.printf("TOTAL = R$ %.2f\n", totalReceber);
		
		sc.close();
	}

}
