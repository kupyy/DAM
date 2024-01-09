import java.util.Scanner;

public class Ej12 {
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
		int num[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		String opc = "";
		
		boolean mantener = true;
		
		do {
			System.out.println("A - Mostrar valores");
			System.out.println("B - Introducir valor");
			System.out.println("C - Salir");
			System.out.println("Introduce opcion:");
			opc = sc.nextLine();
			switch(opc) {
				case "a":
					imprime(num);
					break;
				case "b":
					int a, b;
					System.out.println("Introduce el valor a introducir");
					a = sc.nextInt();
					System.out.println("Indica la posición");
					b = sc.nextInt();
					
					if( b >= 0 && b <10 ) {
						num[b] = a;
					}else {
						System.err.println("Operación no válida");
					}
					
					break;
				case "c":
					mantener = false;
					break;
			}
		}while( mantener );

	}

}
