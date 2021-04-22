import java.util.Scanner;

public class Uri_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado=0;
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            for (int i=2; i <= numero; i+=2) {
                resultado = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + resultado);
            }
        }
        sc.close();
    }
}
