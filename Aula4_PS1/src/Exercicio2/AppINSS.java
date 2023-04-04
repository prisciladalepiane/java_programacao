package Exercicio2;

import java.util.Scanner;

public class AppINSS {
	public static void main(String[] args) {
		System.out.println("Informe o salario");
		
		Scanner scanner = new Scanner(System.in);
		
		double salarioBruto = scanner.nextDouble();
		
		double imposto = salarioBruto*(0.11);
		double salarioLiq = salarioBruto - imposto;
		
		System.out.printf("Salario Bruto R$%,.2f\n", salarioBruto);
		System.out.printf("Imposto R$%,.2f\n", imposto);
		System.out.printf("Salario Liquido R$%,.2f\n", salarioLiq);
	}
}
