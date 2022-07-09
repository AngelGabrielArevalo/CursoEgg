Algoritmo Extra14
	Definir dia, mes, anio Como Entero
	Escribir "Ingrese dia, mes y año:"
	Leer dia
	Leer mes
	Leer anio
	diaAnterior(dia, mes, anio)
FinAlgoritmo

SubProceso diaAnterior(dia, mes, anio)
	Si dia>1 Entonces
		Escribir "La fecha del día anterior fue ", dia-1,"/",mes,"/",anio
	SiNo
		Segun mes Hacer
			1:
				Escribir "La fecha del día anterior fue 31/12/",anio
			2:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			3:
				Escribir "La fecha del día anterior fue 28/",mes-1,"/",anio
			4:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			5:
				Escribir "La fecha del día anterior fue 30/",mes-1,"/",anio
			6:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			7:
				Escribir "La fecha del día anterior fue 30/",mes-1,"/",anio
			8:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			9:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			10:
				Escribir "La fecha del día anterior fue 30/",mes-1,"/",anio
			11:
				Escribir "La fecha del día anterior fue 31/",mes-1,"/",anio
			12:
				Escribir "La fecha del día anterior fue 30/",mes-1,"/",anio
		FinSegun
	FinSi
FinSubProceso
	