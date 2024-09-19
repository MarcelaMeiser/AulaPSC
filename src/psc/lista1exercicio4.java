package psc;

import java.util.Scanner;

public class lista1exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, s = 0;
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
        a = x - 1;
        s = x + 1;
		System.out.println("Antecessor: " + a);
		System.out.println("Sucessor: " + s);
		sc.close();
	}
}