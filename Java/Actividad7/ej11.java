package Actividad7;

public class ej11 {
    public static void main(String[] args) {
        boolean esPrimo=true;
        for (int i = 1; i <= 100; i++) {
            esPrimo = true;
            for (int j = 1; j < i; j++) {
                if (i%j==0 && j!=i && j!=1) {
                    esPrimo=false;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
