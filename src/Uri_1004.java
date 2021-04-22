import java.util.Scanner;

/* * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta 
 * operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente. */


public class Uri_1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, PROD;
		a = sc.nextInt();
		b = sc.nextInt(); 
		
		PROD = a * b;
		
		System.out.println("PROD = " + PROD);
					
		sc.close();



	}

}
