/* Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu 
 * resultado na vari�vel X. Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem 
 * alguma al�m daquilo que est� sendo especificado e n�o esque�a de imprimir o fim de linha ap�s 
 * o resultado, caso contr�rio, voc� receber� "Presentation Error". */

import java.util.Scanner;


public class Uri_1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, x;
		a = sc.nextInt();
		b = sc.nextInt(); 
		
		x = a + b;
		
		System.out.println("X = " + x);
		
		
		sc.close();

	}

}
