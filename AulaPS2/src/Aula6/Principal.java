package Aula6;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		// *  Exemplos de passagens de parametros por valor e eferencia 
		
		Bolo valorInicial = new Bolo();
		int numeroInicial = 10;
		
		System.out.println("O numero inicial e:" + numeroInicial);
		trocaNumero(numeroInicial);
		System.out.println("O numero depois e:" + numeroInicial);
		
		valorInicial.sabor = "chocolate";
		System.out.println("O sabor e:" + valorInicial.sabor);
		
		trocaValor(valorInicial);
		
		// Trabalhando com datas
		
		Bolo bolo = new Bolo();
		
//		bolo.setDataFabricacao(new Date());
		
		System.out.println("Data de fabricacao: " + bolo.getDataFabricacao());
		System.out.println("Data de fabricacao: " 
		+ bolo.getDataFabricacaoFormatada());

	}

	public static void trocaValor(Bolo parametro) {
		parametro.sabor = "Morango";
	}
	
	public static void trocaNumero(int parametro) {
		parametro = 20;
	}
}
