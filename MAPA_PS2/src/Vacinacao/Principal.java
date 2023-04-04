package Vacinacao;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  Script para Atividade Avaliativa da disciplina de Programação de sistemas 2
 * 
 * @author Priscila Dalepiane
 *
 */

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Vacina vacina = new Vacina();
		
		String data;
		LocalDate dataAnterior, data2;
		
		String nome = lerDados("Informe o nome do enfermeiro:");
		String cpf = lerDados("Informe o CPF do enfermeiro:");
			
		Enfermeiro enfermeiro = new Enfermeiro(nome, cpf);
		
        menu();
                
        int opcao = input.nextInt();
        
        while(opcao != 3) {
        	
        	switch (opcao){
        		case 1: 
        			
        			String nomePaciente = lerDados("Informe o nome do Paciente:");
        			String cpfPaciente = lerDados("Informe o cpf do Paciente:");
        			Paciente paciente = new Paciente(nomePaciente, cpfPaciente);
        			
        			System.out.printf("1ª dose: ");
        			data = lerDados("Informe a data (dd/mm/yyyy): ");
        			paciente.adicionarVacina(data);
        			dataAnterior = LocalDate.parse(data, format);
        			
        			
        			for(int i=0; i<3; i++) {

        				System.out.printf("%dª dose: ", (i+2));
        				data = lerDados("Informe a data (dd/mm/yyyy): ");
        				paciente.adicionarVacina(data);
        				data2 = LocalDate.parse(data, format);
        				
        				if(!vacina.validaVacina(dataAnterior, data2)){
        					break;
        				}
        				
        				
        				if(vacina.validaVacina(dataAnterior, data2) & i == 2) {
        					
        					System.out.println("O paciente pode receber uma nova dose!");
        					vacina.adicionarPessoa(paciente);        		
        					
        				}
        				
        				dataAnterior = data2;
        			}
     		           			
        			break;
        		case 2: 
        			 vacina.listarVacinas();
        			break;
        		default: System.out.println("Opção invalida.");
        	
        	}
        	menu();
        	opcao = input.nextInt();
        }
	}
	
	public static String lerDados(String texto) {
		Scanner input = new Scanner(System.in);
		System.out.print(texto);
        return input.nextLine();
	}
	
    public static void menu() {
        System.out.println("MENU:");
        System.out.println("1 - Vacinar cidadão");
        System.out.println("2 - Listar Cidadãos");
        System.out.println("3 - Sair");

    }

}
