Algoritmo Extra4
	Definir nombre, dia, turno Como Caracter
	Definir canthoras Como Real
	Definir feriado Como Logico
	Escribir "Ingrese su nombre:"
	Leer nombre
	Escribir "Ingrese el dia de la semana: "
	Leer dia
	Escribir "Ingrese turno:"
	Leer turno
	Escribir "Ingrese la cantidad de horas trabajadas:"
	Leer canthoras
	Escribir "El dia ", dia, " fue feriado?"
	Leer feriado
	Escribir "Su joranal es $", jornaldiario(turno, feriado, canthoras)
FinAlgoritmo

Funcion jornal <- jornaldiario(turno, feriado, canthoras)
	Definir jornal Como Real
	Si turno=="diurno" Entonces
		Si feriado Entonces
			jornal=canthoras*90*1.1
		SiNo
			jornal=canthoras*90
		FinSi
	SiNo
		Si feriado Entonces
			jornal=canthoras*125*1.15
		SiNo
			jornal=canthoras*125
		FinSi
	FinSi
FinFuncion
	