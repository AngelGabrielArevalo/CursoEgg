Algoritmo Extra3
	Definir veca Como Caracter
	Definir vecb, n, i Como Entero
	Escribir "Ingrese la dimensión de los vectores:"
	Leer n
	Dimension veca(n)
	Dimension vecb(n)
	Escribir "Ingrese los nombres a guardar en el vector:"
	i=0
	Para i<-0 Hasta n-1 Hacer
		Leer veca(i)
		vecb(i)=Longitud(veca(i))
	FinPara
	i=0
	Para i<-0 Hasta n-1 Hacer
		Escribir Sin Saltar veca(i)," ",vecb(i),"   "
	FinPara
	Escribir ""
FinAlgoritmo

