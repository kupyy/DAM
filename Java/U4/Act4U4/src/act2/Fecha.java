package act2;

import java.util.Calendar;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	
	
	@Override
	public String toString() {
		String str = "";
		
		
		if(dia < 10) {
			str += "0" + dia;
		}else {
			str += dia;
		}
		
		if(mes < 10) {
			str += "-" + "0" + mes;
		}else {
			str += "-" + mes;
		}
		
		str += "-" + año;
		return str;
		}


	public Fecha() {
		Calendar hoy = Calendar.getInstance();
		this.dia = hoy.get(Calendar.DAY_OF_MONTH);
		this.mes = hoy.get(Calendar.MONTH)+1;
		this.año = hoy.get(Calendar.YEAR);
	}
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		
		if(!fechaCorrecta()) {
			Calendar hoy = Calendar.getInstance();
			this.dia = hoy.get(Calendar.DAY_OF_MONTH);
			this.mes = hoy.get(Calendar.MONTH)+1;
			this.año = hoy.get(Calendar.YEAR);
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	private boolean esBisiesto() {
		return ((año%4==0&&año%100!=0) || año%400==0);
	}
	
	public boolean fechaCorrecta() {
		boolean esCorrecta = true;
		
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 1) {
			esCorrecta = false;
		}else {
			switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dia > 31) {
					esCorrecta = false;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia>30) {
					esCorrecta = false;
				}
				break;
			case 2:
				if( esBisiesto() && dia > 29 || !esBisiesto() && dia > 28) {
					esCorrecta = false;
				}
				break;
			default:
				esCorrecta = false;
			}
		}
		
		return esCorrecta;
	}
	
	public void diaSiguiente() {
		dia++;
		
		if(!fechaCorrecta()) {
			dia = 1;
			mes++;
		}
		
		if(!fechaCorrecta()) {
			mes = 1;
			año++;
		}
		
	}
	
	public boolean esMayorQue(Fecha f) {
		boolean esMayor = true;
		
		if(f.año > this.año) {
			esMayor = false;
		}else if(f.mes > this.mes) {
			esMayor = false;
		}else if(f.dia > this.dia) {
			esMayor = false;
		}
		
		return esMayor;
		
	}
	
	
}
