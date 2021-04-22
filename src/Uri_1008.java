/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor 
 * que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário 
 * do funcionário, com duas casas decimais. */

import java.util.Scanner;
import java.util.Locale;

public class Uri_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, hr_trab;
		double sal, vl_hora;
		
		num = sc.nextInt();
		hr_trab = sc.nextInt();
		vl_hora = sc.nextDouble();
		
		sal = hr_trab * vl_hora; 
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", sal);

		sc.close();

	}

}
