import java.util.Scanner;

public class ej7 {

    public static boolean esPrimo(int n){
        boolean primo=true;
        int i = 1;

        while (primo && (i < n)) {
            if (n%i==0 && i!=1) {
                primo=false;
            }
            i++;
        }
        return primo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("introduce un numero");
            n=sc.nextInt();
            if (esPrimo(n) && n > 1) {
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }

            
        } while (n>0);
    }
    
}
