Algoritmo Extra19
	Definir num, sum Como Entero
	Definir ingreso Como Caracter
	sum=0
	Hacer
		Escribir "Ingrese un número:"
		Leer num
		sum=sum+num
		Escribir "Desea ingresear otro número -s/S- para si o -n/N- para no:"
		Leer ingreso
	Mientras Que (ingreso<>"n" Y ingreso<>"N")
	Escribir "La sumatoria de los números ingresados es: ", sum
FinAlgoritmo
