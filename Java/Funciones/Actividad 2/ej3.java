import java.util.Scanner;

public class ej3 {

    public static void tablaMult(int n){
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "x"+ i +"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número");
        num = sc.nextInt();

        tablaMult(num);
    }    
}
