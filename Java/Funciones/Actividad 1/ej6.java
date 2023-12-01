import java.util.Scanner;
public class ej6 {
    public static double conversorKM(int millas){
        double km;

        km = millas*1.60934;

        return km;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las millas");
        int millas = sc.nextInt();
        System.out.println(millas + " millas son " + conversorKM(millas) + " km.");
    }
}
