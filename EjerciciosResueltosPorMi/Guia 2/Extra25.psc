Algoritmo Extra25
	Definir frase, inverfrase Como Caracter
	Definir i Como Entero
	Escribir "Ingrese una cadena;"
	Leer frase
	i=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		Escribir Sin Saltar Subcadena(frase, Longitud(frase)-1-i, Longitud(frase)-1-i), " "
	FinPara
	Escribir ""
FinAlgoritmo
