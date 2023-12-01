import java.util.Scanner;

public class ej5 {

    public static double calcPorc(double precioDesc, double precioInicial){
        double porcentaje = 100-(precioDesc/precioInicial*100);
        return porcentaje;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioInicial, precioDesc;

        System.out.println("Introduce el precio de compra");
        precioInicial = sc.nextDouble();
        System.out.println("Introduce el precio desconado");
        precioDesc = sc.nextDouble();

        System.out.println(calcPorc(precioDesc, precioInicial) + "%");

    }
}
