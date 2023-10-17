package Actividad1;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Notas
        System.out.println("Introduce la primera nota");
        float nota1 = sc.nextFloat();
        System.out.println("Introduce la segunda nota");
        float nota2 = sc.nextFloat();
        System.out.println("Introduce la tercera nota");
        float nota3 = sc.nextFloat();

        float notaMedia = ((nota1+nota2+nota3)/3);

        //decir si se aprueba o no
        if( notaMedia < 5){
            System.out.println("Está suspenso(" + notaMedia + ")");
        }else{
            System.out.println("Está aprobado(" + notaMedia + ")");
        }
    }
}
