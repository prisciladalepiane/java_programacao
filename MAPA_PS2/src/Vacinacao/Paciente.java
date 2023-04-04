package Vacinacao;

import java.util.ArrayList;
import java.time.LocalDate;

public class Paciente extends Pessoa {
	
	public Paciente(String nome, String cpf) {
			this.setNome(nome);
			this.setCpf(cpf);
		}
	
	private ArrayList<String> listaVacinas = new ArrayList<String>();
	
	public void adicionarVacina(String data) {
		listaVacinas.add(data);
	}

	@Override
	public String toString() {
		return	"Paciente: " +
				super.toString() +
				"Datas das vacinas: \n" + listaVacinas ;
	}

	


}
