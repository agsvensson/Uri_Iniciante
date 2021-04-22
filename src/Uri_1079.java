import java.util.Locale;
import java.util.Scanner;

public class Uri_1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1=0, n2=0, n3=0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            double mediaPonderada = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
            System.out.printf("%.1f\n", mediaPonderada);
        }

        sc.close();
    }
}
