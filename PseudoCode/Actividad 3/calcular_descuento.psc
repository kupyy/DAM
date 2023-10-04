Algoritmo calcular_descuento
	Escribir "Escribe un importe"
	Leer importe
	
	Escribir "Escribe un mes"
	Leer mes
	
	Si mes="noviembre" Entonces
		precio_final<-(importe/100)*85
		
		Escribir "Se cobrarán ", precio_final, " euros"
	SiNo
		Escribir "Se cobrarán ", importe, " euros"
	FinSi
FinAlgoritmo
