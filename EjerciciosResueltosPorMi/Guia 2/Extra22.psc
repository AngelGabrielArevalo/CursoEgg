Algoritmo Extra22
	Definir num, numaleat Como Entero
	numaleat=Aleatorio(1, 10)
	Hacer
		Escribir "Ingrese un número:"
		Leer num
		Si num<numaleat Entonces
			Escribir "El número ingresado es más pequeño"
		SiNo
			Si num>numaleat
				Escribir "El número ingresado es mayor"
			FinSi
		FinSi
		
	Mientras Que num<>numaleat
	Escribir "Felicitaciones!! El número era: ", numaleat
FinAlgoritmo
