import java.util.Scanner;

public class ej3 {

    public static int numMenor(int a, int b){
        int menor;

        if (a > b) {
            menor = b;
        } else {
            menor = a;
        }

        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = sc.nextInt();

        int menor = numMenor(n1, n2);
        System.out.println("Numero menor: " + menor);
    }
}
