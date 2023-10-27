package Actividad4;
import java.util.Scanner;

public class ej18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double minimo=0, maximo=0, media=0, num=0;
        int totalN=0;
        do {
            System.out.println("Introduce un numero");
            num=sc.nextDouble();
            if(num!=0){
                if(num<minimo || minimo==0){
                    minimo=num;
                }
                if(num>maximo || maximo==0){
                    maximo=num;
                }
                media+=num;
                totalN++;
            }
        } while (num!=0);

        System.out.println("Mayor: " + maximo);
        System.out.println("Menor: " + minimo);
        System.out.println("Media: " + media/totalN);

    }
}
