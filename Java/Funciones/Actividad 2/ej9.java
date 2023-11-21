import java.util.Scanner;
import java.lang.Math;

public class ej9 {
    public static boolean calculaPitagoras(int cat1, int cat2, int hip){
        boolean esValido = false;

        if ((Math.pow(cat1, 2) + Math.pow(cat2, 2)) == Math.pow(hip, 2)) {
            esValido = true;
        }

        return esValido;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cat1, cat2, hip;
        System.out.println("Introduce el primer cateto");
        cat1 = sc.nextInt();
        System.out.println("Introduce el segundo cateto");
        cat2 = sc.nextInt();
        System.err.println("Introduce la hipotenusa");
        hip = sc.nextInt();

        if (calculaPitagoras(cat1, cat2, hip)) {
            System.out.println("Es rectángulo");
        }else{
            System.out.println("No es rectángulo");
        }
    }
    
}
