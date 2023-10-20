package Actividad3;
import java.util.Scanner;

public class ej1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int precioReal, precioDescuento, porcentajeDescuento;

        System.out.println("Introduce el precio real del artículo");
        precioReal=sc.nextInt();

        System.out.println("Introduce el precio por el que se vendió");
        precioDescuento=sc.nextInt();

        porcentajeDescuento = 100-((precioDescuento*100)/precioReal);
        System.out.println("Se realiza un descuento del " + porcentajeDescuento + "%");
    }
}
