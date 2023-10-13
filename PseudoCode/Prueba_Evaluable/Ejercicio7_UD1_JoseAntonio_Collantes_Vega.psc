Algoritmo ejercicio7
	
	//Cuenta del 1 al 1000 de 1 en 1
	para i<-1 hasta 1000 con paso 1 Hacer
		//En cada iteración, se establecen las variables a 0 o 1 para poder determinar si es perfecto o no
		sumatorio_divisibles<-0
		j<-1
		
		//Suma los números divisibles de i con la variable auxiliar j
		mientras j<i Hacer
			//si el resto de la operación es 0, se le suma j a la variable sumatorio
			si i%j=0 Entonces
				sumatorio_divisibles<-sumatorio_divisibles+j
			FinSi
			
			//se incrementa j para evitar el bucle infinito
			j<-j+1
		FinMientras
		
		//al final de cada interación del para, se valora que el sumatorio de los números divisibles sea igual a i
		//si es igual, significa que es perfecto, por lo que se muestra por pantalla
		si sumatorio_divisibles=i Entonces
			Escribir sumatorio_divisibles
		FinSi
	FinPara

FinAlgoritmo
