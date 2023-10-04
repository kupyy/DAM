Algoritmo sin_titulo
	Escribir "Introduce un numero"
	leer num
	
	num_divisible<-0
	
	si num<1 Entonces
		Escribir "El numero ", num " no es válido"
	SiNo
		para i<-1 Hasta num con paso 1 Hacer
			si num%i=0 Entonces
				num_divisible<-num_divisible+1
			FinSi
		FinPara
		
		si num_divisible=2 Entonces
			Escribir "El número ", num, " es primo"
		SiNo
			Escribir "El número ", num, " no es primo"
		FinSi
	FinSi

FinAlgoritmo
