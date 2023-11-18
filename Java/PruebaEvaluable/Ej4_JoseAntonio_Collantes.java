import java.util.Scanner;
public class Ej4_JoseAntonio_Collantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//introducción del rango
		System.out.println("Introduce el primer número");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int n2 = sc.nextInt();
		
		//declaración del resultado
		int resultado=1;//empieza en 1 ya que será multiplicado
		
		//comprobación del rango
		if((n1<1) || (n2<n1)) {
			System.out.println("Valores no correctos"); //rango no correcto
		}else {//rango correcto
			//bucle que vaya del inicio del rango hasta el final
			while(n1<=n2) {
				//se comprueba que el número sea par y que sea múltiplo de 3
				if((n1%2==0) && (n1%3==0)) {
					resultado*=n1;//si se cumple se multiplicará por la variable resultado
				}
				n1++;
			}
			
			//muestra de resultado
			System.out.println("El resultado es " + resultado);
		}
	}

}
