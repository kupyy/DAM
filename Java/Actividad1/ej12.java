package Actividad1;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args){
        //Variables
        float num1, num2;
        //Scaner
        Scanner sc = new Scanner(System.in);
        //Menú
        System.out.println("==Menú de operaciones==");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Introduzca una opción:");
        int opc = sc.nextInt();

        switch(opc){
            case 1:
                System.out.println("Introduce un número:");
                num1 = sc.nextFloat();
                System.out.println("Introduce un número:");
                num2 = sc.nextFloat();
                System.out.println("El resultado es " + (num1+num2));
                break;
            case 2:
                System.out.println("Introduce un número:");
                num1 = sc.nextFloat();
                System.out.println("Introduce un número:");
                num2 = sc.nextFloat();
                System.out.println("El resultado es " + (num1-num2));
                break;
            case 3:
                System.out.println("Introduce un número:");
                num1 = sc.nextFloat();
                System.out.println("Introduce un número:");
                num2 = sc.nextFloat();
                System.out.println("El resultado es " + (num1*num2));
                break;
            case 4:
                System.out.println("Introduce un número:");
                num1 = sc.nextFloat();
                System.out.println("Introduce un número:");
                num2 = sc.nextFloat();
                System.out.println("El resultado es " + (num1/num2));
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }
}
