package Actividad8;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oct1, oct2, oct3, oct4;

        System.out.println("Introduce el primer octeto");
        oct1 = sc.nextInt();
        System.out.println("Introduce el segundo octeto");
        oct2 = sc.nextInt();
        System.out.println("Introduce el tercero octeto");
        oct3 = sc.nextInt();
        System.out.println("Introduce el cuarto octeto");
        oct4 = sc.nextInt();

        if (oct1 >= 0 && oct1 <= 255 &&
            oct2 >= 0 && oct2 <= 255 &&
            oct3 >= 0 && oct3 <= 255 &&
            oct4 >= 0 && oct4 <= 255) {
            if (oct1 == 127 && oct2 == 0 && oct3 == 0 && oct4 == 1) {
                System.out.println("Es una ip de loopback");
            }else if (oct1 >= 224 && oct1 <= 239) {
                System.out.println("Es de multicast");
            }else{
                System.out.println("Es una ip válida");
            }
        }else{
            System.out.println("La ip no es válida");
        }
    }
}
