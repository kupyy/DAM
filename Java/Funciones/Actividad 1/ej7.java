import java.util.Scanner;

public class ej7 {
    public static double calcularIVA(double precioOrig){
        return precioOrig*1.21;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        do {
            System.out.println("Introduce el precio de compra");
            precio = sc.nextDouble();
            System.out.println("El precio con IVA es de " + calcularIVA(precio) + " €");
        } while (precio>=0);
    }
}
