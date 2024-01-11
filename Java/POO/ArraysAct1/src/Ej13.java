import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorI, inc, longitud;
		
		System.out.println("Introduce el valor inicial");
		valorI = sc.nextInt();
		System.out.println("Introduce el incremento");
		inc = sc.nextInt();
		System.out.println("Introduce la longitud");
		longitud = sc.nextInt();
		
		int sec[] = new int[] {valorI, inc, longitud};
		
		for(int i = sec[2]; i >0; i--) {
			System.out.print(sec[0] + " ");
			sec[0]+=sec[1];
		}
	}

}
