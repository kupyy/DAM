import java.util.Scanner;

public class Ej2_JoseAntonio_Collantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaracion de variables
		int divs1=0, divs2=0;
		//Obtención de los números a comparar
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		
		if(num1<1 || num2<1) {
			System.out.println("Se han introducido números incorrectos");
		}else{
			//obtener la suma de los divisores del primer número
			for(int i = 1;i < num1; i++) {
				if(num1%i==0) {
					divs1+=i;
				}
			}
			//Obtener la suma de los divisores del segundo número
			for(int i = 1;i < num2; i++) {
				if(num2%i==0) {
					divs2+=i;
				}
			}
			
			//compara la suma de los divisores con el número contiguo
			if(num1 == divs2 &&  num2 == divs1) {
				System.out.println("Son amigos");//salida si los números son amigos
			}else {
				System.out.println("No son amigos");//salida si no son amigos
			}
		}
	}

}
