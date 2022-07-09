Algoritmo Extra13
	Definir altura Como Entero
	Escribir "Ingrese la altura de la escalera:"
	Leer altura
	escalera(altura)
FinAlgoritmo

SubProceso escalera(n)
	Definir i Como Entero
	Definir text Como Caracter
	text=""
	i=0
	Para i<-0 Hasta n-1 Hacer
		text=concatenar(text, ConvertirATexto(i+1))
		Escribir text
	FinPara
FinSubProceso
	