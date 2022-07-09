Algoritmo Ejercicio7
	Definir n Como Entero
	Definir veca, vecb Como Entero
	Escribir "Ingrese la dimensión de los vectores:"
	Leer n
	Dimension veca(n)
	Dimension vecb(n)
	rellenaraleatorio(veca, vecb, n)
	Escribir "Los dos vectores son iguales?: ", soniguales(veca, vecb, n)
FinAlgoritmo

SubProceso rellenaraleatorio(veca, vecb, n)
	Definir i Como Entero
	i=0
	Para i<-0 Hasta n-1 Hacer
		veca(i)=Aleatorio(-100, 100)
		vecb(i)=Aleatorio(-100, 100)
	FinPara
FinSubProceso

Funcion iguales <- soniguales(veca, vecb, n)
	Definir iguales Como Logico
	Definir i Como Entero
	i=0
	Hacer 
		Si veca(i)==vecb(i) Entonces
			iguales=Verdadero
		SiNo
			iguales=Falso
		FinSi
	Mientras Que iguales==Verdadero
FinFuncion
	