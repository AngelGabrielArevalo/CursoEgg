Algoritmo Extra19
	Definir num, sum Como Entero
	Definir ingreso Como Caracter
	sum=0
	Hacer
		Escribir "Ingrese un n�mero:"
		Leer num
		sum=sum+num
		Escribir "Desea ingresear otro n�mero -s/S- para si o -n/N- para no:"
		Leer ingreso
	Mientras Que (ingreso<>"n" Y ingreso<>"N")
	Escribir "La sumatoria de los n�meros ingresados es: ", sum
FinAlgoritmo
