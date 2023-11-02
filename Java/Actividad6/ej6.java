package Actividad6;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaRes = "";
        String cadenaIns = "";

        do {
            System.out.println("Introduzca una frase");
            cadenaIns = sc.nextLine();

            cadenaRes= cadenaRes + cadenaIns + "\n";
        } while (!cadenaIns.equals(""));
        System.out.println(cadenaRes);
    }
}
