package Exemplo2;

public class TratamentoErro {

	public static void main(String[] args) {
		
		try {
			String texto = null;
			System.out.println(texto.toUpperCase());
		} catch (NullPointerException erro) {
			System.out.println("Erro porque a variavel é nula");
		}

	}

}
