import java.util.Scanner;
import java.util.Locale;

public class Uri_1060 {
    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     int somaPositivo = 0;

     for (int i = 0; i < 5; i++) {
         double numero = sc.nextDouble();
         if (numero > 0.0) {
             somaPositivo = somaPositivo + 1;
         }
     }
     sc.nextLine();
     System.out.println(somaPositivo + " valores positivos");
    sc.close();
    }
}
