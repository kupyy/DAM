Algoritmo aumento_anual
	Escribir "Escriba tu salario anual"
	Leer salario_anual
	
	Si salario_anual < 18000 Entonces
		incremento<-5
	SiNo
		Si salario_anual >= 18000 y salario_anual <= 25000 Entonces
			incremento<-3
		SiNo
			incremento<-2
		FinSi
	FinSi
	
	cantidad_incrementada<-(salario_anual/100)*2
	nuevo_salario<-salario_anual+cantidad_incrementada
	
	Escribir "El salario anterior era de ", salario_anual, " euros, el porcentaje de incremento es del ", incremento, "%, que conlleva un total de ", cantidad_incrementada, ", dejando un total de ", nuevo_salario
	
FinAlgoritmo
