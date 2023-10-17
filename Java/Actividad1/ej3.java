package Actividad1;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args){
        //Escaner para leer por pantalla
        Scanner sc = new Scanner(System.in);
            //Variables
            int edad;
            String nombre, localidad;

            //Codigo
            System.out.println("Introduce tu nombre:");
            nombre = sc.nextLine();

            System.out.println("Introduce tu edad:");
            edad = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Introduce tu localidad:");
            localidad = sc.nextLine();

            System.out.println("Nombre: " + nombre + ". Edad: " + edad + ". Localidad: " + localidad);
    }
}
