Algoritmo salarios
	suma_salarios<-0
	menos16k<-0
	menos25k<-0
	mas25k<-0
	salario_total<-0
	total_empleados<-0
	
	Repetir
		Escribir "Introduce el salario del empleado"
		leer salario
		
		si salario > 0 Entonces
			total_empleados<-total_empleados+1
			salario_total<-salario_total+salario
			si salario <= 16000 Entonces
				menos16k<-menos16k+1
			SiNo
				si salario > 16000 y salario <= 25000 Entonces
					menos25k<-menos25k+1
				SiNo
					mas25k<-mas25k+1
				FinSi
			FinSi
		FinSi
	Hasta Que salario<=0
	
	Escribir "El salario medio es de ", salario_total/total_empleados, "?"
	Escribir "El n�mero de empleados que cobran menos de 16000 ? es de ", menos16k, ", es decir, un ", menos16k/total_empleados*100,"%"
	Escribir "El n�mero de empleados que cobran entre 16000? y 25000? es de ", menos25k, ", es decir, un ", menos25k/total_empleados*100, "%"
	Escribir "El n�mero de empleados que cobran m�s de 25000? es de ", mas25k, ", es decir, un ", mas25k/total_empleados*100, "%"
	
FinAlgoritmo
	