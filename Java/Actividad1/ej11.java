package Actividad1;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Numeros
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();

        //comparacion
        if( num1 == num2 ){
            System.out.println("Los números son iguales, su suma es " + (num1+num2));
        }else if (num1 > num2){
            System.out.println("El primer número(" + num1 + ") es mayor que el segundo(" + num2 + ")");
            System.out.println("Su división es " + (num1/num2));
        }else{
            System.out.println("El segundo número ("+ num2 +") es mayor que el primero(" + num1 + ")");
            System.out.println("Su producto es " + (num1*num2));
        }
    }
}
