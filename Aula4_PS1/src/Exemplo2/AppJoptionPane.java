package Exemplo2;

import javax.swing.*;

public class AppJoptionPane {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Priscila", JOptionPane.QUESTION_MESSAGE);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informar a idade", JOptionPane.WARNING_MESSAGE));
		

		JOptionPane.showMessageDialog(null,"Nome: "+ nome);	
		JOptionPane.showMessageDialog(null,"Idade: "+ idade);	
	}	
}

