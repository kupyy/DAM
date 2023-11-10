package Actividad8;
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billCinco=0, billDiez=0, billVeinte=0, billCincuenta=0, billCien=0, billDosc=0, billQuin=0;

        System.out.println("Introduce el dinero");
        int eur = sc.nextInt();

        if((eur%5)!=0){
            System.out.println("Cantidad incorrecta");
        }else{
            //confirmar billete de 5
            if((eur-5)%10==0){
                billCinco++;
                eur-=5;
            }
            
            //Descartar billetes uno a uno empezando desde el mayor posible
            while (eur >= 500) {
                billQuin++;
                eur-=500;
            }
            while (eur >=200) {
                billDosc++;
                eur-=200;
            }
            while (eur >= 100) {
                billCien++;
                eur-=100;
            }
            while(eur >=50){
                billCincuenta++;
                eur-=50;
            }
            while(eur >=20){
                billVeinte++;
                eur-=20;
            }
            while(eur >=10){
                billDiez++;
                eur-=10;
            }
            
            System.out.println("Billetes de 500€: " + billQuin);
            System.out.println("Billetes de 200€: " + billDosc);
            System.out.println("Billetes de 100€: " + billCien);
            System.out.println("Billetes de 50€: " + billCincuenta);
            System.out.println("Billetes de 20€: " + billVeinte);
            System.out.println("Billetes de 10€: " + billDiez);
            System.out.println("Billetes de 5€: " + billCinco);
        }
        

    }
}
