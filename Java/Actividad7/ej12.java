package Actividad7;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo");
        int dividendo = sc.nextInt();
        int contador=dividendo;
        System.out.println("Introduce el divisor");
        int divisor = sc.nextInt();

        int resultado = 0;

        while (contador>0) {
            resultado++;
            contador-=divisor;
        }

        System.out.println(dividendo+"/"+divisor+"="+resultado);
    }
}
