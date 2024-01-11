import java.util.Arrays;
import java.util.Scanner;

public class Ej20 {
	
	public static void imprime(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean existe = false;
		int arr[] = new int[1000];
		int v, cont=0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("Introduce el valor a buscar");
		v = sc.nextInt();
		
		Arrays.sort(arr);
		
		imprime(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				cont++;
			}
		}
		
		if(cont==0) {
			System.out.println("El valor " + v + " no se encuentra");
		}else {
			System.out.println("El valor " + v + " se repite " + cont + " veces");
		}
		
	}
}