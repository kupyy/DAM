package ej3;

import java.util.Scanner;

public class Main {
	
	public static String pedir_dni() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dni");
		return sc.nextLine();
	}
	
	public static String obtener_letra(String s) {
		return  Character.toString(s.charAt(8));
	}
	
	public static int obtener_num(String s) {
		s= s.substring(0, 8);
		return Integer.parseInt(s);
	}
	
	public static int obtener_pos(int n) {
		return n%23;
	}
	
	public static boolean comprobar(String arr[], String s, int index) {
		return s.equalsIgnoreCase(arr[index]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String letras[] = new String[] {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		String dni = pedir_dni();
		String letra = obtener_letra(dni);
		int num = obtener_num(dni);
		int index = obtener_pos(num);
		
		
		System.out.println(comprobar(letras, letra, index));
	}

}
