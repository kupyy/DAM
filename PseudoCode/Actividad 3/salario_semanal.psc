Algoritmo salario_semanal
	Escribir "Escribe las horas trabajadas en la semana"
	Leer horas_semanales
	Escribir "Escribe el salario por hora"
	Leer salario_horas
	
	Si horas_semanales>40 Entonces
		horas_extra<-horas_semanales-40
		salario_extra<-(salario_horas/0.5)*horas_extra
		salario_semana<-40*salario_horas
		
		Escribir "El salario semanal es de ", salario_semana, " euros y un extra de ", salario_extra, " euros por las horas extra."
	SiNo
		salario_semana<-horas_semanales*salario_horas
		
		Escribir "El salario semanal es de ", salario_semana, " euros."
	FinSi
	
	
FinAlgoritmo
