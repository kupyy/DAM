/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    
    int a, contador;
    
    contador = 0;

    while(contador<3 || a<=1 && a >=5){
        
        printf("Habitación\n");
        printf("1.Azul\n");
        printf("2.Roja\n");
        printf("3.Verde\n");
        printf("4.Rosa\n");
        printf("5.Grid\n");
        printf("Elija una habitación: ");
    
        scanf("%d", &a);

        printf("\n");

        switch(a){
            case 1:
                printf("La habitación tiene 2 camas y está en la primera planta");
                break;
            case 2:
                printf("La habitación tiene 1 cama y está en la primera planta");
                break;
            case 3:
                printf("La habitación tiene 3 camas y está en la segunda planta");
            break;
            case 4:
                printf("La habitación tiene 2 camas y está en la segunda planta");
                break;
            case 5:
                printf("La habitación tiene 1 cama y está en la tercera pplanta");
                break;
            default:
                printf("La habitación no existe\n");
                contador++;
        }
    }

}

