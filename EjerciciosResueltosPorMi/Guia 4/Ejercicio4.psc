Algoritmo Ejercicio4
	Definir vec, n, i Como Entero
	Escribir "Ingrese la dimensión del vector:"
	Leer n
	Dimension vec(n)
	i=0
	Escribir "Ingrese los elementos del vector:"
	Para i<-0 Hasta n-1 Hacer
		Leer vec(i)
	FinPara
	Escribir "El elemento de mayor valor es: ", mayorelemento(vec, n)
FinAlgoritmo

Funcion mayor <- mayorelemento(vector, tamanio)
	Definir mayor, i Como Entero
	i=0
	Para i<-0 Hasta tamanio-1 Hacer
		Si i==0 Entonces
			mayor=vector(i)
		SiNo
			Si mayor<vector(i) Entonces
				mayor=vector(i)
			FinSi
		FinSi
	FinPara
FinFuncion
