/* Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo. O �ltimo
* dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo
*  de indiv�duos. */
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
