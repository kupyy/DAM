Algoritmo menu
	Escribir "1-Nombre y apellidos"
	Escribir "2-Direcci�n"
	Escribir "3-Fecha de nacimiento"
	Escribir "4-Otra informaci�n"
	Escribir "Introduce una opci�n"
	Leer opc
	
	Segun opc Hacer
		1:
			Escribir "Dime tu nombre y tus apellidos:"
			Leer nombre_apellidos
			Escribir "Te llamas ", nombre_apellidos
			
		2:
			Escribir "Dime tu direcci�n:"
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
