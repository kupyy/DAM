import java.util.Scanner;

public class Ej1_JoseAntonio_Collantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Obtención de los elementos de la multiplicación
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		
		int resultado = 0;
		
		//bucle que se repite el equivalente al segundo número introducido
		for(int i = 1; i <= num2; i++) {
			resultado+=num1;//en cada iteración se suma al resultado el valor del primer numero		
		}
		
		//Muestra el resultado por pantalla
		System.out.println("El resultado es " + resultado);
	}

}
