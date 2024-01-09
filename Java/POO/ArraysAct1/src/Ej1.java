import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] = new double[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Introduce un numero:");
			num[i]=sc.nextDouble();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(i == num.length-1) {
				System.out.println(num[i]);
			}else {
				System.out.print(num[i] + ", ");
			}
		}

	}

}
