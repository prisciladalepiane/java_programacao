package Vacinacao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vacina {

	private ArrayList<Pessoa> listaPessoasVacinadas = new ArrayList<Pessoa>();
	
	public void adicionarPessoa(Pessoa p) {
		listaPessoasVacinadas.add(p);
	}
	
	public boolean validaVacina(LocalDate data_anterior, LocalDate data_vacina) {
	       if ((data_anterior.plusMonths(4)).isBefore(data_vacina)) {
	    	   return true;
	        } else {
	        	System.out.println( "Não é possivel vacinar esse cidadão.");
	           return false;
	        }
		} 
	
	public void listarVacinas() {
		System.out.println("-------------------");
		
		for (Pessoa p : listaPessoasVacinadas) {
			 System.out.println(p);
		}
		System.out.println("-------------------");
	}
	
}
