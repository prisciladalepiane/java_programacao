package Exemplo1;
import javax.swing.*;
/*
 * Calcular as notas de um usuario
 */

public class VetorMedia {

	public static void main(String[] args) {
		
		String qntNotasString = JOptionPane.showInputDialog("Quantas notas possuem");
		int qntNotas = Integer.parseInt(qntNotasString);
		
		double[] notas = new double[qntNotas];
		
		double soma = 0;
		for(int i = 0; i< qntNotas; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota n "+ i+1));
			soma += notas[i];
		}
		
		double media = soma/qntNotas;
		
		JOptionPane.showMessageDialog(null,  "A media é:" + media);
		
	}

}
