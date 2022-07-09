Algoritmo Ejercicio7
	Definir dias,i Como Entero
	Definir max, min, media Como Real
	Escribir "Ingrese la cantidad de dias que desee analizar:"
	Leer dias
	i=0
	Para i=0 Hasta dias-1 Hacer
		Escribir "Ingrese la temperatura máxima y luego la temperatura minima:"
		Leer max
		Leer min
		mediatemperatura(max, min, media)
		Escribir "La temperatura media es: ", media,"°C"
	FinPara
FinAlgoritmo

SubProceso mediatemperatura(max Por Valor, min Por Valor, media Por Referencia)
		media=(max+min)/2
FinSubProceso
	