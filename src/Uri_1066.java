/* Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram
 * ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.*/

import java.util.Scanner;

public class Uri_1066 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorPar = 0, valorImpar = 0, valorPositivo = 0, valorNegativo = 0;

        for (int i = 0; i <= 4; i++) {
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                valorPar +=  + 1;
            } else
                valorImpar +=  + 1;

            if (valor != 0) {

                if (valor < 0) {
                    valorNegativo +=  + 1;
                } else
                    valorPositivo +=  + 1;
            }
        }
        sc.nextLine();

        System.out.println(valorPar + " valor(es) par(es)");
        System.out.println(valorImpar + " valor(es) impar(es)");
        System.out.println(valorPositivo + " valor(es) positivo(s)");
        System.out.println(valorNegativo + " valor(es) negativo(s)");

        sc.close();
    }
}
