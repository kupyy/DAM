package ej9;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro libros[] = new Libro[5];
//		Arrays.fill(libros, new Libro());
		
		
		
		for(int i = 0; i < libros.length; i++) {
			libros[i] = new Libro();
			System.out.println("Autor: ");
			libros[i].setAutor(sc.nextLine());
			System.out.println("Titulo: ");
			libros[i].setTitulo(sc.nextLine());
			System.out.println("ISBN: ");
			libros[i].setISBN(sc.nextInt());
			System.out.println("Paginas:");
			libros[i].setN_paginas(sc.nextInt());
			System.out.println("Ventas: ");
			libros[i].setN_ventas(sc.nextInt());
			sc.nextLine();
		}
		
		for(int i = 0; i < libros.length; i++) {
			System.out.print(i + ": ");
			libros[i].mostrar();
		}

	}

}
