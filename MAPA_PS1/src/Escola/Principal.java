package Escola;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Script para MAPA da disciplina de Programação de sistemas 1
 * 
 * @author Priscila Dalepiane
 *
 */

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		int qtdProvas = 3;

		System.out.print("Informe a quantidade de alunos: ");
		try {
			int qtdAlunos = scanner.nextInt();			
			String matricula[] = new String[qtdAlunos];
			String nome[] = new String[qtdAlunos];
			double nota[][] = new double[qtdAlunos][qtdProvas];
			int qtdPresenca[] = new int[qtdAlunos];
			double percentualPresenca[] = new double[qtdAlunos];
			double mediaNotas[] = new double[qtdAlunos];
			
			// Leitura dos dados do aluno
			for(int i = 0; i<qtdAlunos; i++) {
				
				// Leitura da matricula e do nome do aluno
				try {
				System.out.printf("Informe a matricula do aluno %d: ", i + 1);
				matricula[i] = bufferedReader.readLine();
					System.out.printf("Informe o nome do aluno %d: ", i + 1);
					nome[i] = bufferedReader.readLine();
					
				} catch (IOException e) { 
					e.printStackTrace(); 
				}
				
				// Leitura das notas da prova do aluno		
				for(int j = 0; j < qtdProvas; j++) {
					System.out.printf("Informe a nota %d de %s: ", j + 1, nome[i]);
					nota[i][j] = scanner.nextInt();
				}
				
				// Leitura da quantidade de presenca do aluno
				System.out.printf("Informe a quantidade de presenca de %s: ", nome[i]);
				qtdPresenca[i] = scanner.nextInt();			
			}
			
			// Calculo da media e da porcentagem de presenca
			for(int i = 0; i<qtdAlunos; i++) {
				
				percentualPresenca[i] = qtdPresenca[i]/60f*100f;
				
				double soma = 0;
				for(int j = 0; j < qtdProvas; j++) {
					soma += nota[i][j];
				}
				mediaNotas[i] = soma/qtdProvas;
				
			}
			
			// Saida de dados
			System.out.println("------------------------------------------------------------------------------");
			for(int i = 0; i<qtdAlunos; i++) {
				
				System.out.printf("%s: Media = %.2f / Presenca = %5.2f%% \n",
						nome[i],
						mediaNotas[i],
						percentualPresenca[i]);
			
			}
			System.out.println("------------------------------------------------------------------------------");
			
		} catch ( InputMismatchException erro ) {
			
			System.out.print("Informe apenas numeros inteiros ");
			
		}		
		
	}
}
