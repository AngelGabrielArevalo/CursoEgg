Algoritmo Extra17
	Definir num, cant Como Entero
	Escribir "Ingrese un número:"
	Leer num
	cant=1
	Si num>=10 Entonces
		Hacer
			cant=cant+1
			num=TRUNC(num/10)
		Mientras Que num>=10
	FinSi
	Escribir "El número ingresado tiene ", cant, " digitos."
FinAlgoritmo
