/* Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre
esta informação */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1065 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int somaPares = 0;

        for (int i = 1; i <= 5; i++) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                somaPares = somaPares + 1;
            }
        }

        sc.nextLine();
        System.out.println(somaPares + " valores pares");
        sc.close();
    }
}
