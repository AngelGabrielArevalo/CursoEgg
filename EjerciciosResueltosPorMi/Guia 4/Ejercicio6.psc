Algoritmo Ejercicio6
	Definir vec, frase, carac Como Caracter
	Definir i, pos Como Entero
	Dimension vec(20)
	Escribir "Ingrese una frase: (la longitud de la frase debe ser menor o igual a 20)"
	Leer frase
	i=0
	Para i=0 Hasta 19 Hacer
		vec(i)=""
	FinPara
	i=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		vec(i)=Subcadena(frase, i, i)
	FinPara
	Escribir "Ingrese un caracter y una posición:"
	Leer carac
	Leer pos
	i=0
	Si vec(pos)=="" O vec(pos)==" " Entonces
		vec(pos)=carac
		Para i=0 Hasta 19 Hacer
			Escribir Sin Saltar vec(i)," "
		FinPara
	Sino 
		Escribir "La posición ingresada ya está ocupada."
	FinSi
	Escribir ""
FinAlgoritmo
