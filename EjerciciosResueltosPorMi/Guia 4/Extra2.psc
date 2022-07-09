Algoritmo Extra2
	Definir vec, i, n Como Entero
	Definir prom Como Real
	Escribir "Ingrese la dimensión del vector:"
	Leer n
	Dimension vec(n)
	i=0
	prom=0
	Escribir "Ingrese los valores del vector:"
	Para i<-0 Hasta n-1 Hacer
		Leer vec(i)
		prom=prom+vec(i)
	FinPara
	i=0
	Para i<-0 Hasta n-1 Hacer
		Escribir Sin Saltar vec(i)," "
	FinPara
	Escribir ""
	Escribir "El promedio de los elementos del vector es ",prom/n
FinAlgoritmo

