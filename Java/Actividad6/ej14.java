package Actividad6;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        String numString = Integer.toString(num);

        for (int i = 0; i < numString.length(); i++) {
            switch (numString.charAt(i)) {
                case '0':
                    System.out.print("cero");
                    break;
                case '1':
                    System.out.print("uno");
                    break;
                case '2':
                    System.out.print("dos");
                    break;
                case '3':
                    System.out.print("tres");
                    break;
                case '4':
                    System.out.print("cuatro");
                    break;
                case '5':
                    System.out.print("cinco");
                    break;
                case '6':
                    System.out.print("seis");
                    break;
                case '7':
                    System.out.print("siete");
                    break;
                case '8':
                    System.out.print("ocho");
                    break;
                case '9':
                    System.out.print("nueve");
                    break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
