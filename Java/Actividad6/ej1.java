package Actividad6;
import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    int valorAscii = sc.nextInt();

    if (valorAscii <= 0 || valorAscii > 255) {
        System.out.println("Número no válido");
    }else{
        char[] CaracterAscii = Character.toChars(valorAscii);
        System.out.println(CaracterAscii);
    }
  }
}