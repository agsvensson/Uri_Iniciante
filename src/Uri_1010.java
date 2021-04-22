/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o 
 * valor a ser pago. */
import java.util.Scanner;
import java.util.Locale;

public class Uri_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codp1, np1, codp2, np2;
		double vp1, vp2, total;
		
		codp1 = sc.nextInt(); 
		np1 = sc.nextInt();
		vp1 = sc.nextDouble();
		codp2 = sc.nextInt();
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();
		
		total = (np1 * vp1) + (np2 * vp2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}

}
