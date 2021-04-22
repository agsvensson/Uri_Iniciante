/* Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último
* dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo
*  de indivíduos. */
import java.util.Locale;
import java.util.Scanner;

public class Uri_1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int contador = 0, media = 0;
		int numero = sc.nextInt();

		while (numero >= 0) {
			media = media + numero;
			contador = contador + 1;
			numero = sc.nextInt();
		}
		double mediaIdade = (double) media/contador;
		System.out.printf("%.2f\n", mediaIdade);
		
		sc.close();
	}
}
