Algoritmo Ejercicio16
	Definir num, sumando Como Real
	Definir cant Como Entero
	sumando=0
	cant=0
	Escribir "Ingrese una secuencia de numeros (termina cuando ingresa -1):"
	Hacer
		Leer num
		Si num<>-1
			sumando=sumando+num
			cant=cant+1
		FinSi
	Mientras Que num<>-1
	Si cant>0 Entonces
		Escribir "El promedio es: ", sumando/cant
	SiNo
		Escribir "Debe ingresar por lo menos un número."
	FinSi
FinAlgoritmo
