package ej6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila, col, contP=0, contN=0, contC=0;
		
		System.out.println("Introduce las filas");
		fila = sc.nextInt();
		System.out.println("Introduce las columnas");
		col = sc.nextInt();
		
		int arr[][] = new int[fila][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println("Valor:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 0) {
					contC++;
				}else if(arr[i][j] < 0) {
					contN++;
				}else {
					contP++;
				}
			}
		}
		
		System.out.println("Positivos: " + contP);
		System.out.println("Negativos: " + contN);
		System.out.println("Valores 0: " + contC);
		
	}

}
