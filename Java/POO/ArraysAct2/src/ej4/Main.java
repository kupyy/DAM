package ej4;

public class Main {
	
	public static void mostrar(int n[][]) {
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int cont=1;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]=cont;
				cont++;
			}

		}
		
		mostrar(matriz);

	}

}
