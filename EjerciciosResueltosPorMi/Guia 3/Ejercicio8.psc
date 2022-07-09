Algoritmo Ejercicio8
	Definir n1, n2, cociente, resto Como Entero
	Escribir "Ingrese el dividendo:"
	Leer n1
	Escribir "Ingrese divisor:"
	Leer n2
	divisionporrestasusecibas(n1, n2, cociente, resto)
	Escribir "El cociente es: ", cociente
	Escribir "El resto es: ", resto
FinAlgoritmo

SubProceso divisionporrestasusecibas(n1, n2, cociente Por Referencia, resto Por Referencia)
	Definir cant Como Entero
	resto=n1-n2
	cant=1
	Mientras resto>n2 Hacer
		resto=resto-n2
		cant=cant+1
	FinMientras
	cociente=cant
FinSubProceso
	