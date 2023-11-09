package Actividad8;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los kilómetros");
        int km = sc.nextInt();

        double precio = km*0.1;

        if (km > 500 && km < 1000) {
            precio*=0.7;
        }else if (km > 1000) {
            precio*=0.6;
        }

        System.out.println("El precio del billete es de "+precio+"€");
    }
}
