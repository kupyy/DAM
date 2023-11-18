import java.util.Scanner;
public class Ej7_JoseAntonio_Collantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//obtención del número
		System.out.println("Introduce un número");
		int n = sc.nextInt();
		
		//apartado a
		//recorre de 1 a n para cada línea
		for(int i = 1; i <=n; i++) {
			for(int j = 0; j < n; j++) {
				//muestra el valor de i durante n veces mientras está en una línea
				System.out.print(i);
			}
			//salta a la siguiene línea antes de aumentar el valor de i
			System.out.println();
		}
		
		//separador
		System.out.println("Apartado B");
		
		//apartado b
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= n; j++) {
				/*
				 * el valor de j va de 1 a n:
				 * -si es menor que i, pone un espacio, haciendo que estos espacios queden de forma piramidal
				 * -en caso de que no, pondrá el valor de i
				 */
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print(i);
				}
			}
			//salto de línea al final de cada iteración del segundo for
			System.out.println();
		}
		

	}

}
