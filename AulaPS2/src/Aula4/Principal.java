package Aula4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casa casa1 = new Casa(0, null);
		Predio predio1 = new Predio();
		
		casa1.setLogradouro("Sebastiao Regis");
		casa1.setNumeroEndereco(67);
		
		casa1.setTipoDeConstrucao(TipoDeConstrucao.ALVENARIA);
		
		predio1.setLogradouro("Av Beira Rio");
		predio1.setNumeroEndereco(3177);
		predio1.setNomeDoPredio("Chapada Boulevard");
		
		casa1.imprimirEnderecoCompleto();
		predio1.imprimirEnderecoCompleto();
		System.out.println("------------------");
		System.out.println(casa1.getClass());
		System.out.println(casa1.toString());
		
	}

}
