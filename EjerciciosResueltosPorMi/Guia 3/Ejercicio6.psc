Algoritmo Ejercicio6
	Definir n1, n2 Como Real
	Escribir "Ingrese el primer n�mero: "
	Leer n1
	Escribir "Ingrese el segundo n�mero: "
	Leer n2
	intercambiar(n1, n2)
	Escribir "El primer n�mero ingresado es: ",n1," el segundo n�mero ingresado es: ", n2
FinAlgoritmo

SubProceso intercambiar(n1 Por Referencia, n2 Por Referencia)
	Definir aux Como Real
	aux=n1
	n1=n2
	n2=aux
FinSubProceso
	