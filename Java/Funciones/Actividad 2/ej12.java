import java.util.Scanner;
import java.lang.Math;

public class ej12 {

    public static void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("1- circunferência");
        System.out.println("2- área");
        System.out.println("3- volume");
        System.out.println("4- todos");
        System.out.println("Insira uma opçãos");
        opc = sc.nextInt();

        double r=0;
        if (opc >=1 && opc<=4) {
            r = pideRadio();
        }
        switch (opc) {
            case 1:
                System.out.println(circunferencia(r));
                break;
            case 2:
                System.out.println(area(r));
                break;
            case 3:
                System.out.println(volumen(r));
                break;
            case 4:
                System.out.println("Circunferencia: " + circunferencia(r));
                System.out.println("Area: " + area(r));
                System.out.println("Volumen: " + volumen(r));
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    public static double pideRadio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        double r = sc.nextDouble();
        return r;
    }

    public static double circunferencia(double r){
        return 2*Math.PI*r;
    }

    public static double area(double r){
        return Math.PI*Math.pow(r, 2);
    }

    public static double volumen(double r){
        return 4/3*Math.PI*Math.pow(r, 3);
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}
