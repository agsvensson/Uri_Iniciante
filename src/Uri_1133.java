import java.util.Scanner;

public class Uri_1133 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorX = sc.nextInt();
        int valorY = sc.nextInt();

        if (valorX > valorY) {
            for (int i = valorY + 1; i < valorX; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = valorX + 1; i < valorY; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}