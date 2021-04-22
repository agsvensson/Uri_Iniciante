/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
* Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
* mostrando essas informações. */

import java.util.Scanner;

public class Uri_1072 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int foraIntervalo = 0, dentroIntervalo = 0;
    int numeros = sc.nextInt();

    for (int i = 0; i < numeros; i++) {
        int x = sc.nextInt();
        if (x < 10 || x > 20)  {
            foraIntervalo = foraIntervalo + 1;
        } else {
            dentroIntervalo = dentroIntervalo + 1;
        }

    }

    System.out.println(dentroIntervalo + " in");
    System.out.println(foraIntervalo + " out");

    sc.close();

    }
}
