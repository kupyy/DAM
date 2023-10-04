Algoritmo ejercicio6
	Escribir "Introduce un número"
	Leer num
	suma_div<-0
	
	i<-1
	
	mientras i<num Hacer
		si num%i=0 Entonces
			suma_div<-suma_div+i
			Escribir suma_div
		FinSi
		i<-i+1
	FinMientras

	
	Si suma_div=num Entonces
		Escribir "El número ", num, " es perfecto"
	SiNo
		Escribir "El número ", num, " no es perfecto"
	FinSi
	
FinAlgoritmo
