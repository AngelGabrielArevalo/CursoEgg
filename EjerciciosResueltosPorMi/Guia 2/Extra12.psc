Algoritmo Extra12
	Definir condicion Como Caracter
	Definir montototal, sueldoporhora, horas Como Real
	Escribir "Indique la condición de contratación según el siguiente criterio: -a- si es por comisión, -b- si es salario fijo más comisión y -c- si es salario fijo" 
	Leer condicion
	Segun condicion Hacer
		"a":
			Escribir "Ingrese el monto total de ventas realizadas:"
			Leer montototal
			Escribir "El salario del empleado es: $", montototal*0.4
		"b":
			Escribir "Ingrese el precio por hora:"
			Leer sueldoporhora
			Escribir "Ingrese la cantidad de horas trabajadas:"
			Leer horas
			Escribir "Ingrese el monto total de ventas realizadas:"
			Leer montototal
			Si horas<=40 Entonces
				Escribir "El salario del empleado es: $", sueldoporhora*horas+montototal*0.25
			SiNo
				Escribir "El salario del empleado es: $", sueldoporhora*40+montototal*0.25
			FinSi
		"c":
			Escribir "Ingrese el precio por hora:"
			Leer sueldoporhora
			Escribir "Ingrese la cantidad de horas trabajadas:"
			Leer horas
			Si horas<=40 Entonces
				Escribir "El salario del empleado es: $", sueldoporhora*horas
			SiNo
				Escribir "El salario del empleado es: $", sueldoporhora*horas*1.5
			FinSi
	FinSegun
FinAlgoritmo
