/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int num1, num2;
    float result;
    
    printf("Introduce el primer número: ");
    scanf("%d", &num1);
    
    printf("\nIntroduce el segundo número: ");
    scanf("%d", &num2);
    
    if(num1 >= 0 && num2 >= 0){
        result=(num1+num2)/2;
    }
    
    printf("%f", result);
    
}
