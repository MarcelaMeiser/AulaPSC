package psc;

import java.util.Scanner;

public class lista3exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f= 0;
	    System.out.print("Digite a temperatura em graus Celsius: ");
	    float c = sc.nextFloat();
	    f = ((9 * c) + 160) / 5;
	    System.out.println("A temperatura " + c + "º Celsius é igual a " + f + "º Fahrenheit");
	    sc.close();
	}
}
