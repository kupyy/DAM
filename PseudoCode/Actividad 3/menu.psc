Algoritmo menu
	Escribir "1-Nombre y apellidos"
	Escribir "2-Dirección"
	Escribir "3-Fecha de nacimiento"
	Escribir "4-Otra información"
	Escribir "Introduce una opción"
	Leer opc
	
	Segun opc Hacer
		1:
			Escribir "Dime tu nombre y tus apellidos:"
			Leer nombre_apellidos
			Escribir "Te llamas ", nombre_apellidos
			
		2:
			Escribir "Dime tu dirección:"
			Leer direccion
			Escribir "Vives en ", direccion
			
		3:
			Escribir "Dime tu fecha de nacimiento"
			Leer fecha_nach
			Escribir "Naciste en ", fecha_nach
			
		4:
			Escribir "Escribe otra info. sobre ti"
			Leer otra_info
			Escribir otra_info
		De Otro Modo:
			Escribir "Error"
	FinSegun
FinAlgoritmo
