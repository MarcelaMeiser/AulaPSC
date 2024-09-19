package psc;

import java.util.Scanner;

public class lista3exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s;
		System.out.print("Digite o valor do saldo: ");
		double x = sc.nextFloat();
		s = x * 1.1;
		System.out.println("O valor do saldo com o reajuste de 1% é igual a: " + s);
		sc.close();
	}
}
