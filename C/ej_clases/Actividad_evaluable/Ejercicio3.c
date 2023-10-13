#include <stdio.h>

int main()
{
    int x, contador;
    x = 0;
    contador = 1;
    
    while(x<1 || x>100){
        printf("Introduce un numero entre 1 y 100\n");
        scanf("%d", &x);
    }

    while (contador<x){
        if(contador%2!=0){
            printf("%d ", contador);
        }
        contador++;
    }

}

