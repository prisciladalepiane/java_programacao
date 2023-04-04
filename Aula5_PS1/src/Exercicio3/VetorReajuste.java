package Exercicio3;
import java.util.Scanner;
/*
 * Programa que le 10 salarios, informe um percentual de reajuste e aplique aos 10 salarios.
 */

public class VetorReajuste {

	public static void main(String[] args) {
		final int QTD_SALARIO=3;
		
		double[] salario = new double[QTD_SALARIO];
		
		for (int i=0;i < QTD_SALARIO; i++) {
			System.out.println("Informe o salario posicao "+ i);
			Scanner scanner = new Scanner(System.in);
			salario[i] = scanner.nextDouble();
		}
		
		System.out.println("Informe o salario percentual de reajuste: ");
		Scanner scanner = new Scanner(System.in);
		double percentualReajuste = scanner.nextDouble();
		
		for (int i=0;i < QTD_SALARIO; i++) {
			salario[i]=salario[i]*(1 + percentualReajuste/100);
		}
		
		for (int i=0;i < QTD_SALARIO; i++) {
			System.out.println("Salario "+ i + ": "+ salario[i]);
		}
		
	}

}
