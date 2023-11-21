import java.util.Scanner;

public class ej8 {

    public static double calcPerimetro(double largo, double ancho){
        double perimetro = ((ancho*2) + (largo*2));
        return perimetro;
    }

    public static double calcArea(double largo, double ancho){
        return ancho*largo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo, ancho;
        System.out.println("Introduce el ancho");
        ancho = sc.nextDouble();
        System.out.println("Introduce el largo");
        largo = sc.nextDouble();

        System.out.println("Perimetro: " + calcPerimetro(largo, ancho));
        System.out.println("Area: " + calcArea(largo, ancho));
    }
}
