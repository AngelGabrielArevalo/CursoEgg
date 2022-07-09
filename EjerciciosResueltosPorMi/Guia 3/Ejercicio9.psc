Algoritmo Ejercicio9
	Definir frase, frasecod, letra Como Caracter
	Escribir "Ingrese una secuencia de caracteeres, cuando desee terminarla ingrese un punto:"
	Leer letra
	frase=""
	Mientras letra<>"." Hacer
		frase=Concatenar(frase, letra)
		Leer letra
	FinMientras
	codificacion(frase, frasecod)
	Escribir frasecod
FinAlgoritmo

SubProceso codificacion(frase, frasecod Por Referencia)
	Definir i Como Entero
	frasecod=""
	i=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		Segun Subcadena(frase, i, i) Hacer
			"a":
				frasecod=Concatenar(frasecod, "@")
			"e":
				frasecod=Concatenar(frasecod, "#")
			"i":
				frasecod=Concatenar(frasecod, "$")
			"o":
				frasecod=Concatenar(frasecod, "%")
			"u":
				frasecod=Concatenar(frasecod, "*")
			De Otro Modo:
				frasecod=Concatenar(frasecod, Subcadena(frase, i, i))
		FinSegun
	FinPara
FinSubProceso
	