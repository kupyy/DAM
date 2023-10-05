Algoritmo validar_hora
	//lee las horas, minutos y segundos por parte del usuario
	Escribir "Introduce las horas"
	leer horas
	Escribir "Introduce los minutos"
	leer minutos
	Escribir "Introduce los segundos"
	leer seg
	
	//compara todas las opciones de introducción de los datos.
	//se deben cumplir todas las condiciones para que la hora sea correcta
	si horas>=0 y horas<=23 y minutos >= 0 y minutos <= 59 y seg>=0 y seg<=59
		Escribir "Hora correcta"
	SiNo
		//si hay una condición que no se cumple, la hora será declarada incorrecta
		Escribir "Hora incorrecta"
	FinSi
	
FinAlgoritmo
	