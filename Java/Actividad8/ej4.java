package Actividad8;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        int anno = sc.nextInt();

        if ( (anno%400 == 0) || (anno%4 == 0 && anno%100 != 0) ) {
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}
