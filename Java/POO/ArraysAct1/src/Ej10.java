import java.util.Scanner;

public class Ej10 {

	public static void pide(double arr[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Introduce la altura: ");
			arr[i]=sc.nextDouble();
		}

	}
	
	public static void imprime(double arr[]) {
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
		System.out.println("Introduce la cantidad de personas");
		int n = sc.nextInt();
		double altura[] = new double[n];
		
		double alturaMax = Double.MIN_VALUE, alturaMin = Double.MAX_VALUE, alturaMed=0;
		
		pide(altura);
		
		for(int i = 0; i < altura.length; i++) {
			if(altura[i] > alturaMax) {
				alturaMax = altura[i];
			}
			if(altura[i] < alturaMin) {
				alturaMin = altura[i];
			}
			
			alturaMed+=altura[i];
		}
		
		alturaMed/=altura.length;
		
		System.out.println("Altura máxima:" + alturaMax);
		System.out.println("Altura mínima:" + alturaMin);
		System.out.println("Altura media:" + alturaMed);

	}

}
