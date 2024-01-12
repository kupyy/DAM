package ej1;

import java.util.Scanner;

public class Main {
	
	public static void insertar(String arr[], double arr2[]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Introduce el nombre del alumno");
			arr[i] = sc.nextLine();
			do {
				System.out.println("Introduce su nota");
				arr2[i] = sc.nextDouble();				
			}while(arr2[i] < 0 || arr2[i] > 10);
			sc.nextLine();
		}
	}
	
	public static void convertir_notas(double arr[], String arr2[]) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 5) {
				arr2[i] = "suspenso";
			}else if(arr[i] >= 5 && arr[i] < 7) {
				arr2[i] = "bien";
			}else if(arr[i] >= 7 && arr[i] < 9) {
				arr2[i] = "notable";
			}else {
				arr2[i] = "sobresaliente";
			}
		}
	}
	
	public static void mostrar(String nombres[], double notas[], String notas_p[]) {
		for(int i = 0; i <notas.length; i++) {
			System.out.println("Nombre: " + nombres[i] + ", " + notas_p[i] + "(" + notas[i] + ")");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double notas[] = new double[10];
		String nombres[] = new String[10];
		String notas_p[] = new String[10];
		
		insertar(nombres, notas);
		convertir_notas(notas, notas_p);
		mostrar(nombres, notas, notas_p);
		
		
		
	}
}
