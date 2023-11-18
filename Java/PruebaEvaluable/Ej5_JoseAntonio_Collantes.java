import java.util.Scanner;
import java.lang.Math;

public class Ej5_JoseAntonio_Collantes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//obtención del número
		System.out.println("Introduce un número");
		int n = sc.nextInt();
		
		//obtener cantidad de digitos
		int exp = Integer.toString(n).length();//convierte n a string y obtiene su longitud con la función length
		
		//variable de resultado de la operación y variable auxiliar del número introducido
		int resultado = 0, aux = n;
		
		//cálculo del número
		while(n>0){
			//se agrega la potencia del último dígito del número al resultado
			resultado+=Math.pow(n%10, exp);
			
			//se elimina el último dígito para operar con el siguiente
			n/=10;
		}
		
		//comparación del número introducido con el resultado de la operacion
		if(aux == resultado) {
			System.out.println(aux + " es un número armstrong");
		}else {
			System.out.println(aux + " no es un número armstrong");
		}
	}
}
