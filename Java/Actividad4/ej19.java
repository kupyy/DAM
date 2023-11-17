package Actividad4;
import java.util.Scanner;

public class ej19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String clave = "java", intento = "";
        boolean esCorrecta=false;
        int intentos = 3;

        do {
            System.out.println("Introduce la clave");
            intento = sc.nextLine();
            if(intento.contentEquals(clave)){
                esCorrecta=true;
            }else{
                intentos--;
            }
        } while (!esCorrecta && intentos > 0);

        if(esCorrecta){
            System.out.println("Clave correcta");
        }else{
            System.out.println("Clave incorrecta");
        }
    }
}
