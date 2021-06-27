import java.util.Scanner;

public class Uri_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=0;
        int valorInt = sc.nextInt();
        while (i < 10000) {
            if (i % valorInt == 2) {
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
}
