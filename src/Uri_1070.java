/* Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha,
 inclusive o X ser for o caso. */

import java.util.Scanner;

public class Uri_1070 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if (X % 2 != 0) {
            System.out.println(X);
            System.out.println(X + 2);
            System.out.println(X + 4);
            System.out.println(X + 6);
            System.out.println(X + 8);
            System.out.println(X + 10);
        } else {
            System.out.println(X + 1);
            System.out.println(X + 3);
            System.out.println(X + 5);
            System.out.println(X + 7);
            System.out.println(X + 9);
            System.out.println(X + 11);
        }
        sc.close();

    }
}
