Algoritmo Ejercicio11
	Definir operacion Como Caracter
	Definir num1, num2 Como Real
	Escribir "Ingrese un n�mero: "
	Leer num1
	Escribir "Ingrese un n�mero: "
	Leer num2
	Escribir "Ingrese la operac�n que desea realizar -S/s-(SUMA) -R/r-(RESTA)  -M/m-(multiplicaci�n) -D/d-(DIVISI�N):"
	Leer operacion
	Segun operacion Hacer
		"S" O "s":
			Escribir num1+num2
		"R" O "r":
			Escribir num1-num2
		"M" O "m":
			Escribir num1*num2
		"D" O "d":
			Escribir num1/num2
	FinSegun
FinAlgoritmo
