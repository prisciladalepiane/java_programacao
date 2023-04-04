package Exemplo1;

import java.util.Scanner;

public class Modulacao {

	public static void main(String[] args) {
	
		String texto = coletarTextoConsole("Informe seu nome:");
		
		texto = coletarTextoConsole("Informe seu sobrenome:");

	}
	
	public static String coletarTextoConsole(String textoExibicao) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(textoExibicao);
		String texto = scanner.nextLine();
		return texto;
	}
	
}
