import java.util.Arrays;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int puntos[] = new int[8];
		
		for(int i = 0; i < puntos.length; i++) {
			System.out.println("Introduce la puntuación");
			puntos[i] = sc.nextInt();
		}
		
		Arrays.sort(puntos);
		
		for(int i = puntos.length-1; i >= 0; i--) {
			System.out.print(puntos[i] + " ");
		}

	}

}
