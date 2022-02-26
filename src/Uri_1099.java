import java.util.Scanner;

public class Uri_1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeCts = sc.nextInt();
        int numeroX = 0;
        int numeroY = 0;
        int soma = 0;

        for (int cont = 0; cont <= quantidadeCts; cont++) {
            numeroX = sc.nextInt();
            numeroY = sc.nextInt();
            if ((numeroX + numeroY) % 2 == 0) {
                soma = numeroX + numeroY;
                System.out.println(soma);
            }
        }
    }
}
