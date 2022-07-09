Algoritmo Extra11
	Definir text Como Caracter
	Escribir "Ingrese un texto:"
	Leer text
	convertirEspaciado(text)
FinAlgoritmo

SubProceso convertirEspaciado(text)
	Definir i Como Entero
	i=0
	Para i<-0 Hasta Longitud(text)-1 Hacer
		Escribir Sin Saltar Subcadena(text, i, i)," "
	FinPara
	Escribir ""
FinSubProceso
	