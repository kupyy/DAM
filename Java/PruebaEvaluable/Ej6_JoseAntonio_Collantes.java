import java.util.Scanner;

public class Ej6_JoseAntonio_Collantes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variables de los móviles
		//xiaomi
		double maxXiaomi = Double.MIN_VALUE, minXiaomi = Double.MAX_VALUE, totalXiaomi=0;
		int cantidadXiaomi=0;
		//apple
		double maxApple = Double.MIN_VALUE, minApple = Double.MAX_VALUE, totalApple=0;
		int cantidadApple=0;
		
		//valor de la opción
		int opc=0;
		
		//variable precio para operar con ella
		double precio = 0;
		
		do {
			System.out.println("1-Xiaomi");
			System.out.println("2-Apple");
			System.out.println("0-Salir");
			System.out.println("Elige una opción");
			opc = sc.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("Introduce el precio del móvil");
					precio = sc.nextDouble();
					
					//incremento de la cantidad de móviles y de su precio total
					cantidadXiaomi++;
					totalXiaomi+=precio;
					
					//comparación del precio introducido con los valores mínimos y máximos de cada marca
					if(precio < minXiaomi) {
						minXiaomi = precio;
					}
					if(precio > maxXiaomi) {
						maxXiaomi = precio;
					}
					break;
				case 2:
					System.out.println("Introduce el precio del móvil");
					precio = sc.nextDouble();
					
					//incremento de la cantidad de móviles y de su precio total
					cantidadApple++;
					totalApple+=precio;
					
					//comparación del precio introducido con los valores mínimos y máximos de cada marca
					if(precio < minApple) {
						minApple = precio;
					}
					if(precio > maxApple) {
						maxApple = precio;
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(opc != 0);
		
		//muestra del resultado final
		//cantidad total de móviles
		int totalMoviles = cantidadXiaomi+cantidadApple;
		//xiaomi
		if(cantidadXiaomi == 0) {
			System.out.println("No hay móviles Xiaomi disponibles");
		}else {
			System.out.println("Hay " + cantidadXiaomi + " móviles Xiaomi, son un " + (100*cantidadXiaomi/totalMoviles) + "% del total de los móviles disponibles");
			System.out.println("Su precio medio es de " + totalXiaomi/cantidadXiaomi + "€");
			System.out.println("El móvil más caro de Xiaomi vale " + maxXiaomi + "€ y el más barato vale " + minXiaomi + "€");

		}
		//apple
		if(cantidadApple== 0) {
			System.out.println("No hay móviles Apple disponibles");
		}else {
			System.out.println("Hay " + cantidadApple+ " móviles Apple, son un " + (100*cantidadApple/totalMoviles) + "% del total de los móviles disponibles");
			System.out.println("Su precio medio es de " + totalApple/cantidadApple + "€");
			System.out.println("El móvil más caro de Apple vale " + maxApple + "€ y el más barato vale " + minApple + "€");
		}
	}
}
