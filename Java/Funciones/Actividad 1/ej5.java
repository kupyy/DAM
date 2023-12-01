import java.util.Scanner;

public class ej5 {
    public static String valorNum(int n){
        String valor = "cero";

        if(n > 0){
            valor = "positivo";
        }else if( n < 0){
            valor = "negativo";
        }

        return valor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();
        System.out.println(valorNum(num));
    }
}
