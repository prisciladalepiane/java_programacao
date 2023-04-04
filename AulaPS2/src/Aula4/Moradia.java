package Aula4;

public class Moradia {
	
	int numeroEndereco;
	String logradouro;
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getEnderecoCompleto() {
		return this.getLogradouro() 
				+ " "
				+ this.getNumeroEndereco();
	}
	
	public void imprimirEnderecoCompleto() {
		System.out.println(getEnderecoCompleto());
	}
	@Override
	public String toString() {
		return "Moradia [numeroEndereco=" + numeroEndereco + ", logradouro=" + logradouro + "]";
	}
	
	
	
}
