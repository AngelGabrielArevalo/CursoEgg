Algoritmo Ejercicio10
	Definir n Como Entero
	Escribir "Ingrese la cantidad de los primeros números enteros que desea sumar:"
	Leer n
	Escribir "La suma es: ", sumatoria(n)
FinAlgoritmo

Funcion sum <- sumatoria(n)
	Definir sum Como Entero
	Si n==0 Entonces
		sum=0
	SiNo
		sum=n+sumatoria(n-1)
	FinSi
FinFuncion
	