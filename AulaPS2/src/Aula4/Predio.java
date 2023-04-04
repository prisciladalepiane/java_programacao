package Aula4;

public class Predio extends Moradia {
	
	private String nomeDoPredio;
	
	public String getNomeDoPredio() {
		return nomeDoPredio;
	}

	public void setNomeDoPredio(String nomeDoPredio) {
		this.nomeDoPredio = nomeDoPredio;
	}

	public String getEnderecoCompleto() {
		return super.getEnderecoCompleto()
				+ " - "
				+ this.getNomeDoPredio();
	}
	
}
