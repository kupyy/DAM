package act5;

import java.util.Arrays;

public class ArrayReales implements Estadisticas{
	private int tamaño;
	private double array[];
	
	public ArrayReales() {
		
	}
	
	public ArrayReales(int tamaño) {
		this.tamaño = tamaño;
		array = new double[tamaño];
		rellenar();
	}
	
	public void rellenar(){
		for(int i = 0; i < tamaño; i++) {
			this.array[i] = 1+Math.random()*100;
		}
	}

	@Override
	public String toString() {
		return "ArrayReales [tamaño=" + tamaño + ", array=" + Arrays.toString(array) + "]";
	}

	@Override
	public double maximo() {
		double res = Double.MIN_VALUE;
		
		for(int i = 0; i < tamaño; i++) {
			if (array[i] > res)  res = array[i];
		}
		
		return res;
	}

	@Override
	public double minimo() {
		double res = Double.MAX_VALUE;
		
		for(int i = 0; i < tamaño; i++) {
			if (array[i] < res)  res = array[i];
		}
		
		return res;
	}

	@Override
	public double sumatorio() {
		double res = 0;
		
		for(int i = 0; i < tamaño; i++) {
			res += array[i];
		}
		
		return res;
	}
	
	
	
}
