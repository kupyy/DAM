package Actividad3;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mes_in = "";
        int descuento = 15;
        float precio_descuento = 0.0f;
        float precio = 0.0f;

        System.out.println("Introduce el precio de la compra");
        precio = sc.nextFloat();
        sc.nextLine();
        System.out.println("Introduce el mes de la compra");
        mes_in = sc.nextLine();

        if( mes_in.equalsIgnoreCase("Noviembre") ){
            precio_descuento = precio-(descuento*100.0f/precio);
            System.out.println("El precio descontado es de " +precio_descuento+"€");
        }else{
            System.out.println("No hay descuento disponible, se deben pagar "+precio+"€");
        }
    }
}
