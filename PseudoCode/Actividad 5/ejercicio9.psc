Algoritmo ejercicio9
	
	salario_it<-0
	salario_vtas<-0
	salari_admin<-0
	empleados_it<-0
	empleados_admin<-0
	empleados_vtas<-0
	
	Repetir
		Escribir "Elige un departamento"
		Escribir "1-IT"
		Escribir "2-Administrativo"
		Escribir "3-Ventas"
		Escribir "0-Salir"
		Leer opc
		
		segun opc Hacer
			1:
				Escribir "Introduce el salario del departamento"
				leer salario_it
				Escribir "Introduce el total de empleados"
				leer empleados_it
				
				salario_medio_IT<-salario_it/empleados_it
				
				Escribir "El salario medio del departamento IT es de ", salario_medio_IT
			2:
				Escribir "Introduce el salario del departamento"
				leer salario_admin
				Escribir "Introduce el total de empleados"
				leer empleados_admin
				
				salario_medio_admin<-salario_admin/empleados_admin
				
				Escribir "El salario medio del departamento admnistrativo es de ", salario_medio_admin
			3:
				Escribir "Introduce el salario del departamento"
				leer salario_vtas
				Escribir "Introduce el total de empleados"
				leer empleados_vtas
				
				salario_medio_vtas<-salario_vtas/empleados_vtas
				
				Escribir "El salario medio del departamento admnistrativo es de ", salario_medio_vtas
			0:
				Escribir "Adios"
			De Otro Modo:
				Escribir "Opción incorrecta"
		FinSegun
		
	Hasta Que opc=0
FinAlgoritmo
