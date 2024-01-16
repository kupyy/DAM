package ej5;

public class Main {
	
	public static void completar(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[j][i] = (i+1)*(j+1);
			}
		}
	}
	
	public static void mostrar(int n[][]) {
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[0].length; j++) {
				System.out.print(n[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int tablas[][] = new int[10][10];
		
		completar(tablas);
		
		mostrar(tablas);

	}

}
