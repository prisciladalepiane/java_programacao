package Exemplo3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoErro2 {

	public static void main(String[] args) {
		
		
		try {
			int valor1 = coletarDadosInteiros("Informe o primeiro valor");
			int valor2 = coletarDadosInteiros("Informe o segundo valor");
			int resultado = valor1/valor2;			
			System.out.println(resultado);
		} catch (ArithmeticException erro) {
			System.out.println("Erro: divisao por zero.");
		} catch (InputMismatchException erro) {
			System.out.println("Informe apenas numeros inteiros.");
		}
		
	}

	public static int coletarDadosInteiros(String texto) {
		System.out.println(texto);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
	
	private static int calculoDivisao(int valor1, int valor2) throws ArithmeticException{
		return valor1/valor2;
	}
}
