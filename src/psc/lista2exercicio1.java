package psc;

import java.util.Scanner;

public class lista2exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma dessas opções: ");
		System.out.println("Digite 1 para calcular a área do retângulo;");
		System.out.println("Digite 2 para calcular a área do triângulo;");
		System.out.println("Digite 3 para calcular a área do quadrado;");
		System.out.print("OPÇÃO ESCOLHIDA: ");
		int x = sc.nextInt();
		switch (x)
		    {
		        case 1:
		            {
		                float b = 0, h = 0, area = 0;
		                System.out.print("Digite a base do retângulo: ");
		                b = sc.nextFloat();
		                System.out.print("Digite a altura do retângulo: ");
		                h = sc.nextFloat();
		                area = b * h;
		                System.out.println("A área do retângulo é igual a: " + area);
		                break;
		            }
		        case 2:
		            {
		                float b = 0, h = 0, area = 0;
		                System.out.print("Digite a base do triângulo: ");
		                b = sc.nextFloat();
		                System.out.print("Digite a altura do triângulo: ");
		                h = sc.nextFloat();
		                area = (float)(b * h) / 2;
		                System.out.println("A área do retângulo é igual a: " + area);
		                break;
		            }
		        case 3:
		            {
		                float l = 0, area = 0;
		                System.out.print("Digite o lado do quadrado: ");
		                l = sc.nextFloat();
		                area = l * l;
		                System.out.println("A área do quadrado é igual a: " + area);
		                break;
		                
		            }
		    }
	    sc.close();
	}
}