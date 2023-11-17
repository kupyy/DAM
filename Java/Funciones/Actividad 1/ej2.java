import java.util.Scanner;

public class ej2 {

    public static boolean esMayor(int a){
        boolean mayor;

        if (a < 18) {
            mayor = false;
        }else{
            mayor = true;
        }

        return mayor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        boolean mayor = esMayor(edad);

        if (mayor) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }

    }
}
