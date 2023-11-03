package Actividad7;

public class ej1 {
    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 1; i <= 50; i++) {
            resultado+=i;
            System.out.println("Valor del contador: " + i);
            System.out.println("Valor parcial: " + resultado);
        }
        System.out.println(resultado);
    }
}
