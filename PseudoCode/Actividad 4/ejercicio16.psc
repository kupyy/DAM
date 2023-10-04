Algoritmo sin_titulo
	Escribir "Introduce un numero"
	Leer num
	
	sumatorio<-0
	
	Mientras num<>0 Hacer
		sumatorio<-sumatorio+num%10
		num<-trunc(num/10)
	FinMientras
	Escribir "Resultado: ", sumatorio
FinAlgoritmo
