import java.util.Scanner;

public class Uri_1467 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A == C) {
            System.out.println("*");
        } else if (A != B && A != C) {
            System.out.println("A");
        } else if (B != A && B != C) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        sc.close();
    }
}
