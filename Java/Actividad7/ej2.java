package Actividad7;

public class ej2 {
    public static void main(String[] args) {
        int resultado = 0, contador = -30;

        while (contador <= 70) {
            resultado+=contador;
            System.out.println("Valor del contador: " + contador);
            System.out.println("Valor parcial: " + resultado);
            contador++;
        }
    }
}
