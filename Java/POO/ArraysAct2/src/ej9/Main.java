package ej9;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro libros[] = new Libro[2];
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
		
		//clasificar
		System.out.println("El libro " + libros[0].getTitulo() + " es de " + libros[1].clasificaLibro(libros[2]));
			
		//popular
		if(libros[1].esPopular(libros[1])) {
			System.out.println("El libro " + libros[1].getTitulo() + " es popular");			
		}else {
			System.out.println("El libro " + libros[1].getTitulo() + " no es popular");
		}
			
		//comparar
			
		//


	}

}
