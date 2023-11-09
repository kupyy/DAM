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

            if (textoIn.charAt(textoIn.length()-1) == 'a' ||
                textoIn.charAt(textoIn.length()-1) == 'e' ||
                textoIn.charAt(textoIn.length()-1) == 'i' ||
                textoIn.charAt(textoIn.length()-1) == 'o' ||
                textoIn.charAt(textoIn.length()-1) == 'u') {
                System.out.println("Vocal");
            }else if (textoIn.charAt(textoIn.length()-1) != ' '){
                System.out.println("No vocal");
            }

        } while (textoIn.charAt(0) != ' ');

        System.out.println(cadenaFin);
    }
}
