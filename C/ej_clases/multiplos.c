/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int num, aux, i;
    
    printf("Introduce un número: \n");
    scanf("%d", &num);
    
    printf("Introduce el número del que saber sus múltiplos\n");
    scanf("%d", &aux);
    
    for(i=aux; i<=num;i+=aux){
        printf("%d\t", i);
    }
}
