package Aula6;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bolo {
	public String sabor = "morango";
	public String formato;
	public int tamanho;
	private Date dataFabricacao;
	private SimpleDateFormat formatador;
	
	
	public Bolo() {
		this.formatador = new SimpleDateFormat("dd/MM/YYYY");
	}
	
	public String getSabor() {
		return sabor;
	}

	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}



	public int getTamanho() {
		return tamanho;
	}



	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}



	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public String getDataFabricacaoFormatada() {
		return this.formatador.format(this.dataFabricacao);
	}


//	public void setDataFabricacao(Date dataFabricacao) {
//		this.dataFabricacao = dataFabricacao;
//	}

	public void setDataFabricacaoFormatada(String dataFabricacao) {
		try {
			this.dataFabricacao = this.formatador.parse(dataFabricacao);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void baterBolo() {
		System.out.println("O bolo de sabor "+sabor+"está sendo batido");
	}
	
}
