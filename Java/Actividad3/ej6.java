package Actividad3;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final float iva = 21;
        float precioProd, precioFin = 0.0f;

        System.out.println("Introduce el precio del producto");
        precioProd=sc.nextFloat();

        precioFin = precioProd-(precioProd*iva/100);
        System.out.println("El precio final es de "+precioFin+"€");
    }
}
