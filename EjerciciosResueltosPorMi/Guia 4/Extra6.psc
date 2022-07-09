Algoritmo Extra6
	Definir vec, i, n Como Entero
	Escribir "Ingrese la dimensión del vector:"
	Leer n
	Dimension vec(n)
	i=0
	Escribir "Ingrese los elementos del vector:"
	Para i<-0 Hasta n-1 Hacer
		Leer vec(i)
	FinPara
	i=0
	Para i<-0 Hasta n-1 Hacer
		Escribir Sin Saltar vec(i)," "
	FinPara
	Escribir""
	Escribir "La diferencia es ", diferencia(vec, n)
FinAlgoritmo

Funcion dif <- diferencia(vec, n)
	Definir dif Como Entero
	Definir i, menor, mayor Como Entero
	i=0
	Para i<-0 Hasta n-1 Hacer
		Si i==0 Entonces
			menor=vec(i)
			mayor=vec(I)
		SiNo
			Si vec(i)<menor Entonces
				menor=vec(i)
			FinSi
			Si vec(i)>mayor Entonces
				mayor=vec(i)
			FinSi
		FinSi
	FinPara
	dif=mayor-menor
FinFuncion
	