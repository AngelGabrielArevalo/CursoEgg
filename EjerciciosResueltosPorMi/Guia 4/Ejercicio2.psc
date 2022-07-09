Algoritmo Ejercicio2
	Definir vec, i, suma, resta, multi Como Entero
	Dimension vec(10)
	i=0
	suma=0
	multi=1
	Escribir "Ingrese 10 valores:"
	Para i<-0 Hasta 9 Hacer
		Leer vec(i)
	FinPara
	i=0
	Para i<-0 Hasta 9 Hacer
		suma=suma+vec(i)
	FinPara
	i=1
	resta=vec(0)
	Para i<-1 Hasta 9 Hacer
		resta=resta-vec(i)
	FinPara
	i=0
	Para i<-0 Hasta 9 Hacer
		multi=multi*vec(i)
	FinPara
	Escribir "La suma de los elementos del vector es ", suma
	Escribir "La resta de los elementos del vector es ", resta
	Escribir "La multiplicación de los elementos del vector es ", multi
	
FinAlgoritmo

