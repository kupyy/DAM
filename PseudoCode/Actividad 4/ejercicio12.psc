Algoritmo sin_titulo
	contarPos<-0
	contarNeg<-0
	Repetir
		Escribir "Escribe un numero"
		leer num
		
		si num <0 Entonces
			contarNeg<-contarNeg+1
		SiNo
			si num > 0 Entonces
				contarPos<-contarPos+1
			FinSi
		FinSi
	Hasta Que num = 0
	
	Escribir "Numeros positivos: ", contarPos
	Escribir "Numeros negativos: ", contarNeg
FinAlgoritmo
