Algoritmo ejercicio6
	Escribir "Introduce un n�mero"
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
		Escribir "El n�mero ", num, " es perfecto"
	SiNo
		Escribir "El n�mero ", num, " no es perfecto"
	FinSi
	
FinAlgoritmo
