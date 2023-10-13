Algoritmo ejercicio3
	//Declaración de variables
	salario_bruto_anual<-0
	salario_neto_anual<-0
	salario_neto_mensual<-0
	porc_retencion<-0
	retencion<-0
	
	//Obtención de datos
	Escribir "Introduzca su salario bruto anual"
	Leer salario_bruto_anual
	
	//Valoración de salario 
	si salario_bruto_anual <= 15000 Entonces
		//no se aplica retención, por lo que no es necesario operar con dicha variable
		salario_neto_anual<-salario_bruto_anual
		salario_neto_mensual<-salario_neto_anual/12
	SiNo
		si salario_bruto_anual > 15000 y salario_bruto_anual <= 22000 Entonces
			//retención del 5%
			porc_retencion<-5
			retencion<-salario_bruto_anual/100*porc_retencion
			salario_neto_anual<-salario_bruto_anual-retencion
			salario_neto_mensual<-salario_neto_anual/12
		SiNo
			si salario_bruto_anual > 22000 y salario_bruto_anual <= 35000 Entonces
				//retención del 15%
				porc_retencion<-15
				retencion<-salario_bruto_anual/100*porc_retencion
				salario_neto_anual<-salario_bruto_anual-retencion
				salario_neto_mensual<-salario_neto_anual/12
			SiNo
				//retención del 25%
				porc_retencion<-25
				retencion<-salario_bruto_anual/100*porc_retencion
				salario_neto_anual<-salario_bruto_anual-retencion
				salario_neto_mensual<-salario_neto_anual/12
			FinSi
		FinSi
	FinSi
	
	//Muestra de resultados
	Escribir "El salario bruto anual es de ", salario_bruto_anual, " euros, por lo que tiene una retención del ", porc_retencion, "%(", retencion, " euros), por lo que el salario neto anual es de ", salario_neto_anual, " euros, que en 12 pagas son ", salario_neto_mensual, " euros."
FinAlgoritmo