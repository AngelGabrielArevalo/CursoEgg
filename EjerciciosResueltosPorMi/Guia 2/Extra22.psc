Algoritmo Extra22
	Definir num, numaleat Como Entero
	numaleat=Aleatorio(1, 10)
	Hacer
		Escribir "Ingrese un n�mero:"
		Leer num
		Si num<numaleat Entonces
			Escribir "El n�mero ingresado es m�s peque�o"
		SiNo
			Si num>numaleat
				Escribir "El n�mero ingresado es mayor"
			FinSi
		FinSi
		
	Mientras Que num<>numaleat
	Escribir "Felicitaciones!! El n�mero era: ", numaleat
FinAlgoritmo
