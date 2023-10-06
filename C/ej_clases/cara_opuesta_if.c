/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int cara;
    
    printf("Introduce una cara:\n");
    scanf("%d", &cara);
    
    if(cara==1){
        printf("El lado contrario es 6");
    }
    else if(cara==2){
        printf("El lado contrario es 5");
    }
    else if(cara==3){
        printf("El lado contrario es 4");
    }
    else if(cara==4){
        printf("El lado contrario es 3");
    }
    else if(cara==5){
        printf("El lado contrario es 2");
    }
    else if(cara==6){
        printf("El lado contrario es 1");
    }
    else{
        printf("Lado incorrecto");
    }
}
