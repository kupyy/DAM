import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] =new double[10];
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Introduce numero");
			num[i]=sc.nextDouble();
		}
		
		
		//obtener mayor y menor
		for(int i = 0; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println("Valor máximo: " + max);
		System.out.println("Valor minimo: " + min);
	}
}
