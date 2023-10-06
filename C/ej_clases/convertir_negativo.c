/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int
main ()
{
  float num;

  printf ("Introduce un nC:mero: ");
  scanf ("%f", &num);

  if (num < 0)
    {
      num = num * -1;
    }

  printf ("El nC:mero en positivo es %f", num);
}
