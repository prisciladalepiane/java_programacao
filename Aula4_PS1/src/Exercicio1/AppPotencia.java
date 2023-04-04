package Exercicio1;

import java.util.Scanner;

public class AppPotencia {
	public static void main(String[] args) {
		double x,y;
		Scanner scanner = new Scanner(System.in);
		
		// Entrada
		System.out.println("Informe 1º numero inteiro:");
		x = (double) scanner.nextInt();
				
		System.out.println("Informe 1º numero inteiro:");
		y = (double) scanner.nextInt();	
		
		// Processamento 
		
		double potencia = Math.pow(x, y);
		double raiz = Math.pow(x, (1/y));
		
		// Saida
		
		System.out.println("A potencia é:" + potencia);
		System.out.println("A raiz é:" + raiz);
		
	}
}
