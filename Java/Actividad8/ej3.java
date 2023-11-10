package Actividad8;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textoIn = "", cadenaFin = "";
        

        do {
            System.out.println("Introduce un carácter");
            textoIn=sc.nextLine();

            cadenaFin = cadenaFin + " " + textoIn;

            //System.out.println(textoIn.charAt(0));

            if (textoIn.charAt(0) == 'a' ||
                textoIn.charAt(0) == 'e' ||
                textoIn.charAt(0) == 'i' ||
                textoIn.charAt(0) == 'o' ||
                textoIn.charAt(0) == 'u') {
                System.out.println("Vocal");
            }else if (textoIn.charAt(0) != ' '){
                System.out.println("No vocal");
            }

        } while (textoIn.charAt(0) != ' ');

        System.out.println(cadenaFin);
    }
}
