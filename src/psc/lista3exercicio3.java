package psc;

import java.util.Scanner;

public class lista3exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float distancia = 0, consumo = 0;
		System.out.print("Digite as horas percorridas: ");
		float horas = sc.nextFloat();
		System.out.print("Digite a velocidade média: ");
		float velmedia = sc.nextFloat();
		distancia = horas * velmedia;
		consumo = distancia / 12;
		System.out.println("DISTÂNCIA: " + distancia);
		System.out.println("CONSUMO: R$" + consumo);
		sc.close();
	}
}
