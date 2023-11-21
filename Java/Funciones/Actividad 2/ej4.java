import java.util.Scanner;

public class ej4 {

    public static double pasaMillas(double km){
        return km/1.60934;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km;
        System.out.println("Introduce los km");
        km = sc.nextDouble();

        System.out.println(km + " km son " + pasaMillas(km) + " millas");
    }    
}
