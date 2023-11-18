import java.util.Scanner;

public class ej4 {

    public static int tipoN(int a){
        int tipo = 0;
        if (tipo<0) {
            tipo=-1;
        } else if (tipo > 0) {
            tipo=1;
        }

        return tipo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        int tipoNum = tipoN(n);
        System.out.println(tipoNum);
    }
}
