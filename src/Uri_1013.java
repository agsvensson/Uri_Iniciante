import java.util.Locale;
import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		int abs = sc.nextInt();	
		
		int maiorAB =  (a + b + Math.abs(a - b)) / 2;
		
		if (maiorAB < abs) {
			System.out.println(abs + " eh o maior");
		} else
			System.out.println(maiorAB + " eh o maior");
		
		sc.close();
	}

}
