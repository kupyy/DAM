Algoritmo descuento_entradas
	
	//Lee el precio de la entrada
	Escribir "Introduce el precio de la entrada"
	leer precio
	
	//Selecci�n de rango de edad del cliente
	Escribir "Introduce tu rango de edad:"
	Escribir "1-Menores de 12 a�os"
	Escribir "2-Adolescentes"
	Escribir "3-J�venes"
	Escribir "4-Entrada general"
	Escribir "5-Mayores de 65 a�os"
	leer opc
	
	//seg�n la edad del cliente, aplica los descuentos necesarios
	Segun opc Hacer
		1:
			precio_final<-precio/100*30
		2:
			precio_final<-precio*100/40
		3:
			precio_final<-precio/2
		4:
			precio_final<-precio
		5:
			precio_final<-precio/2
		De Otro Modo:
			Escribir "Opcion incorrecta"
	FinSegun
	
	Escribir "Tu entrada con el descuento correspondiente pasa a valer, " precio_final, "?"
	
FinAlgoritmo
	