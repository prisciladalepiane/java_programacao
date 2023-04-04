package cofre;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void info() {
    	System.out.println("Euro");
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
		return valor + " - Euro";
	}
	
	@Override
	public double converter(int tipoMoeda) {
		
		double valorConvertido;
		
		if(tipoMoeda == 1) {
			valorConvertido = this.valor*0.18;
			return valorConvertido;
		}
		
		if(tipoMoeda == 2) {
			valorConvertido = this.valor*0.96d;
			return valorConvertido;
		}
		
		if(tipoMoeda == 3) {
			valorConvertido = this.valor;
			return valorConvertido;
		}

		return 0;
	}
}

