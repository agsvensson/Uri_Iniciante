import java.util.Scanner;

public class Uri_1116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int n, x, y;
            double divisaoXY;
            n = sc.nextInt();

            for (int i=0; i < n; i++) {
                x = sc.nextInt();
                y = sc.nextInt();

                if (y == 0) {
                    System.out.println("divisao impossivel");
                } else {
                    divisaoXY = (double) x / y;
                    System.out.printf("%.1f\n", divisaoXY);
                }

            }
        sc.close();
    }
}
