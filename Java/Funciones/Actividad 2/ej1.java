import java.util.Scanner;

public class ej1 {

    public static int devuelveMayor(int num1, int num2){
        int mayor = num1;
        if (num2 > num1) {
            mayor = num2;
        }

        return mayor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        n3 = sc.nextInt();

        int mayor = n1;
        if (devuelveMayor(n2, n3) > n1) {
            mayor = devuelveMayor(n2, n3);
        }

        System.out.println("El número mayor es " + mayor);
    }
}
