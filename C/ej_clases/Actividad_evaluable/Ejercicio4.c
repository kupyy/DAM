#include <stdio.h>

int main()
{
    int x, opt, contador;
    x = opt = 0;
    contador = 1;
    
    while(x<1 || x>100){
        printf("Introduce un numero entre 1 y 100\n");
        scanf("%d", &x);
    }
    
    while (opt!=1 && opt !=2){
        printf("\nIntroduce una opcion:\n1.Impares\n2.Pares\n");
        scanf("%d", &opt);
    }

    switch(opt){
        case 1:
            for(contador=1; contador<=x;contador++){
                if(contador%2!=0){
                    printf("%d ", contador);
                }
            }
            break;
        case 2:
            for(contador=1; contador<x;contador++){
                if(contador%2==0){
                    printf("%d ", contador);
                }
            }
            break;
    }
}
