Algoritmo Extra5
	Definir n Como Entero
	Escribir "Ingrese un número:"
	Leer n
	Escribir "La suma de los digitos del número ingresado es: ", sumadigitos(n)
FinAlgoritmo

Funcion suma <- sumadigitos(n)
	Definir suma, i Como Entero
	Definir caden Como Caracter
	suma=0
	i=0
	caden=ConvertirATexto(n)

	Para i<-0 Hasta Longitud(caden)-1 Hacer
		suma=suma+ConvertirANumero(Subcadena(caden, i, i))

	FinPara
FinFuncion
