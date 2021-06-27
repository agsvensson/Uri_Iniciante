import java.util.Scanner;

public class Uri_1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int qtdCobaias = 0;
        String tipoCobaia;
        int totalCobaias=0;
        int totalCoelhos=0;
        int totalRatos=0;
        int totalSapos=0;
        double percentCoelhos = 0;
        double percentRatos=0;
        double percentSapos=0;

        numero = sc.nextInt();
        for (int i = 1 ; i <= numero; i++) {
            qtdCobaias = sc.nextInt();
            tipoCobaia = sc.next();

            switch (tipoCobaia.toUpperCase()) {
                case "C":
                totalCoelhos += qtdCobaias;
                    break;

                case "R":
                    totalRatos += qtdCobaias;
                    break;

                case "S":
                    totalSapos += qtdCobaias;
                    break;
            }
            totalCobaias += qtdCobaias;
        }

        percentCoelhos = (double) (totalCoelhos * 100) / (double) (totalCobaias);
        percentRatos = (double) (totalRatos * 100 ) / (double) (totalCobaias);
        percentSapos = (double) (totalSapos * 100) /  (double) (totalCobaias);


        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentSapos);

        sc.close();
    }
}
