Algoritmo Ejercicio11
	Definir operacion Como Caracter
	Definir num1, num2 Como Real
	Escribir "Ingrese un número: "
	Leer num1
	Escribir "Ingrese un número: "
	Leer num2
	Escribir "Ingrese la operacón que desea realizar -S/s-(SUMA) -R/r-(RESTA)  -M/m-(multiplicación) -D/d-(DIVISIÓN):"
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
