package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int pedir_n() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int n = sc.nextInt();
		return n;
	}
	
	public static int obtener_t(int n) {
		int cont=0;
		
		do {
			cont++;
			n/=10;
		}while(n>0);
		
		return cont;
	}
	
	public static void crear_arr(char arr[], String n) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n.charAt(i);
		}
	}
	
	public static String invertir(String s) {
		String s_aux = "";
		for(int i = 0; i < s.length(); i++) {
			s_aux = s.charAt(i) + s_aux;
			
		}
		
		return s_aux;
	}

	
	public static void mostrar(char arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		int n = pedir_n();
		int tamaño = obtener_t(n);
		
		String n_s = Integer.toString(n);
		
		char arr1[] = new char[tamaño];
		
		
		char arr2[] = new char[tamaño];
		
		crear_arr(arr1, n_s);
		n_s = invertir(n_s);
		

		crear_arr(arr2, n_s);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println(n + " es capicua");
		}else {
			System.out.println(n + " no es capicua");			
		}
		
	}
}