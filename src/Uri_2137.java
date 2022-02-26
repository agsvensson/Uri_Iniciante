import java.util.Arrays;
import java.util.Scanner;

public class Uri_2137 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ct = 0;

        while (ct <= 1000) {
            int quantidadeCodigo = sc.nextInt();
            String vetor[] = new String[quantidadeCodigo];

            for (int i=0; i < quantidadeCodigo; i++) {
                vetor[i] = sc.next();
            }

            Arrays.sort(vetor);

            for (String ordenados : vetor) {
                System.out.println(ordenados);
            }
          ct++;
        }
        sc.close();
    }
}
