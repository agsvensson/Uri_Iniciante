import java.util.Scanner;

public class Uri_1379 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C;

        while (A != 0 && B !=0) {
            C = 2 * A - B;
            System.out.println(C);
            A = sc.nextInt();
            B = sc.nextInt();
        }

        sc.close();
    }
}
