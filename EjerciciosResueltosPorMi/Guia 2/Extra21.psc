Algoritmo Extra21
	Definir num, i, sum Como Entero
	Escribir "Ingrese la cantidad de n�meros pares que desea sumar:"
	Leer num
	i=0
	sum=0
	Hacer
		sum=sum+2*(i+1)
		i=i+1
	Mientras Que i<num
	Escribir "La suma de los primeros ", num, " n�memeros pares es: ", sum
FinAlgoritmo
