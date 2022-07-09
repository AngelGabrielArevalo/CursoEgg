Algoritmo Extra12
	Definir letra Como Caracter
	Escribir "Ingrese una letra:"
	Leer letra
	estaentre(letra)
FinAlgoritmo

SubProceso estaentre(letra)
	Si letra>="M" Y letra<="T" Entonces
		Escribir "La letra ", letra, " está entre M y T"
	SiNo
		Escribir "La letra ", letra, " NO está entre M y T"
	FinSi
FinSubProceso
	