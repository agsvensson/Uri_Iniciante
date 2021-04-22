import java.util.Locale;
import java.util.Scanner;

public class Uri_1064 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int somaPositivo = 0;
        double media = 0;

        for (int i = 0; i <= 5; i++) {
            double numero = sc.nextDouble();

            if (numero > 0.0) {
                somaPositivo = somaPositivo + 1;
                media = media + numero;
            }
        }

        sc.nextLine();
        System.out.println(somaPositivo + " valores positivos");
        System.out.printf("%.1f\n", media/somaPositivo);

        sc.close();
    }
}
