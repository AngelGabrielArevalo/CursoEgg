Algoritmo Extra8
	Definir cant Como Entero
	Escribir "Ingrese la cantidad de llantas que desea comprar:"
	Leer cant
	Si cant<5 Entonces
		Escribir "El precio de cada llanta es de: $3000"
		Escribir "El precio total es de: $", cant*3000
	SiNo
		Si cant<=10 Entonces
			Escribir "El precio de cada llanta es de: $2500"
			Escribir "El precio total es de: $", cant*2500
		SiNo
			Escribir "El precio de cada llanta es de: $2000"
			Escribir "El precio total es de: $", cant*2000
		FinSi
	FinSi
FinAlgoritmo
