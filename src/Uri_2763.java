import java.util.Scanner;

public class Uri_2763 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cpf = sc.next();
                cpf.replaceAll("(\\.)(\\.)(\\d{3})(\\d{2})", "$1.$2.$3-$4");
      //  System.out.println(cpf.);


        sc.close();
    }
}
