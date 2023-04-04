package Aula4;

public class Casa extends Moradia {
	
	private TipoDeConstrucao tipoDeConstrucao;
	
	
	
	public TipoDeConstrucao getTipoDeConstrucao() {
		return tipoDeConstrucao;
	}



	public void setTipoDeConstrucao(TipoDeConstrucao tipoDeConstrucao) {
		this.tipoDeConstrucao = tipoDeConstrucao;
	}



	public Casa(int numeroEndereco, String logradouro) {
		this.setNumeroEndereco(numeroEndereco);
		this.setLogradouro(logradouro);
	}

}
