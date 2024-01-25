package act1;

public class Hora {
	private int hora;
	private int minuto;
	
	public Hora() {
		
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}


	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getMinuto() {
		return minuto;
	}



	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}



	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
}
