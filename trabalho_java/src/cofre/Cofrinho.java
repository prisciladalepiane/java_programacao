package cofre;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

	public void adicionarMoeda(Moeda m) {
		listaMoeda.add(m);
	}
	
	public void removerMoeda(Moeda m) {
		listaMoeda.remove(m);
	}
	
	public void listarMoedas() {
		System.out.println("-------------------");
		for (Moeda m : listaMoeda) {
			System.out.println(m);
		}
		System.out.println("-------------------");
	}
	
	public double totalConvertido(int tipoMoeda) {
		double total = 0;
		
		for (Moeda m : listaMoeda) {
			total += m.converter(tipoMoeda);
		}
		
		return total;
	}
	
	
}
