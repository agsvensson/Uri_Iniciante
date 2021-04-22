import java.util.Scanner;

public class Uri_1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                System.out.print("NULL");
            }
            else if (x % 2 == 0) {
                System.out.print("EVEN");
            }
            else {
                System.out.print("ODD");
            }

            if (x > 1) {
                System.out.print(" POSITIVE");
            } else if (x < 0) {
                System.out.print(" NEGATIVE");
            }
            System.out.println();
        }

        sc.close();
    }
}
