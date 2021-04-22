import java.util.Scanner;
import java.util.Locale;

public class Uri_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < b + a)) {
            double peri = a + b + c;
            System.out.printf("Perimetro = %.1f\n", peri);
        } else {
            double area =  ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        sc.close();
    }
}
