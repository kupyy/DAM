/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int num1, num2, num3;
    
    printf("Introduce el primer número");
    scanf("%d", &num1);
    
    printf("Introduce el segundo número");
    scanf("%d", &num2);
    
    printf("Introduce el tercer número");
    scanf("%d", &num3);
    
    if(num2 < num3 && num2 > num1)
    {
        printf("%d es menor que %d y mayor que %d", num3, num2, num1);
    }
    else
    {
        printf("%d no es menor que %d y mayor que %d", num3, num2, num1);
    }
    
}
