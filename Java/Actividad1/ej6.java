package Actividad1;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variables
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tus apellidos");
        String apellidos = sc.nextLine();

        String nombreCompleto = (nombre+" "+apellidos);

        System.out.println(nombreCompleto);
    }
}
