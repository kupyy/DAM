Algoritmo ejercicio11
	
	para x<-1 hasta 100 con paso 1 Hacer
		
		num_divisible<-0
		para i<-1 Hasta x con paso 1 Hacer
			si x%i=0 Entonces
				num_divisible<-num_divisible+1
			FinSi
		FinPara
		
		si num_divisible=2 Entonces
			Escribir x
		FinSi
	FinPara

FinAlgoritmo