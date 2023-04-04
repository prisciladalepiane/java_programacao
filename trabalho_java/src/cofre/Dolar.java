package cofre;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);

    }
    
    @Override 
    public void info() {
    	System.out.println("Dolar");
    }
    
    
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return valor + " - Dolar";
	}
	
	@Override
	public double converter(int tipoMoeda) {
		
		double valorConvertido;
		
		if(tipoMoeda == 1) {
			valorConvertido = this.valor*0.19;
			return valorConvertido;
		}
		
		if(tipoMoeda == 2) {
			valorConvertido = this.valor;
			return valorConvertido;
		}
		
		if(tipoMoeda == 3) {
			valorConvertido = this.valor*1.04;
			return valorConvertido;
		}

		return 0;
	}
    
}
