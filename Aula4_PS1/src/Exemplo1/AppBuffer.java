package Exemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppBuffer {

	public static void main(String[] args) {
		

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		try {
			System.out.println("Informe seu nome:");
			String nome = bufferedReader.readLine();
			System.out.println("Informe sua idade:");
			int idade = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("Nome: "+ nome);
			System.out.println("Nome: "+ idade);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
