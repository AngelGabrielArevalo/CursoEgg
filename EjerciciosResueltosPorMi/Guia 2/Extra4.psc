Algoritmo Extra4
	Definir horas, nafta Como Real
	Escribir "Ingrese las horas que utilizó el vehículo:"
	Leer horas
	Si horas<=2 Entonces
		Escribir "Total a pagar: $400"
	SiNo
		Escribir "Ingrese la cantidad de nafta gastada:"
		Leer nafta
		Escribir "Total a pagar: $", nafta*40+horas*5.2*60
	FinSi
FinAlgoritmo
