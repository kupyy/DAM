import java.util.Scanner;

public class ej6 {

    public static void dibujarTriangulo(char caracter, int lineas){
        for (int i = lineas; i > 0; i--) {
            for(int j = i; j > 0; j--){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char caracter = sc.nextLine().charAt(0);
        System.out.println("Introduce el número de líneas");
        int lineas = sc.nextInt();

        dibujarTriangulo(caracter, lineas);
    }
}
