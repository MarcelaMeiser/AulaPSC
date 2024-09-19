package psc;

import java.util.Scanner;

public class lista3exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario = 0, desconto = 0, salarioLiquido = 0;
		System.out.print("VALOR DA HORA POR AULA: ");
		float valor = sc.nextFloat();
		System.out.print("NÚMERO DE AULAS DADAS: ");
		int quant = sc.nextInt();
		System.out.print("DESCONTO DO INSS EM %: ");
		float inss = sc.nextFloat();
		
		salario = valor * (float) quant;
		desconto = salario * (inss / 100);
		salarioLiquido = salario - desconto;
		
		System.out.println("SALÁRIO LÍQUIDO: " + salarioLiquido);
		sc.close();
	}
}