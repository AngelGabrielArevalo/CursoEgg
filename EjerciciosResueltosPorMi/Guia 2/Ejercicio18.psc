Algoritmo Ejercicio18
	Definir num, minimo, maximo, sumando Como Real
	Definir cant Como Entero
	sumando=0
	cant=0
	Escribir "Ingrese un n�mero:"
	Leer num
	minimo=num
	maximo=num
	sumando=num
	cant=1
	Hacer
		Leer num
		Si num<>0 Entonces
			Si num<minimo Entonces
				minimo=num
			FinSi
			Si num>maximo Entonces
				maximo=num
			FinSi
			sumando=sumando+num
			cant=cant+1
		FinSi
	Mientras Que num<>0
	Escribir "El minimo n�mero ingresado es: ", minimo
	Escribir "El maximo n�mero ingresado es: ", maximo
	Escribir "El promedio es: ", sumando/cant
FinAlgoritmo
